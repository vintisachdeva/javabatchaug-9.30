package com.bmpl.multithreading;

//2 ways --> 
//1. extends Thread class
//2. implement Runnable interface



public class MultiThread extends Thread{
	
	
	public void run(){
		System.out.println("Thread is running=" + Thread.currentThread().getName() + " Priority=" + Thread.currentThread().getPriority());
	}
	//by default name start with--> Thread-0
	
	// main thread --> predefined by java
	public static void main(String[] args) {
		
		//System.out.println(args[1]);
		
		for(int i = 0; i <=5 ; i++)
		{
			//1 to 10
			MultiThread obj = new MultiThread();//thread 
			obj.setName("MyThread" +i);
			obj.setPriority(MAX_PRIORITY);
			obj.start();			
		}
		

	}

}
