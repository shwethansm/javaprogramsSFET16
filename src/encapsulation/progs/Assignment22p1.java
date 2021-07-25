package encapsulation.progs;
class Circle
{
private float radius;
private float pi=3.14f;
Circle(float radius)
{
	this.radius=radius;
}
public float getcircumference()
{
 float circumference=(2*pi*radius);
 return circumference;
}
public float getarea()
{
	float area=(pi*radius*radius);
	return area;
}
public float getdiameter()
{
	float diameter=2*radius;
	return diameter;
}
public void setradius(float radius)
	{
	this.radius=radius;
	}
}
class Assignment22p1 
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Circle c1=new Circle(4.5f);
		System.out.println("circumference="+c1.getcircumference());
		System.out.println("area="+c1.getarea());
		System.out.println("diameter="+c1.getdiameter());
		c1.setradius(2.0f);
        System.out.println("circumference="+c1.getcircumference());
		System.out.println("area="+c1.getarea());
		System.out.println("diameter="+c1.getdiameter());
		System.out.println("end of java code");
	}
}

//public class Assignment22p1 {

//}
