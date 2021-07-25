package com.qspiders.stringclassdemo;

public class employee {
	private int employeeid;
	private String employeename;
	private float salary;
	@Override
	public String toString()
	{
		return employeename + " " + employeeid + " ";
	}
	employee(int employeeid,String employeename)
	{
		this.employeeid=employeeid;
		this.employeename=employeename;
	}
	@Override
	public boolean equals(Object ob)
	
	{
		employee e2=(employee)ob;
	//	return this.employeeid==e2.employeeid;
		String s1=this.employeename;
		String s2=e2.employeename;
		if(s1.equals(s2)&&(this.employeeid==e2.employeeid))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		employee e1=new employee(2345,"Shwetha");
		//employee e2=new employee(2345,"Shwetha");
		
		employee e2=new employee(4567,"Shruthi");
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		//System.out.println(e2);
	}
	
}
	
