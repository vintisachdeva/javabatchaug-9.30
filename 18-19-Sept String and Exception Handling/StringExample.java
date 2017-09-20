package com.bmpl.javabasic;

public class StringExample {

	public static void main(String[] args) {
		
	/*	String a = new String("Hello");
		//a = a.concat("user");
		System.out.println(a);
		
		System.out.println("Length is=" +a.length());
		System.out.println("Replace=" + a.replace("e", "a"));
		System.out.println("Substring=" + a.substring(2));
		System.out.println("Substring=" + a.substring(1, 5));
		System.out.println("Trim=" + a.trim());
		System.out.println("Index is=" + a.indexOf("e"));
		System.out.println("Reverse is="+a); */
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
		//sb.delete(1, 4); //HelloJava
		//sb.insert(2, "w");
		//sb.reverse();
		sb.deleteCharAt(5);
		System.out.println(sb);
		

		/*StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("User in Java Again");
		System.out.println(sb1);*/
		
		/*String b = "Hello";
		b = b.concat("Java");
		b = b.replace("e", "w");
		b = b.toUpperCase();
		System.out.println(b);*/
		
	}

}
