package com.bmpl.multithreading;

public class MultiThread3 extends Thread{
	
	
	public void run(){
		for(int i= 1; i<=5;i++)
		{
			System.out.println("Current Thread= " + Thread.currentThread().getName() + 
					" i=" + i +
					" priority " + Thread.currentThread().getPriority());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		
		MultiThread3 t1 = new MultiThread3();
		MultiThread3 t2 = new MultiThread3();
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		

	}

}
