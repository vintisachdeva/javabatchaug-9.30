package com.java.filehandling;

import java.io.File;
import java.io.IOException;

// e:\\ --> .mp3 files --> 

public class CreateFile2 {

	public static void main(String[] args) throws IOException {
		
		/*File dirPath = new File("E:\\a\\b\\c\\d\\");
		
		File filePath = new File(dirPath, "Data.txt");
		
		dirPath.mkdirs();
		filePath.createNewFile();*/
		
		File file = new File("E:\\");
		
		//int[] array=  {};
		
		File[] fileList = file.listFiles();
		
		//Enhance For Loop
		for(File files : fileList){
			System.out.println(files);
		}
		System.out.println("Total Number of Items are: " + fileList.length);
		// items 11 --> 0 - 11	
		/*for(int i = 0; i <= fileList.length - 1; i++)
		{
			System.out.println(fileList[i]);
		}*/
		
	}

}