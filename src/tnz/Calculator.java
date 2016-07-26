/*
 Author: Tnz
 Date: 23 July 2016 23:22
 Description: Simple class to do addition calcutions
*/

public class Calculator {
	
	private int num1;
	private int num2;
	private int result;

	public Calculator(){}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		result = num1 + num2;
	}
	
	public int getNum1() {
		return num1;
	}	

	public int getNum2() {
		return num2;
	}

	public int getResult() {
		return result;
	}

	public void addNumbers(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		result = num1 + num2;
	}
}
