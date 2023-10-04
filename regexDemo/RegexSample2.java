package com.regexDemo;

import java.util.regex.Pattern;

public class RegexSample2 {

	public static void main(String[] args) {
		String content="This is Prerna from sangamner";
		String pattern= ".*san.*";
		boolean match=Pattern.matches(pattern, content);
		System.out.println("is match:"+match);
		}

}
