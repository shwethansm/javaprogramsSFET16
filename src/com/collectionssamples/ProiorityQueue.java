package com.collectionssamples;

import java.util.PriorityQueue;

public class ProiorityQueue {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(80);
		queue.add(70);
		queue.add(12);
		System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
	}

}
