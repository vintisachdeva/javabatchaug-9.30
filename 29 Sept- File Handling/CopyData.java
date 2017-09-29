package com.java.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData {

	public static void main(String[] args) throws IOException {
		
		File currentFile = new File("D:\\TumHiho.mp3");
		File newFile = new File("D:\\TumHihoCopy.mp3");

		FileReader fr = new FileReader(currentFile);
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine();
		
		FileWriter fw = new FileWriter(newFile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String data = null;
		
		System.out.println("Started");
		
		while((data = br.readLine())!= null){
			bw.write(data);	
		}
		
		System.out.println("Completed");
		bw.close();
		br.close();

	}
}
