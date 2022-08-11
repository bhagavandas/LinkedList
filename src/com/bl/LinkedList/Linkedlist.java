package com.bl.LinkedList;

public class Linkedlist {
	INode head;
	INode tail;

	public void add(int i) {
		// creating the object for INode
		INode newNode = new INode(i);
		// if head is null, the new node will be added to head
		if (head == null)
			head = newNode;
		else {
			INode pointer = head;
			if (head != null) {
				while (pointer.next != null) {
					pointer = pointer.next;
				}

				pointer.setNext(newNode);
			}
		}
	}
	
	public void dispalyLinkedList() {
		INode currentNode = head;
		while ( currentNode != null) {
			System.out.print(currentNode.getKey() + " -> ");
			currentNode = currentNode.next;
		}
	}

}
