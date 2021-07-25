package com.CollectionDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

class Interview implements Comparable
{
	String name;
	int noOfstu;
	double result;
	public Interview(String name, int noOfstu, double result) 
	{
		this.name = name;
		this.noOfstu = noOfstu;
		this.result = result;
	}
	@Override
	public String toString() 
	{
		return "Interview [name=" + name + ", noOfstu=" + noOfstu + ", result=" + result + "]";
	}
	@Override
	public int compareTo(Object o)
	{
		Interview it=(Interview)o;
		return this.noOfstu-it.noOfstu;
	}
}
class SortBasedOnPercentage implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Interview it1=(Interview)o1;
		Interview it2=(Interview)o2;
		return (int)(it1.result-it2.result);
	}
	
}
public class Priority 
{
public static void main(String[] args) 
{
System.out.println("start of java code");
PriorityQueue pq=new PriorityQueue();
pq.add(new Interview("test yantra", 50, 23.12));
pq.add(new Interview("Google", 55, 632.25));
pq.add(new Interview("Dell", 60, 175.36));
pq.add(new Interview("Ibm", 57, 22.52));
pq.add(new Interview("Amazon", 80, 7896.35));
int size=pq.size();
System.out.println("first priority queue output ouput");
for (int i = 0; i < size; i++)
{
Object ob=pq.poll();
System.out.println(ob);
}
PriorityQueue pq2=new PriorityQueue(new SortBasedOnPercentage());
pq2.add(new Interview("test yantra", 50, 23.12));
pq2.add(new Interview("Google", 14, 632.25));
pq2.add(new Interview("Dell", 23, 175.36));
pq2.add(new Interview("Ibm", 5263, 22.52));
pq2.add(new Interview("Amazon", 5, 7896.35));
int size2=pq2.size();
System.out.println("first priority queue output ouput");
for (int i = 0; i < size2; i++)
{
Object ob=pq2.peek();
System.out.println(ob);
}
System.out.println("end of java code");
}
}