package com.searchincite.server.data;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import org.quartz.SchedulerException;

public class AutofeedCronService extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		try {
			AutofeedCronTriggerRunner autofeedCron = new AutofeedCronTriggerRunner();
			autofeedCron.task();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		
	}
	
}
