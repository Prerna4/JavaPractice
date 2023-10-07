package com.JavaIO.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPfromConsole {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");    
		String s=bf.readLine();    
		System.out.println("Your name is:"+" "+s);   
	}

}
