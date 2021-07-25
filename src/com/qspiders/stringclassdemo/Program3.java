package com.qspiders.stringclassdemo;

public class Program3 {
	public static void main(String[] args) 
	{//example for tostring() and hashcode() and equals()
	System.out.println("start of java code");
	String s1=new String("testing");
	System.out.println(s1);
	System.out.println(s1.toString());//overriding toString() so output is testing 
	//not fully qualified classname
	String s2="a";
	System.out.println(s2.hashCode());
	String s3=new String("a");
	System.out.println(s3.hashCode());
	System.out.println(s2==s3);//here hashcode,address of object is compared so false
	System.out.println(s2.equals(s3));//here using equals() comparing content of obj so true
	System.out.println("end of java code");
	}
}
