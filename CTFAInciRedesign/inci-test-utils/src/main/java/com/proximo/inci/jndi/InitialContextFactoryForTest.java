/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.jndi;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;

/**
 * JNDI Mock InitialContext Factory.
 */
public class InitialContextFactoryForTest implements InitialContextFactory {

    private static MockContext context = createContext();

    @Override
    public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
        return context;
    }

    public static void bind(String name, Object obj) {
        try {
            context.bind(name, obj);
        } catch (NamingException e) { // can't happen.
            throw new IllegalStateException(e);
        }
    }

    public void resetContext() {
        context.clearBindings();
    }

    private static MockContext createContext() {
        try {
            return new MockContext();
        } catch (NamingException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
    }
}
