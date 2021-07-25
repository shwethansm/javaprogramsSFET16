package com.CollectionDemo;

class Property
{
	int propertynumber;
	long propertyid;
	double cost;
	public Property(int propertynumber,int propertyid, double cost) 
	{
		this.propertynumber = propertynumber;
		this.propertyid = propertyid;
		this.cost = cost;
	}
	@Override
	public String toString() 
	{
		return "Property [propertynumber=" + propertynumber + ", propertyid=" + propertyid + ", cost=" + cost + "]";
	}
	@Override
	public int hashCode()
	{
		return (int) (propertyid);
	}
	@Override
	public boolean equals(Object ob)
	{
		Property pt=(Property)ob;
		return this.propertyid==pt.propertyid;
	}
}