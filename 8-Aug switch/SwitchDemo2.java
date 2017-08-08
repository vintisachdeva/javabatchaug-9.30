package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//next()
		//nextLine()
		
		System.out.println("Enter current day between [Mon-Sun]");
		
		String userValue = scanner.next();
		
		switch(userValue){
		
		case "Mon":
			System.out.println("5% discount");
			break;

		case "Tue":
			System.out.println("7% discount");
			break;
		
		case "Wed":
			System.out.println("9% discount");
			break;
		default:
			System.out.println("Enter valid day[Mon-Sun]");
			break;
		}
		scanner.close();

	}

}
