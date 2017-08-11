package com.bmpl.javabasic;

public class EnhanceForLoop {

	public static void main(String[] args) {
		
		int value[] = {10, 32, 54, 32, 65, 32, 87};
		
		//System.out.println(value);
		
		/*for(int i = 0; i<= 4; i++)
		{
			System.out.println(value[i]);
		}*/
		
		/*for(int i = 0 ; i<value.length; i++){
			System.out.println(value[i]);
		}*/
		
		for(int i : value)
		{
			System.out.println(i);
		}
	}

}
