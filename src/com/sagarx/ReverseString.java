package com.sagarx;

public class ReverseString {

	public ReverseString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

String str= "abc123";

System.out.println("Original String: " + str);

str= new StringBuffer(str).reverse().toString();

System.out.println("Reversed String: " + str);
	}

}
