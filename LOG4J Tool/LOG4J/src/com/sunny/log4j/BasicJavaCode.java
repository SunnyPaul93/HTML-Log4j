package com.sunny.log4j;

public class BasicJavaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("* Main Started");
		
		String cla1=args[0];
		String cal2=args[1];
		
		System.out.println("*Collect 1st Argument");
		System.out.println("*1st Command Line Argument "+cla1);
		System.out.println("*1st Argument Collected ");
		
		System.out.println("*Collect 2nd Argument");
		System.out.println("*2nd Command Line Argument "+cal2);
		System.out.println("*2nd Argument Collected ");
		

		System.out.println("*Creating MyOperator object");
		MyOperator mo=new MyOperator();
		System.out.println("*MyOperator object created");
		
		System.out.println("*Calling or Invoking getRemainder() mtd from MyOperator");
		int sum=mo.getSum(cla1, cal2);
		
		System.out.println("Sum is :"+sum);
		System.out.println("*Main Completed");
	}

}

class MyOperator{
	
	public int getSum(String a,String b){
		System.out.println("*getRemainder invoked");
		System.out.println("*Values :" + a +"\t\t"+b);
		int sum=0;
		try {
			int val1=Integer.parseInt(a);
			System.out.println("*1st Value is "+val1);
		
			int val2=Integer.parseInt(b);
			System.out.println("*2nd Value is "+val2);

			System.out.println("*Calculating SUM ");
			sum=val1+val2;
			System.out.println("*SUM Calculated "+sum);

		
		} catch (Exception e) {
			System.out.println("Error Occured In Code");
		}
		
		System.out.println("*Returning Sum ");
		return sum;
	}
}


/*Here we write SOP to get the actual flow 
 *With SOP we cannot disable or enable our flow dynamically i.e all with SOP will be executed
 *  
 *To Solve Above Problem we use LOGGING API 
 *JDK also has its own Logging API but Log4j is the best Logging API among all  
 */
 
