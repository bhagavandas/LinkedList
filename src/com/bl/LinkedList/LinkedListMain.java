package com.bl.LinkedList;

import java.util.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		Linkedlist linkedlist = new Linkedlist();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		
		linkedlist.dispalyLinkedList();
	
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(30);
		list.addLast(70);
		list.addFirst(56);
		System.out.println(list.toString());
	}

}
