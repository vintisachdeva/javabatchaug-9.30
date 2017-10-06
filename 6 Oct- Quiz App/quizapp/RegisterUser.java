package com.bmpl.quizapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RegisterUser {

	public RegisterUser(String userName, String userPassword) {
		
		String pathOfFile = "E:\\UserDetails.doc";
		
		File file = new File(pathOfFile);
		FileOutputStream fout = null;
		String username = "UserName=".concat(userName) + "\t";
		String userpassword = "UserPassword=".concat(userPassword) + "\n";
		byte userdata[] = username.getBytes();
		byte userpass[] = userpassword.getBytes();
		try {
			fout = new FileOutputStream(file, true);
			fout.write(userdata);
			fout.write(userpass);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fout!= null){
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fout = null;
			}
//			try {
//				fout.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
		if(file.length()>0){
			System.out.println("Registered Successfully");
		}else{
			System.out.println("Error while registering. Try later...");
		}
	}
}
