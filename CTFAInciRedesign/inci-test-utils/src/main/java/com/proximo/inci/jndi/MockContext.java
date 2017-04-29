/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.jndi;

import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * JNDI Mock InitialContext.
 */
public class MockContext extends InitialContext {

    private Map<String, Object> bindings = new HashMap<String, Object>();

    public MockContext() throws NamingException {
        super(true);
    }

    @Override
    public void bind(String name, Object obj) throws NamingException {
        bindings.put(name, obj);
    }

    @Override
    public Object lookup(String name) throws NamingException {
        return bindings.get(name);
    }

    public void clearBindings() {
        bindings = new HashMap<String, Object>();
    }

}
