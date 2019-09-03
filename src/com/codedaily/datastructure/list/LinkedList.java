package com.codedaily.datastructure.list;

import java.util.NoSuchElementException;

import com.codedaily.datastructure.base.Node;

public class LinkedList extends List {

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	@Override
	public void insertAtEnd(int d) {
		if (head == null) {
			head = new Node(d);
			tail = head;
			return;
		}

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = new Node(d);
		tail = curr.next;
	}

	@Override
	public void insertAtStart(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;

		if (head.next == null) {
			tail = head;
		}
	}

	@Override
	public void insertAtPosition(int d, int pos) {
		if (head == null && pos != 0) {
			throw new IndexOutOfBoundsException("Cannot insert at given index");
		}
		Node newNode = new Node(d);
		if (head == null && pos == 0) {
			head = newNode;
			tail = head;
			return;
		}

		Node curr = head;
		Node prev = null;
		int i = 0;

		while (curr != null) {
			if (i == pos) {
				if (prev == null) {
					newNode.next = head;
					head = newNode;
					head.next = curr;
					return;
				}
				newNode.next = curr;
				prev.next = newNode;
				if (prev.next.next == null) {
					tail = newNode;
				}
				return;
			}
			i++;
			prev = curr;
			curr = curr.next;
		}
		if (i == pos) {
			tail = newNode;
			prev.next = newNode;
			return;
		}

		throw new IndexOutOfBoundsException("Given index doesnot exist!");

	}

	/**
	 * Delete all entries with data value as that of the given key
	 * 
	 * @param key
	 */
	@Override
	public void delete(int key) {
		if (head == null) {
			throw new NoSuchElementException("List is Empty! Cannot find element with the given key");
		}

		Node curr = head;
		Node prev = null;
		boolean deleted = false;
		while (curr != null) {
			if (curr.data == key) {
				deleted = true;
				// If found at head
				if (prev == null) {
					head = curr.next;
					return;
				}
				prev.next = curr.next;
				if (curr == tail) {
					tail = prev;
				}
			}
			prev = curr;
			curr = curr.next;
		}

		if (!deleted) {
			throw new NoSuchElementException("Cannot find element with the given key");
		}

	}

	@Override
	public void deleteFromPosition(int pos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {
		if (head == null) {
			return;
		}
		Node curr = head;
		Node next = head.next;
		while (next != null) {
			if (curr == head) {
				curr.next = null;
			}
			Node link = next.next;
			next.next = curr;
			curr = next;
			next = link;
		}
		head = curr;
	}

	@Override
	public void display() {
		if (head == null) {
			System.out.println("[]");
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println();
	}

	@Override
	public Node getElement(int d) {
		if (head == null) {
			throw new NoSuchElementException("List is Empty! Cannot find element with the given key");
		}

		Node curr = head;

		while (curr != null) {
			if (curr.data == d) {
				return curr;
			}

			curr = curr.next;
		}
		throw new NoSuchElementException("Cannot find element for the given key ");
	}

	public Node removeFirstElement() {
		if (head == null) {
			throw new IndexOutOfBoundsException("Nothing to remove!");
		}
		System.out.println("Removing first element");
		Node temp = head;
		if (head != null) {
			head = head.next;
		}
		return temp;
	}

}
