package com.bmpl.javabasic;

import java.util.Scanner;

public class Problem3 {

	//good practice--> variables declare private , getter and setters--> public
	String name;
	int id;
	long phn;
	float percentage;
	
	//java--> reusablility-->getters and setters
	
	void input(){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		setName(scanner.nextLine());
		//name = scanner.nextLine();	
		System.out.println("Enter your Id");
		id = scanner.nextInt();
	
		
	}
	
	void output(){
		System.out.println("Your name is=" + name);
		System.out.println("Your id is=" + id);
	}
	
	public static void main(String[] args) {
		Problem3 obj = new Problem3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		obj.setName(scanner.nextLine());
		System.out.println(obj.getName());
		
		//obj.input();
		//obj.output();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
