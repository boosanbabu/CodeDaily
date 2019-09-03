package com.codedaily.run;

import com.codedaily.datastructure.list.LinkedList;
import com.codedaily.datastructure.list.List;

public class RunIt {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		l.insertAtStart(1);
		l.insertAtStart(2);
		l.insertAtStart(3);
		l.insertAtStart(4);
		l.insertAtStart(5);
		l.display();
		
		l.reverse();
		l.display();
	}

}
