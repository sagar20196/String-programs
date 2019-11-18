package com.sagarx;

import java.util.Scanner;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	System.out.println("Enter the number:");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	
	int rev=0,rmd;
	while(num>0) {
		rmd=num%10;
		rev=rev*10+rmd;
		num=num/10;
	}
	if(rev==n)
		System.out.println(n + "is a Palindrome!");
	else
		System.out.println(n + "is not a Palindrome!");
	}

}