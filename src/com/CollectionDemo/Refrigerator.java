package com.CollectionDemo;

public class Refrigerator 
{
String brand;
String color;
int litres;
public Refrigerator(String brand,String color,int litres) 
{
	this.brand = brand;
	this.color = color;
	this.litres = litres;
}
@Override
public String toString() {
	return "Refrigerator [brand=" + brand + ", color=" + color + ", litres=" + litres + "]";
}

}