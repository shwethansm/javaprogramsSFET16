package com.SDET16java;

import java.util.LinkedHashSet;

public class PrintOnlyDupChar {

		public static void main(String[] args) {
			String s="amma";
			//convert the given string in to array
			char[] ch = s.toCharArray();
			//
			LinkedHashSet <Character>set=new LinkedHashSet <Character>();
	        for(int i=0;i<ch.length;i++) {
	        	set.add(ch[i]);
	        }
	        System.out.println(set);
	        for(Character chr:set) {
	        	int count=0;
	        	for(int i=0;i<ch.length;i++) {
	        		if(chr==ch[i])
	        		{
	        			count++;
	        		}
	        	}
	        	if(count>1)
	        	System.out.println(chr+"="+count);
	        		}
	        	}
	        }
		

