package com.Arraydemo;

public class Program1 {
	public static void main(String[] args)
	{
		System.out.println("start of java code");
		int [] ar;
		ar=new int[5];
		ar[2]=15;
		ar[4]=25;
		ar[1]=36;
		ar[0]=12;
		ar[3]=3;
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println("for loop output ");
		for (int index = 0; index < ar.length; index++)
		{
			System.out.println(ar[index]);
		}
		
		
		System.out.println(ar);
		
		System.out.println("size="+ar.length);
		System.out.println("end of java code");
	}
}
