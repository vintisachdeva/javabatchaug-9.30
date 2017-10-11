package com.bmpl.multithreading;

public class MultiThread2 implements Runnable{

	public static void main(String[] args) {
		
		MultiThread2 obj = new MultiThread2();
		Thread t1 = new Thread(obj);
		t1.start();
		//obj.start();

	}

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}
}
