package com.bmpl.javabasic;

public class IfElse {

	public static void main(String[] args) {

		int value1 = 120;
		int value2 = 50;
		int value3 = 40;
		boolean state = true;
		
		if(!state){//state == false
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		
		/*if(value1 > value2 && value1 > value3){
			System.out.println("Value1 is greater");
		} else if(value2 > value1 && value2 > value3){
			System.out.println("Value2 is greater");
		} else {
			System.out.println("Value3 is greater");
		}
		*/	
		
		/*if(value1 > value2)//120>50
		{//false
			if(value1 > value3)//120>40
				System.out.println("Value1 is greater");
		}
		else if(value2 > value3) {//40>50
			System.out.println("Value2 is greater");
		}
		else {
			System.out.println("value3 is greater");
		}*/
		
		
		System.out.println("execute");
	}

}
