package com.bmpl.resultsheet;

import java.util.Scanner;

public class ResultSheet {

	float percentage;
	String name;
	int rollno, total, eng, hin, maths;
	
	public static void main(String[] args) {
		
		ResultSheet resultSheet = new ResultSheet();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		resultSheet.name = scanner.nextLine();
		//studentDetails.setName(scanner.nextLine());
		
		System.out.println("Enter your rollno");
		resultSheet.rollno = scanner.nextInt();
		//studentDetails.setRollno(scanner.nextInt());
		
		System.out.println("Enter your Marks");
		
		System.out.println("English");
		resultSheet.eng = scanner.nextInt();
		
		System.out.println("Hindi");
		resultSheet.hin = scanner.nextInt();
		
		System.out.println("Maths");
		resultSheet.maths = scanner.nextInt();
		
		StudentDetails studentDetails = new StudentDetails(resultSheet.eng, resultSheet.hin, resultSheet.maths);
		
		resultSheet.total = studentDetails.getEnglish() + studentDetails.getHindi() + studentDetails.getMaths();
		
		studentDetails.setTotalMarks(resultSheet.total);
		
		resultSheet.percentage = resultSheet.total / 3;
		
		studentDetails.setPercentage(resultSheet.percentage);
		resultSheet.displaySheet();
	
	}
	
	void displaySheet(){
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Your Result Sheet is:\n");
		System.out.print("Name: " + name);
		System.out.print("\t Rollno: "+ rollno + "\n\n");
		System.out.print("Subject Name");
		System.out.print("\tMarks \n\n");
		
		System.out.print("English" + "\t\t" + eng + "\n");
		System.out.print("Hindi" + "\t\t" + hin + "\n");
		System.out.print("Maths" + "\t\t" + maths + "\n");
		
		System.out.println("\nTotal marks = " +total);
		
		System.out.println("Percentage = " +percentage);
		
		System.out.print("Your grade =");
	
		grade(); 
		System.out.println("-------------------------------------------------------------------");
	}
	
	void grade(){
		if(percentage> 80 && percentage<100){
			System.out.println("A");
		} else if(percentage> 60 && percentage<=80){
			System.out.println("B");
		} else if(percentage> 40 && percentage<=60){
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
