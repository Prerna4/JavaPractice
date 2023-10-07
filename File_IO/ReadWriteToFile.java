package com.JavaIO.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteToFile {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\\\testout.txt");
		FileWriter fw=new FileWriter("D:\\\\testout2.txt");
		String str="";
		int i=0;
		while((i=fr.read())!=-1)
		{
			str+=(char)i;
		}
		fw.write(str);
		fw.close();
		fr.close();
		System.out.println("File reading and writing both done");
	}

}

