package com.sunny.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import org.apache.log4j.*;

@WebListener
public class Log4jUtil implements ServletContextListener {


	Logger log=Logger.getLogger(Log4jUtil.class);
	
	public void contextDestroyed(ServletContextEvent arg0)  { 
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
        PropertyConfigurator.configure("sunny2-log4j.properties");
        log.info("Log4j System is initilized at Container Startup");
    }
	
}
