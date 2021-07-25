package com.SDET16java;


import java.util.LinkedHashSet;

public class FindOnlyUniqueChar {


		public static void main(String[] args) {
			String s="Mandya";
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
	        	if(count==1)//if(count<2)
	        	System.out.print(chr);
	        		}
	        	}
	        }
		

