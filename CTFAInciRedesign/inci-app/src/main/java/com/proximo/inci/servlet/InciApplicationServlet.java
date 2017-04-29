/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.servlet;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import com.google.gwt.thirdparty.guava.common.io.CharStreams;
import com.vaadin.terminal.gwt.server.ApplicationServlet;

@SuppressWarnings("serial")
public class InciApplicationServlet extends ApplicationServlet {
	
	@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        if (getRequestType(request) == RequestType.UIDL)
        {
            request = new CorrectInvalidIntegerValues(request);
        }
        super.service(request, response);
     }
}


class CorrectInvalidIntegerValues extends HttpServletRequestWrapper
{
    private final String body;

    public static final String GROUP_SEPARATOR = "\u001d";
    public static final String RECORD_SEPARATOR = "\u001e";
    public static final String UNIT_SEPARATOR = "\u001f";

    public static String truncateFloatingPointValuesInIntegerFields(String string)
    {
        String regex = "([" + GROUP_SEPARATOR + RECORD_SEPARATOR + "][0-9]*)\\.[0-9]*(" + UNIT_SEPARATOR + "\\w+" + UNIT_SEPARATOR + "\\w+" + UNIT_SEPARATOR + "i)";
        return string.replaceAll(
            regex,
            "$1$2"
        );
    }

    public CorrectInvalidIntegerValues(HttpServletRequest request) throws IOException
    {
        super(request);
        final InputStreamReader inr = new InputStreamReader(request.getInputStream(), request.getCharacterEncoding());
        body = truncateFloatingPointValuesInIntegerFields(CharStreams.toString(inr));
    }

    @Override
    public ServletInputStream getInputStream() throws IOException
    {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body.getBytes(getCharacterEncoding()));
        ServletInputStream servletInputStream = new ServletInputStream()
        {
            public int read() throws IOException
            {
                return byteArrayInputStream.read();
            }
        };
        return servletInputStream;
    }

    @Override
    public BufferedReader getReader() throws IOException
    {
        return new BufferedReader(new InputStreamReader(this.getInputStream()));
    }

    public String getBody()
    {
        return this.body;
    }
}
