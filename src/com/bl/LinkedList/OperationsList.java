package com.bl.LinkedList;

import java.util.LinkedList;

public class OperationsList {
	
	public void addData() {
		Linkedlist linkedlist = new Linkedlist();
		//Adding elements to the linkedlist
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		linkedlist.dispalyLinkedList();

	//created Linkedlist and added the integers to the list
			LinkedList<Integer> list = new LinkedList<>();
			
			list.add(30);
			list.addLast(70);
			list.addFirst(56);
			
			System.out.println(list.toString());
			
	}
//	creating method for list of operations
	public void appendData() {
		
		Linkedlist list = new Linkedlist();
		list.append(56);
		list.append(30);
		list.append(70);
		list.dispalyLinkedList();
		
	}
	
	
}
