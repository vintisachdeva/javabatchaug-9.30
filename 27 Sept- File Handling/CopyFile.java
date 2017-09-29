package com.java.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
	
		String path = "D:\\TumHiho.mp3";
		String newPath = "D:\\TumHihoNew.mp3";
		File file = new File(path);
		
		FileInputStream fin = new FileInputStream(file);
		FileOutputStream fout = new FileOutputStream(newPath);
		
		int i = 0;
		
		while((i = fin.read())!=-1){
			fout.write((byte)i);
		}
		fin.close();
		fout.close();
	}
}
