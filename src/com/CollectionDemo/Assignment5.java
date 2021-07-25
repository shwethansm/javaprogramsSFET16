package com.CollectionDemo;

import java.util.TreeSet;

class Property1 implements Comparable
{
	int propertyid;
	int propertynumber;
	double cost;
	public Property1(int propertyid, int propertynumber,double cost)
	{
		this.propertyid = propertyid;
		this.propertynumber=propertynumber;
		this.cost = cost;
		
	}
	@Override
	public String toString() 
	{
		return "Property1 [propertyid=" + propertyid + ", propertynumber=" + propertynumber + ", cost=" + cost + "]";
	}
	@Override
	public int compareTo(Object ob)
	{
		Property1 pr=(Property1)ob;
		return this.propertyid-pr.propertyid;
		//return this.propertynumber-pr.propertynumber);
	}
}
public class Assignment5
{
public static void main(String[] args) 
{
	System.out.println("start of java code");
	Property1 po1=new Property1(22,23456,34.45);
	Property1 po2=new Property1(24,34567,45.67);
	Property1 po3=new Property1(18,45789,22.56);
	Property1 po4=new Property1(44,56789,38.09);
	Property1 po5=new Property1(58,457890,22.44);
	Property1 po6=new Property1(16,232323,44.66);
	Property1 po7=new Property1(28,346789,66.55);
	TreeSet tss=new TreeSet();
	tss.add(po1);
	tss.add(po2);
	tss.add(po3);
	tss.add(po4);
	tss.add(po5);
	tss.add(po6);
	tss.add(po7);
	for (Object ob : tss)
	{
		System.out.println(ob);
	}
	System.out.println("end of java code");
}
}
