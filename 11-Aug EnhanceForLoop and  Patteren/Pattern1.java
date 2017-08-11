package com.bmpl.javabasic;


/*
 
 *
 **
 ***
 ****
 *****
 
 1
 12
 123
 1234
 12345
 
 */


public class Pattern1 {

	public static void main(String[] args) {
		
		for(int row = 1; row<=5; row++){//6<=5
			
			for(int column = 1; column <= row; column++){//3<=2
					
				System.out.print("*");
				//System.out.print(column); 
										 	
			}
			System.out.println("");
		}

	}

}
