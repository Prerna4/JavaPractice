package com.stringdemo;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String rev;
		String rev2="";
		System.out.print("Enter a string:");
		Scanner sc=new Scanner(System.in);
		rev=sc.nextLine();
		String word[]=rev.split(" ");
		for(int i=0;i<word.length;i++) {
			StringBuilder sb=new StringBuilder(word[i]);
			sb.reverse();
			rev2+=sb.toString()+" ";
		}
		System.out.println(rev2);

	}

}
