///Using BasicConfiguration(ConsoleAppend and PatternLayout)

package com.sunny.log4j;

import org.apache.log4j.*;

public class TestLab3 {
	static{

		Layout lay=new PatternLayout("Current date :'%d' fullyqualified class name :'%C' priority of message: '%p' LoggerName '%c' MethodName :'%M' OriginalMessage :'%m' FullInformation :'%l' newLine %n");
		Appender app=null;
		try {
			app=new ConsoleAppender(lay);
			BasicConfigurator.configure(app);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	


	static Logger log=Logger.getLogger("TestLab3");
	
	
	public static void main(String[] args) {

//		Used the required method to log the message
		Logger root=Logger.getRootLogger();
		
//Debug has Higher Priority i.e If we set Error than Error and Fatal messages will be displayed
		root.setLevel(Level.ERROR);		
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


//Here we Set Logger Level as error so only error and fatal message will be displayed and in 
//my program there is no error so Simple SOP statement will be displayed which is normal not Logger 