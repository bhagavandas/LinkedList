package com.bl.LinkedList;

import java.util.LinkedList;

public class OperationsList {

	public void addData() {
		Linkedlist linkedlist = new Linkedlist();
		// Adding elements to the linkedlist
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		linkedlist.dispalyLinkedList();

		// created Linkedlist and added the integers to the list
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

	public void insertData() {
		Linkedlist list = new Linkedlist();
		list.insertNode(56);
		list.insertNode(70);
		list.insertNode(30);
		System.out.println();
		System.out.print("Linkedlist sequence after inserting : ");
		list.dispalyLinkedList();

	}
	
	public void DeleteData() {
		Linkedlist list = new Linkedlist();
		
		list.add(56);
		list.add(30);
		list.add(70);
        
		list.deleteNode(56);
		
		System.out.println();
		System.out.print("Linkedlist sequence after deleted : ");
		list.dispalyLinkedList();
		
	}
	

	public void DeleteLastElementData() {
		Linkedlist list = new Linkedlist();
		
		list.add(56);
		list.add(30);
		list.add(70);
        
		list.popLastNode(70);
		
		
		System.out.println();
		System.out.print("Linkedlist sequence after last element deleted : ");
		list.dispalyLinkedList();
		
	}
	
}
