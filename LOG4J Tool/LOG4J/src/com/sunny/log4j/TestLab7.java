package com.sunny.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLab7 {

	static {

		PropertyConfigurator.configure("src/sunny2-log4j.properties");
	}
	


	static Logger log=Logger.getLogger("TestLab7");
	
	
	public static void main(String[] args) {


		log.info("Main Started");
		log.debug("No Values as CommandLineArgument :"+args.length);
			
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



//property file sunny2-log4j.properties