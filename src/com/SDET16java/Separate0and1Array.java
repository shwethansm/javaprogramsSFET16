package com.SDET16java;

public class Separate0and1Array {

	public static void main(String[] args) {
	int a[]= {1,0,1,1,0,0};
	int b[]=new int[a.length];
	int k=a.length-1;
	int j=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==0)
		{
			b[j]=a[i];
			j++;
		}
		else
		{
			b[k]=a[i];
			k--;
		}
	}
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
}
	}

}
