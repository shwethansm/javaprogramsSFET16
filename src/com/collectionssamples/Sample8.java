package com.collectionssamples;

import java.util.ArrayList;
import java.util.Collections;

public class Sample8 {

	public static void main(String[] args) {
		
			ArrayList list = new ArrayList<>();
			list.add(100);
			list.add(500);
			list.add(300);
			list.add(150);
			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
	}

}
