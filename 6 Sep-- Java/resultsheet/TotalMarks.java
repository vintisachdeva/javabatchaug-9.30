package com.bmpl.resultsheet;

public class TotalMarks {

	//StudentDetails obj = new StudentDetails();
	
	int total(int eng, int hin, int maths)
	{	
		
//		int eng = obj.getEnglish();
//		int hin = obj.getHindi();
//		int maths = obj.getMaths();
		
		int sum = eng + hin + maths;

		//int sum = obj.getEnglish() + obj.getHindi() + obj.getMaths();
		
		return sum;
	}
}
