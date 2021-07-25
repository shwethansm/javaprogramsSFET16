package com.exceptionDemo;

class NoTicketException extends Exception
{	
}
class TravellinginVehicle
{
	void anyvehicle(boolean ticket) throws  NoTicketException
	{
		if(ticket==true)
		{
		System.out.println("proceed for travelling...");
		}
		else
		{
			throw new  NoTicketException();
		}
	}
}
public class Assignment1
{
public static void main(String[] args)
{
System.out.println("start of java code");
TravellinginVehicle ref=new TravellinginVehicle();
try 
{
	ref.anyvehicle(true);
} 
catch ( NoTicketException e)
{
	e.printStackTrace();
}
System.out.println("end of java code");
}
}
