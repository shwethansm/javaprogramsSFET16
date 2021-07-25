package com.qspiders.stringclassdemo;

public class Program1 
{
public static void main(String[] args) 
{   //example for immutable property of string 
	System.out.println("start of java code");
	String s1="java";
	System.out.println("s1="+s1);
	String s2=s1;
	System.out.println("s2="+s2);
	s1=s1+"sql";
	System.out.println("s1="+s1);
	System.out.println("s2="+s2);//even s1 is javasql s2 does not changed so immutable
	System.out.println("end of java code");
}
}