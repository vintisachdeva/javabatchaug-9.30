package com.bmpl.multithreading;

class Data{
	//method level
	//block level
	
//	synchronized void printData(int value)
//	{	
//		for(int i = 1; i<=5; i++)
//		{
//			System.out.println("Current Thread= " + 
//		Thread.currentThread().getName() + " " +i*value);
//			
//		}
//		
//	}
	
	void printData(int value)
	{	
		synchronized(this){
			for(int i = 1; i<=5; i++)
			{
				System.out.println("Current Thread= " + 
			Thread.currentThread().getName() + " " +i*value);
				
			}	
		}	
	}
}

class ThreadDemo1 extends Thread{
	
	Data d;
	
	ThreadDemo1(Data d){
		this.d = d;
	}
	
	public void run()
	{
		d.printData(5);
	}
	
}

class ThreadDemo2 extends Thread{
	
	Data d;
	
	ThreadDemo2(Data d){
		this.d = d;
	}
	
	public void run()
	{
		d.printData(100);
	}
}


public class MultiThread4 {

	public static void main(String[] args) {
		
		Data obj = new Data();
		ThreadDemo1 t1 = new ThreadDemo1(obj);
		ThreadDemo2 t2 = new ThreadDemo2(obj);
		//t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t1.start();
		//t1.run();//as an object
		//t2.run();

	}
}