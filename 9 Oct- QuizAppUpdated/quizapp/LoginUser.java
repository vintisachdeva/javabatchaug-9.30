package com.bmpl.quizapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginUser {

	public LoginUser(String userName, String userPassword) {
		
		String pathOfFile = "E:\\UserDetails.txt";
		
		File file = new File(pathOfFile);
		
		FileReader fileReader = null;
		BufferedReader br = null;
		
		try {
		
			fileReader = new FileReader(file);
			
			br = new BufferedReader(fileReader);
			
			String data = null;
			boolean login = false;
			while((data = br.readLine())!=null)
			{
				if(data.contains(userName) && data.contains(userPassword)){
					login = true;
				}
			}
			if(login){
				System.out.println("Login Successful");
			} else{
				System.out.println("Invalid details");
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
