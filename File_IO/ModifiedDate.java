package com.JavaIO.demo;
import java.io.File;
import java.util.Date;

public class ModifiedDate {

	public static void main(String[] args) {
		File f=new File("D:\\\\testout.txt");
		Date date=new Date(f.lastModified());
		System.out.println("Last Modified Date of a file is:"+" "+date);
	}

}
