package com.SDET16java;

public class ReverseStingWith0Index {
	public static void main(String[] args) {
		String s="Shwetha";
		String rev="";
		
		for (int i = 0; i<s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		

	}

}