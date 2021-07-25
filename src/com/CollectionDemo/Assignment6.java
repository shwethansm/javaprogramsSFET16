package com.CollectionDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

class Carparking implements Comparable
{
	String carno;
	int parkingfee;
	double parkinghours;
	public Carparking(String carno, int parkingfee, double parkinghours) 
	{
		this.carno = carno;
		this.parkingfee=parkingfee;
		this.parkinghours = parkinghours;
	}
	@Override
	public String toString() 
	{
		return "Carparking [carno=" + carno + ", parkingfee=" + parkingfee + ", parkinghours=" + parkinghours + "]";
	}
	@Override
	public int compareTo(Object o)
	{
		Carparking cp=(Carparking)o;
		//return this.parkingfee-cp.parkingfee;
		String first =this.carno;
		String second=cp.carno;
		int value=first.compareTo(second);
		return value;
	}
}
class SortBasedOncarno implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Carparking cp1=(Carparking)o1;
		Carparking cp2=(Carparking)o2;
		return (int)(cp1.parkinghours-cp2.parkinghours);
	}
	
}
public class Assignment6 
{
public static void main(String[] args) 
{
System.out.println("start of java code");
PriorityQueue pq1=new PriorityQueue();
pq1.add(new Carparking("KA021234", 50, 03.45));
pq1.add(new Carparking("MH063424", 30, 20.45));
pq1.add(new Carparking("KA064566", 20, 17.30));
pq1.add(new Carparking("AP094532", 100, 19.50));
pq1.add(new Carparking("TL092323", 40, 07.35));
pq1.add(new Carparking("MP998900",40,9.45));
int size=pq1.size();
System.out.println("output of first priority queue");
for (int i = 0; i < size; i++)
{
Object ob=pq1.poll();
System.out.println(ob);
}
PriorityQueue pq2=new PriorityQueue(new SortBasedOncarno());
pq2.add(new Carparking("KA021234", 50, 03.45));
pq2.add(new Carparking("MH063424", 30, 20.45));
pq2.add(new Carparking("KA064566", 20, 17.30));
pq2.add(new Carparking("AP094532", 100, 19.50));
pq2.add(new Carparking("TL092323", 40, 07.35));
pq2.add(new Carparking("MP998900",40,9.45));

int size2=pq2.size();
System.out.println("output of second priority queue");
for (int i = 0; i < size2; i++)
{
Object ob=pq2.peek();
System.out.println(ob);
}
System.out.println("end of java code");
}
}