package com.SDET16java;

import java.util.Arrays;

public class ReverseOfEachWord {

	public static void main(String[] args) {
		String s="welcome to tyss comp";
		String [] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
	}

	}
}