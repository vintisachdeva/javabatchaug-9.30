package com.java.filehandling;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		
		String filePath = "E:\\a\\b\\c\\d\\data.txt";
		
		File file = new File(filePath);
		
		FileOutputStream fout = new FileOutputStream(file, true);
		
		String data = "New Data";
		
		byte[] byteData = data.getBytes(); //-128 to 127
		
		fout.write(byteData);
		
		//FileInputStream
		FileInputStream fin = new FileInputStream(file);
		int i = 0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);	
		}
		
		fin.close();
		fout.close();
		
	}

}
