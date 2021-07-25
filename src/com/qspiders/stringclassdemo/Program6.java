package com.qspiders.stringclassdemo;

public class Program6 
{
		public static void main(String[] args)
		{
		System.out.println("start of java code");
		StringBuilder sb=new StringBuilder("testing");
		System.out.println("sb="+sb);
		sb.append("java");
		System.out.println("sb="+sb);
		sb.reverse();
		System.out.println("sb="+sb);
		StringBuffer sb2=new StringBuffer("a");
		System.out.println("sb2="+sb2.toString());
		StringBuffer sb3=new StringBuffer("a");
		System.out.println("sb3="+sb3.toString());
		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());
		System.out.println(sb2.equals(sb3));
		System.out.println("end of java code");
		}
}
