package test;
import org.apache.log4j.Logger;

import math.MyMath;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);
	
	
	public static void main(String[] args) {
	
		logger.debug("Start of Main class main method");
		MyMath math  = new MyMath();
		System.out.println("New Result now is : "+math.multi(5,10));
		
		
		System.out.println("New Result now is : "+math.multi(10,20));
		System.out.println("New Result now is : "+math.multi(100,500));
		
		logger.debug("End of Main class main method");
	}
}
