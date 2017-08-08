package com.bmpl.javabasic;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int value = 4;
		
		//switch(2)
		switch(value){
		
		case 1://1==4
			System.out.println("You enter 1");
			break;
		
		case 2:
			System.out.println("you entered 2");
			//break;
		
		case 3:
			System.out.println("you entered 2");
			break;

		default:
			System.out.println("enter value between[1-7]");
		break;
			
		}

	}

}
