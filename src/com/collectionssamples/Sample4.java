package com.collectionssamples;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("Shwetha");
		list.add("Shreedhar");
		list.add("Skillrary");
		list.add("Shwetha");
		int count=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals("Shwetha")) {
				count++;
				//System.out.println("passed");
			}
			
		}
		System.out.println("total number repeating="+count);
	}

}
