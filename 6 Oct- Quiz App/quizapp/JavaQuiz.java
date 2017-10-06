package com.bmpl.quizapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaQuiz {

	//File file=  new File();
	
	void readData(){
		String path  = "E:\\QuizAppJava\\questions.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		String[] questions = new String[2];
		int i = 0;
		
		try {
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String data = null;
			
			while((data = br.readLine())!=null){
				questions[i] = data;
				System.out.println(questions[i]);
				i++;
			}
			System.out.println(questions.length);
			
//			for(String question : questions){
//				System.out.println(question);
//			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	
	public static void main(String args[]){
			
		JavaQuiz obj = new JavaQuiz();
		obj.readData();
	}
		
		
}