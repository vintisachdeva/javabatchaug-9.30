package com.java.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\file.txt");
		
		//FileInputStream --> Read
		//FileOutputStream --> Write
		
		//Writing data into file
		
		//Stream --> Bytes
		//FileOutputStream fout = new FileOutputStream(file);
		
		//Reader and Writer
		
//		FileWriter fw = new FileWriter(file);
//		
//		BufferedWriter bw = new BufferedWriter(fw);
//
//		bw.write("Data to write");
//
//		System.out.println("Written");
//		
//		bw.close();
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String data = null;
		
		while( (data = br.readLine()) != null){
			System.out.println(data);
		}
		
		//System.out.println(br.readLine());
		
		br.close();
		
	}

}








