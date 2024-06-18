package com.java;

public class task2 { //class started from here

	//write a java program to calculate a simple interest for a given amount
	 //class started here
		//Java program execution starts from main()method
		public static void main(String[] args) {
			// main()method starts from here
	       /*S.I. = (P*R*T)/100
	        *where P = Principal( initially borrowed amount)
	        *R = Rate of Interest in % per annum,T = Time
	        *for example take principal = 10000 Rate =5% Time = 2 years  */
			
			int P = 50000;  // Initially borrowed amount
			
			int R = 5;     // Rate of Intrest in %
			
			int T = 10;    // Time for which money was borrowed
			
			int SimpleInterest = (P*R*T)/100; // formula for calculating simple interest
			
					System.out.println(SimpleInterest);// prints the simple interest
					
		 } //main() method ends here
	}