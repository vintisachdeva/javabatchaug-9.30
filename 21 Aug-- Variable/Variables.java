package com.bmpl.javabasic;

public class Variables {

	int i;//instance variable and global variable 
	
	//local variable
	void print(){
		int i = 1;
		System.out.println(i);
	}
	
	void data(){
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variables obj = new Variables();//default cons
		
		System.out.println(obj.i);
		obj.data();
		obj.print();
		
	}

}
