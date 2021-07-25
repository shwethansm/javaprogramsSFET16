package com.collectionssamples;

import java.util.ArrayList;

public class sample3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		ArrayList list2 = new ArrayList<>();
		list2.add(40);
		list2.add(60);
		list2.add(50);
		System.out.println(list);
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		
		
	}

}
