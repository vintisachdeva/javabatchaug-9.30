package com.bmpl.javabasic;

//Swap without third variable

public class Swap {

	public static void main(String[] args) {
		
		int value1 = 5;
		int value2 = 10;
		
		value1 = value1 + value2;// 5 + 10 = value1 = 15
		value2 = value1 - value2;//15 - 10 = value2 = 5
		value1 = value1 - value2;//15 - 5 = 10
		
		//value2 = 5;
		//value1 = 10;
		
		System.out.println("Value1 = " + value1);
		System.out.println("Value2 = " + value2);

	}
}