package com.collectionssamples;

import java.util.ArrayList;

public class Sample9 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(60);
		list.add(50);
		ArrayList list2 = new ArrayList<>();
		list2.add(40);
		list2.add(60);
		list2.add(50);
		//list.retainAll(list2);//
		//list.removeAll(list2);//removes all duplicates
		System.out.println(list.size());
		System.out.println(list);
		list.remove(3);//remove particular index from the list in this 3 is 60 removed
		System.out.println(list);
		System.out.println(list.size());
		
		//System.out.println(list2);
		
		//System.out.println(list);
		
	}

}
