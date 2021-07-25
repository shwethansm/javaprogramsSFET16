package com.SDET16java;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="welcome";
		char []ch=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		for(Character chr:set) {
			System.out.print(chr);
		}
			
		}

}
