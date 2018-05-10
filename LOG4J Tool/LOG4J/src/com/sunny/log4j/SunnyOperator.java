package com.sunny.log4j;

import org.apache.log4j.Logger;

public class SunnyOperator {
	
	Logger log=Logger.getLogger(this.getClass());
	
	public int getRemainder(String ab,String bc){
	//	System.out.println(this.getClass());
			
		log.info("getRemainder is Invoked");
		
		log.debug("Values :"+ab+"\t\t"+bc);
		
		int rem=-1;
		try {
			int val1=Integer.parseInt(ab);
			log.debug("1st int value :"+val1);

			int val2=Integer.parseInt(bc);
			log.debug("2nd int value :"+val2);
			
			log.info("Calculating Remainder ");
			rem=val1%val2;
			log.info("Remainder Calculated");
		} catch (Exception e) {

			log.error("Error Occured ");
		}
		log.debug("Calculated Remainder :"+rem);
		
		log.info("Returning Remainder :");
		return rem;
	}
}
