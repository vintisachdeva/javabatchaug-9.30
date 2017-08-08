package com.bmpl.javabasic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		//scanner
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter a value");
		
		/*int value1 = scanner.nextInt();
		int value2 = scanner.nextInt();
		*/
		char userValue = scanner.next().charAt(0);  

		/*if(userValue=='a' ||
			userValue=='A' ||
			userValue=='e' ||
			userValue=='E' ||
			userValue=='i'||
			userValue=='I' ||
			userValue=='o' || 
			userValue=='u' )
		{
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}*/
		switch(userValue){
		
		case 'a':
		case 'A':	
		case 'e':
		case 'E':
		case 'i':
		case 'I':	
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
		break;
		
		default:
			System.out.println("Consonant");
		break;
		}
		
		scanner.close();
	}

}
