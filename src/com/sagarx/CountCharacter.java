package com.sagarx;

public class CountCharacter {

	public CountCharacter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str = "abababsbsdnfmsfdhmnnsscacac";
		String temp = "";

		for(int i=0;i<str.length();i++) {
		if(temp.indexOf(str.charAt(i))==-1) {
		temp = temp + str.charAt(i);
		}
		}
		System.out.println(temp);
		System.out.println("Unique Character Count:" + temp.length());
	}

}
