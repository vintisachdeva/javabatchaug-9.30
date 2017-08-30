package com.bmpl.javabasic;

public class Problem2 {

	public static void main(String[] args) {
		
		boolean state = true;
		
		int value1 = 150, value2 = 150, value3 = 120;
		
		//150>150 && 150>=120--> true
		
		if(value1>value2 && value1 > value3)
		{
			System.out.println("Value1 is greater");
		} 
		
		//150>150 && 150>=120--> true
		
		else if(value2>value1 && value2 >= value3){
		
			System.out.println("Value2 is greater");
		} 
		else {
			
			System.out.println("Value3 is greater");
		}
		
		/*if(!state){
			System.out.println("State is true");
		} else{
			System.out.println("State is false");
		}*/
		
	}

}
