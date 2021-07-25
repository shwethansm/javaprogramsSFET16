package com.CollectionDemo;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment4
{
public static void main(String[] args) 
{
	System.out.println("start of java code");
	//HashSet hs=new HashSet();
	LinkedHashSet hs=new LinkedHashSet();
	Property p1=new Property(24,123456789,50.36);
	Property p2=new Property(22,123456789,89.00);
	Property p3=new Property(26,134678097,54.67);
	Property p4=new Property(27,987654321,53.78);
	Property p5=new Property(28,134567846,50.36);
	Property p6=new Property(29,987654321,90.45);
	Property p7=new Property(30,987654322,99.45);
	System.out.println(p1.equals(p2));
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	hs.add(p1);
	hs.add(p2);
	hs.add(p3);
	hs.add(p4);
	hs.add(p5);
	hs.add(p6);
	hs.add(p7);
	System.out.println("size="+hs.size());
	for (Object ob : hs) 
	{
		System.out.println(ob);
	}
	System.out.println("end of java code");
}
}