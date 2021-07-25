package com.SDET16java;

import java.util.LinkedHashSet;

public class NumOfDupWord {

	
		public static void main(String[] args) {
			String s="welcome to tumkur welcome to";
			//convert the given string in to array
			//char[] ch = s.toCharArray();
			String [] str=s.split(" ");
			LinkedHashSet <String>set=new LinkedHashSet <String>();
	        for(int i=0;i<str.length;i++) {
	        	set.add(str[i]);
	        }
	        System.out.println(set);
	        int count1=0;
	        for(String word:set) {
	        	int count=0;
	        	for(int i=0;i<str.length;i++) {
	        		if(word.equals(str[i]))
	        		{
	        			count++;
	        		}
	        	}
	        	if(count>1)
	        	{
	        		count1++;
	        	}
	        	
	        		}
	        System.out.println(count1++);
	        	}
	        }
		



