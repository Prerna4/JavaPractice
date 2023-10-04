package com.regexDemo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("..p");
		Matcher m=p.matcher("aap");
		boolean b=m.matches();
		System.out.println(b);
		
		//another way
		boolean b2=Pattern.compile(".p").matcher("aap").matches();
		System.out.println(b2);
		
		//or
		boolean b3=Pattern.matches("..p", "aap");
		System.out.println(b3);
		
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		
		Pattern p1=Pattern.compile("[A-Z][a-z]_[1-10]@gmail.com");
		Matcher m1=p1.matcher("Prerna_4@gmail.com");
		boolean b4=m1.matches();
		System.out.println(b4);
	}

}
