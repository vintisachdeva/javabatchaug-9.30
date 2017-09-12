package com.bmpl.javabasic;

abstract class Shape{
	
/*	abstract void drawShape();
	
	
	abstract void playSound();*/
	
	void draw(){
		System.out.println("Abstract Shape class draw");
	}
}

class Circle extends Shape{

	void draw(){
		System.out.println("Circle class draw");
	}
	
/*	@Override
	void drawShape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void playSound() {
		// TODO Auto-generated method stub
		
	}*/
	
	
	
}


public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.draw();
	}

}
