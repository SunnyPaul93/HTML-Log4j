package com.sunny.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.*;

public class TestLab1 {
	static{
		BasicConfigurator.configure();		//configure Log4j system in Static Block
	
		//here take default SimpleLayout and ConsoleAppender
	}
	
	//Create or get the Logger object using getLogger(class type or String type object )
	static Logger log=Logger.getLogger("TestLab1");
	
	
	public static void main(String[] args) {

//		Used the required method to log the message
		Logger root=Logger.getRootLogger();
		root.setLevel(Level.DEBUG);
	//	System.out.println(root);
		log.info("Main Started");
		log.debug("No Values as CommandLineArgument :"+args.length);
		for(int i=0;i<2;i++){
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		
		if(args.length==0){
			log.warn("No CommmandLineArgument Specified Please Specify valid value");
		}
		
		log.debug("1st CLA value in Main :"+args[0]);
		
		log.debug("2nd CLA value in Main :"+args[1]);
		
		log.info("Creating SunnyOperator ");
		
		SunnyOperator op=new SunnyOperator();
		log.info("SunnyOperator object is Created");
		
		int remd=op.getRemainder(args[0], args[1]);
		System.out.println("Remainder in main method() :"+remd);
		
		log.info("Main Completed");
	}

}
