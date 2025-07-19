package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Propagation_throws {
	public static void main(String[] args) throws Exception{
		m1();
	}
	public static void m1() throws FileNotFoundException,ClassNotFoundException {
		m2();
	}
	public static void m2() throws FileNotFoundException {
		FileReader f=new FileReader("D:\\css\\index.html");
		System.out.println("File reading...");
		
	}

}
