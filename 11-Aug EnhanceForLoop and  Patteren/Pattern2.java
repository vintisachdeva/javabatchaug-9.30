package com.bmpl.javabasic;

/*
 
 A
 AB
 ABC
 ABCD
 ABCDE
 
 
 */



public class Pattern2 {

	public static void main(String[] args) {

		for(char row = 'A'; row<='E'; row++){//6<=5
			
			for(char column = 'A'; column <= row; column++){//3<=2
					
				System.out.print(column);
										 	
			}
			System.out.println("");		
		}

		/*for(int row = 'A'; row<='E'; row++){//6<=5
			
			for(int column = 'A'; column <= row; column++){//3<=2
					
				System.out.print((char)column);
										 	
			}
			System.out.println("");
		}*/

	}

}
