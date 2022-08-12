package com.bl.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

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
	
	public void deleteData() {
		Linkedlist list = new Linkedlist();
		
		list.add(56);
		list.add(30);
		list.add(70);
        
		list.deleteNode(56);
		
		System.out.println();
		System.out.print("Linkedlist sequence after deleted : ");
		list.dispalyLinkedList();
		
	}
	

	public void deleteLastElementData() {
		Linkedlist list = new Linkedlist();
		
		list.add(56);
		list.add(30);
		list.add(70);
        
		list.popLastNode(70);
		
		System.out.println();
		System.out.print("Linkedlist sequence after last element deleted : ");
		list.dispalyLinkedList();
		
	}
	
	public void searchElementData() {
		Linkedlist list = new Linkedlist();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the three key values: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		list.add(x);
		list.add(y);
		list.add(z);
		list.dispalyLinkedList();
        System.out.println();
		 if (list.search(list.head, 30))
	            System.out.println("Searched element is found");
	        else
	            System.out.println("Searched element is not found");
		
	}
	
	public void searchAndInsertData() {
		Linkedlist list = new Linkedlist();
		
		System.out.println();
		
		list.add(56);
		list.add(30);
		
		
		
        System.out.println();
        
		 if (list.search(list.head, 56)) {
			
			 list.insertNextNode(40, 30);
			 
			 list.add(70);
			// list.insertNextNode(40, 30);
			 
		 System.out.println("Element is added");
		 }   
	        else {
	            System.out.println("Searched element is not found");
	        }
		
		 list.dispalyLinkedList();
	}
	
}
