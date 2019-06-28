package org.lkg.java;

public class averageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java a Program to complete the average of the given number at the command Line.
		
		// To avoid the Number Formation Exception are using the try catch method. 
		try {
		int sum = 0 ;
		
		for ( int i=0 ; i< args.length; i++) {
			sum = sum+Integer.parseInt(args[i]);
		}
		System.out.println("Average of the Given Numbers: \t " + (double) sum/args.length);
		
		// Argument given are 1, 2, 3, 4, 5   i.e. 1+2+3+4+5 = 15 / 5  = 3.0
		}
		catch(NumberFormatException e) {
			System.out.println("This is not a Number");  // but this doesn't solve the problem fully. but partially it can be solved by providing the meaningful output for the user.
		}
	}
}
