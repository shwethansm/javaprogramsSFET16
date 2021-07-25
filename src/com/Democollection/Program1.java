package com.Democollection;

	class Mobile
	{
		String brand;
		long imei;
		double cost;
		public Mobile(String brand, long imei, double cost) 
		{
			this.brand = brand;
			this.imei = imei;
			this.cost = cost;
		}
		@Override
		public String toString() 
		{
			return "Mobile [brand=" + brand + ", imei=" + imei + ", cost=" + cost + "]";
		}
		
	}
	class Student
	{
		
	}
	public class Program1
	{
	public static void main(String[] args) 
	{
	System.out.println("start of java code");
	Mobile [] mt=new Mobile[5];
	Mobile m1=new Mobile("VIVO", 1234, 25.36);
	mt[0]=m1;
	mt[1]=new Mobile("APPle", 4125, 12.36);
	mt[2]=new Mobile("APPle", 4125, 12.36);
	mt[3]=new Mobile("APPle", 4125, 12.36);
	mt[4]=new Mobile("APPle", 4125, 12.36);

	for (int i = 0; i < mt.length; i++)
	{
		System.out.println(mt[i]);
	}





	System.out.println("end of java code");
	}

	@Override
	public String toString() {
		return "Program1 []";
	}
	
}
