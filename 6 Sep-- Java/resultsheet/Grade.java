package com.bmpl.resultsheet;

public class Grade {

	char grade(int percent){
		
		char studGrade = 'D';
		
		if(percent> 80 && percent<100){
			studGrade = 'A';
		} else if(percent> 60 && percent<=80){
			studGrade = 'B';
		} else if(percent> 40 && percent<=60){
			studGrade = 'C';
		} else {
			studGrade = 'D';
		}
		
		return studGrade;
	}	
}
