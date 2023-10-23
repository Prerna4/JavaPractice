package com.exceptiondemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class FileNotFound extends Exception{
	public FileNotFound(String msg) {
		System.out.println(msg);
	}
}

public class FileNotFoundDemo {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileReader fr=new FileReader("text2.txt");
			BufferedReader br=new BufferedReader(fr);
	
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
