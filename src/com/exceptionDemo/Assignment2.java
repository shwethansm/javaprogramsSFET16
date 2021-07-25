package com.exceptionDemo;

class InvalidPinException extends Exception
{	
}
class Banking
{
	void transaction(int validpin) throws InvalidPinException
	{
		if(validpin==1234)
		{
		System.out.println("proceed for transaction...");
		}
		else
		{
			throw new InvalidPinException();
		}
	}
}
public class Assignment2
{
public static void main(String[] args)
{
System.out.println("start of java code");
Banking ref=new Banking();
try 
{
	ref.transaction(1234);
} 
catch (InvalidPinException e)
{
	e.printStackTrace();
}
System.out.println("end of java code");
}
}