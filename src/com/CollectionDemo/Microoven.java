package com.CollectionDemo;

public class Microoven 
{
String brand;
String type;
int size;
public Microoven(String brand, String type, int size) 
{
	this.brand = brand;
	this.type = type;
	this.size = size;
}
@Override
public String toString() {
	return "Microoven [brand=" + brand + ", type=" + type + ", size=" + size + "]";
}

}