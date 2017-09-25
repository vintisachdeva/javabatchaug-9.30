package com.java.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) /*throws IOException*/ {
		
		String filePath = "E:\\a\\b\\c\\d\\";
		String fileName = filePath + "Data.txt";
		
		File file = new File(filePath);
		File file1 = new File(fileName);
		
		
		
		//file.mkdirs();
		
		try {
			file.mkdirs();
		
			if(file1.exists()){
				System.out.println("Can Read = " + file1.canRead());
				file1.delete();
				file1.createNewFile();
				System.out.println("File Found and Deleted and New One Created");
			} else{
				file1.createNewFile();
				System.out.println("File created");		
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//file.mkdirs();
		//file.createNewFile();
		//System.out.println("Directory created");

	}

}
