package com.bmpl.resultsheet;

public class StudentDetails {

	//To store student details--> name, rollno, marks
	
	private String name;
	private int rollno;
	private int hindi;
	private int maths;
	private int english;
	private int totalMarks;
	private float percentage;
	private char grade;
	
	StudentDetails(){
		
	}
	
	StudentDetails(int english, int hindi, int maths){
		this.english = english;
		this.hindi = hindi;
		this.maths = maths;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public int getHindi() {
		return hindi;
	}
	
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	
	public int getMaths() {
		return maths;
	}
	
	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public float getPercentage() {
		return percentage;
	}
	
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
