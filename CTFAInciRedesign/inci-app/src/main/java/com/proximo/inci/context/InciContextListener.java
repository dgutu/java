/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.service.common.states.StatesService;
import com.proximo.inci.service.netforum.NetforumService;

public class InciContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LookupService.initialize();
        StatesService.initialize();
        try {
            /* Initializes NetforumService static members */
            Class.forName(NetforumService.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to load NetforumService class", e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
