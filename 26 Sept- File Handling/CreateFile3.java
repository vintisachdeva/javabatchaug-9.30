package com.java.filehandling;

import java.io.File;
import java.util.Date;

public class CreateFile3 {

	public static void main(String[] args) {
		
		File file = new File("E:\\a\\b\\c\\d\\data.txt");
		System.out.println("Can Execute = " +file.canExecute());
		System.out.println("Parent is = " +file.getParent());
		System.out.println("Absolute Path = " +file.getAbsolutePath());
		
		Date date = new Date(file.lastModified());
		System.out.println("Last Modified= " + date);
		
		//System.out.println("Last Modified = " +file.lastModified());
	}

}