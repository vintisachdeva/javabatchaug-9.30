package com.bmpl.quizapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginUser {

	public LoginUser(String userName, String userPassword) {
		
		String pathOfFile = "E:\\UserDetails.doc";
		
		File file = new File(pathOfFile);
		
		FileReader fileReader = null;
		BufferedReader br = null;
		
		try {
		
			fileReader = new FileReader(file);
			
			br = new BufferedReader(fileReader);
			
			String data = null;
			
			while((data = br.readLine())!=null){
				
				if(data.contains(userName) && data.contains(userPassword)){
					System.out.println("Login Successful");
					break;
				}
				else{
					System.out.println("Enter valid username and password");
					//System.out.println("data is= " + data);
					break;
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fileReader.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
