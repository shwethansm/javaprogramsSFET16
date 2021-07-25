package com.SDET16java;

import java.util.HashSet;

public class PrintOnlyDupWord {

	public static void main(String[] args) {
		String s="welcome to tumkur welcome to india";
		//convert the given string in to array
		//char[] ch = s.toCharArray();
		String [] str=s.split(" ");
		HashSet <String>set=new HashSet <String>();
        for(int i=0;i<str.length;i++) {
        	set.add(str[i]);
        }
        System.out.println(set);
        for(String word:set) {
        	int count=0;
        	for(int i=0;i<str.length;i++) {
        		if(word.equals(str[i]))
        		{
        			count++;
        		}
        	}
        	if(count>1)
        	System.out.println(word+"="+count);
        		}
        	}
        }
	


