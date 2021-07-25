package com.collectionssamples;

import java.util.ArrayList;

public class sample2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("Shwetha");
		list.add(100);
		list.add(100);
		list.add('B');
		list.add(45.67);
		list.add(true);
		list.add("Shree");
		
		list.add(3, 200);
		System.out.println(list);
	}

}
