package com.qspiders.stringclassdemo;

public class Program5
{
	public static void main(String[] args) 
	{
	System.out.println("start of java code");
	String s1="developer";
	System.out.println("s1="+s1);
	System.out.println("extract="+s1.substring(1));
	System.out.println("extract1="+s1.substring(1,5));
	System.out.println("size="+s1.length());
	char c1=s1.charAt(3);
	System.out.println("c1="+c1);
	char c2=s1.charAt(6);
	System.out.println("c2="+c2);
	System.out.println("letter="+s1.indexOf('l',2));

	char ch[]=s1.toCharArray();
	for (int i = 0; i < ch.length; i++)
	{
		System.out.println(ch[i]);
	}
	String s2="HellO WOrlD";
	System.out.println("S2="+s2);
	String out=s2.toUpperCase();
	System.out.println("out="+out);
	System.out.println("S2="+s2);
	String s3="hi hello java is easy programing language";
	String [] ar=s3.split(" ");
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
	}
}


