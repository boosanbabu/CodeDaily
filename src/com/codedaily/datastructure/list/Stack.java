package com.codedaily.datastructure.list;

import com.codedaily.datastructure.base.Node;

public class Stack {
	private LinkedList list = new LinkedList();

	public Node peek() {
		return list.getHead();
	}

	public void push(int d) {
		list.insertAtStart(d);
	}

	public Node pop() {
		return list.removeFirstElement();
	}

	public void display() {
		list.display();
	}

	public boolean isEmpty() {
		return list.getHead() == null;
	}

}
