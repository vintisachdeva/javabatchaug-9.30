package com.bmpl.quizapp;

import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome in the Quiz Application");
		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to Register");
		
		int userChoice = scanner.nextInt();
		
		//User Name is Entered here
		System.out.println("Enter your Name");
		scanner.nextLine();
		String userName = scanner.nextLine();
		
		//User Password is Entered here
		System.out.println("Enter your Password");
		String userPassword = scanner.nextLine();
		
		
		if(userChoice == 1){
			
			LoginUser login = new LoginUser(userName, userPassword);
			//Redirect to Login class
		}else {
			
			//Redirect to Register class
			RegisterUser register = new RegisterUser(userName, userPassword);
		}
		
	}
}