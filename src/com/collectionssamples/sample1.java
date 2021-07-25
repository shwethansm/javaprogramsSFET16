package com.collectionssamples;

import java.util.ArrayList;

public class sample1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("Shwetha");
		list.add(100);
		list.add(100);
		list.add('B');
		list.add(45.67);
		list.add(true);
		list.add("Shree");
		//System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		

	}

}
