package com.stringdemo;

public class Capitalized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hey there";
		String word[]=str.split(" ");
		
		for(int i=0;i<word.length;i++) {
			String first=word[i].substring(0,1);
			String remaining=word[i].substring(1);
			first=first.toUpperCase();
			word[i]=first+remaining;
		}
			String capitalized=String.join(" ", word);
		    System.out.println("Capitalized string: " + capitalized);

		}
}
