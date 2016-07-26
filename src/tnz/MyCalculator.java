/*
 Author: TnZ
 Date: 23 July 2016
 Description: Date: Main class to run a simple calculator class
*/

import static java.lang.System.out;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		Calculator addCal = new Calculator();

		addCal.addNumbers(5, 6);

		out.printf(" %d + %d = %d", addCal.getNum1(), addCal.getNum2(), addCal.getResult());
	}
}
