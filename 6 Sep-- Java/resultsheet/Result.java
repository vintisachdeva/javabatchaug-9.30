package com.bmpl.resultsheet;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Eng marks");
		int eng = scanner.nextInt();
		
		System.out.println("Enter Hindi marks");
		int hindi = scanner.nextInt();
		
		System.out.println("Enter Maths marks");
		int maths = scanner.nextInt();
		
		TotalMarks totalMarks = new TotalMarks();
		int total = totalMarks.total(eng, hindi, maths);
		
		System.out.println("Total " + total);

		Percentage percentage = new Percentage();
		int percent = percentage.percentCalculate(total);
		
		System.out.println("Percentage " + percent);
		
		Grade grade = new Grade();
		char studGrade = grade.grade(percent);
		
		System.out.println("Grade " + studGrade);
		
	}

}