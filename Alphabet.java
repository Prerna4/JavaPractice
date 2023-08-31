package com.java.demo.intro;

import java.util.Scanner;

public class Alphabet {


	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter a Character");
		char a=sc.next().charAt(0);
		
		if((a>='a'&& a<='z')||(a>='A'&& a<='Z'))
			System.out.println("Character is an alphabet");
		else
			System.out.println("Character is not an alphabet");

		}
	}

}
