package com.collectionssamples;

import java.util.TreeSet;

public class TreeSetSet {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(20);
		t1.add(120);
		t1.add(60);
		t1.add(20);
		t1.add(40);
	//	t1.add(null); //does not allow null
		System.out.println(t1);
	}

}
