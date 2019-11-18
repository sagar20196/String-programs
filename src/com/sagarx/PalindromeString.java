package com.sagarx;

import java.util.*;
public class PalindromeString {

	public PalindromeString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String original,rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		original=sc.nextLine();
		
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
			rev=rev+original.charAt(i);
		
		if(original.equals(rev))
		System.out.println("Entered string is Palindrome");
		else
			System.out.println("Entered string is not a Palindrome");
	}

}