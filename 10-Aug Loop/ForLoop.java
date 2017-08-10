package com.bmpl.javabasic;

public class ForLoop {

	public static void main(String[] args) {
		
		int value = 1;
		
		String name = "Ram";
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		//outer loop
		for(;value<=3; value++)//4 <= 3
		{
			//inner loop
			for(int value2 = 1; value2<=3; value2++)//1<=3
			{
				System.out.print(value2);//1	
			}
			System.out.println("");
		}
	}

}
