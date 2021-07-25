package com.qspiders.stringclassdemo;

public class Program4 {
	public static void main(String[] args)
	{
		System.out.println("start of java code");
		String s1="sql";//constant pool area ie in ""
		System.out.println("s1="+s1);
		String s2=new String("sql");//non constant pool area ie by new operator
		System.out.println("s2="+s2);
		String s3="sql";
		System.out.println("s3="+s3);
		System.out.println(s1==s3);//duplicates not allowed so s1 and s3 both pointing to same objectaddress 
		String s4=new String("sql");
		System.out.println("s4="+s4);
		System.out.println(s2==s4);
		
		
		String s5="ja";
		String s6=new String("va");
		String s7=s5+s6;//non constant pool area
		System.out.println("s7="+s7);
		
		System.out.println("end of java code");
	}
}
