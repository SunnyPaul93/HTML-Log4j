package com.sunny.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLab8 {

	static {

		PropertyConfigurator.configure("src/sunny3-log4j.properties");
	}
	
	static Logger log=Logger.getLogger("TestLab8");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Started");
		
		log.error("This is Test Main");
		log.error("Sunny is Great");
		
		System.out.println("Main Completed");
	}

}
//property file sunny3-log4j.properties