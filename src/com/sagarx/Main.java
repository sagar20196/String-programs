package com.sagarx;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String str="abc";
		String str2="abc";
		String str3= new String("abc");
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str2==str3);
		System.out.println(str.equals(str3));
		System.out.println(str2.equals(str3));
	}

}
