package com.codedaily.datastructure.list;

import com.codedaily.datastructure.base.Node;

public abstract class List {

	Node head;
	Node tail;

	public abstract void insertAtEnd(int d);

	public abstract void insertAtStart(int d);

	public abstract void insertAtPosition(int d, int pos);

	public abstract void delete(int key);

	public abstract void deleteFromPosition(int pos);

	public abstract void reverse();

	public abstract void display();

	/**
	 * Get element with the given data value
	 * 
	 * @param d
	 * @return
	 */
	public abstract Node getElement(int d);

}
