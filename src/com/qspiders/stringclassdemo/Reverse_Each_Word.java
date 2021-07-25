package com.qspiders.stringclassdemo;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		String s="welcome to tyss comp";
		String [] str=s.split(" ");
		String [] rev=new String[str.length];
		for(int i=str.length-1;i>=0;i--) {
			//System.out.print(str[i]);
			for(int j=0;j<rev.length;j++) {
				rev[j]=str[i];
				System.out.println(rev[j]);
				}
			}
	//System.out.println(Arrays.toString(rev));
	}

}
