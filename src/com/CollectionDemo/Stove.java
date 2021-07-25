package com.CollectionDemo;

public class Stove 
{
String name;
boolean automatic;
int noofburners;
public Stove(String name, boolean automatic, int noofburners) 
{
	this.name = name;
	this.automatic = automatic;
	this.noofburners = noofburners;
}
@Override
public String toString() {
	return "Television [name=" + name + ", automatic=" + automatic + ", noofburners=" + noofburners + "]";
}

}