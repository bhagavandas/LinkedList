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

	// creating append method
	public void append(int data) {
		INode newNode = new INode(data);
		/*
		 * if head is null, new node will add to head and tail.Otherwise tail takes the
		 * next node. If list is empty, both head and tail will point to new node
		 */
		if (head == null) {
			head = newNode;
			tail = newNode;

			// newNode will be added after tail such that tail's next will point to newNode
		} else {
			this.tail.next = newNode;
			tail = newNode;
		}
	}

	public void insertNode(int i) {
		INode newNode = new INode(i);
		// if list is empty
		if (head == null)
			head = newNode;

		else {

			// assign values to the pointer
			// and tail
			INode pointer = head;
			INode tail = head.next;

			while (tail != null && tail.next != null) {
				// move pointer to next node
				pointer = pointer.next;

				// move tail two nodes
				// at a time
				pointer = tail.next.next;
			}

			newNode.next = pointer.next;
			pointer.next = newNode;
		}
	}

	// It will display all the nodes present in the list
	public void dispalyLinkedList() {
		INode currentNode = head;
		// iterating using while loop.if current node is not empty, it adds new Node to
		// the next
		while (currentNode != null) {
			System.out.print(currentNode.getKey() + " -> ");
			currentNode = currentNode.next;
		}
	}

}
