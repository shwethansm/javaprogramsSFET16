package com.collectionssamples;

import java.util.ArrayList;
import java.util.Collections;

public class Sample6 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("Shwetha");
		list.add("Shreedhar");
		list.add("Qspiders");
		list.add("Bangalore");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
