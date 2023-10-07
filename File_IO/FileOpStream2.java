package com.JavaIO.demo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOpStream2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:\\\\testout.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text you want to add to the file:");
		String s=br.readLine();
		fw.write(s);
		fw.close();
		System.out.print("Text added successfully..");
		
	}

}
