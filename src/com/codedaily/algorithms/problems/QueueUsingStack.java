package com.codedaily.algorithms.problems;

import com.codedaily.datastructure.base.Node;
import com.codedaily.datastructure.list.Stack;

public class QueueUsingStack {

	// Enqueue Stack
	Stack stackToEnqueue = new Stack();
	// Dequeue Stack
	Stack stackToDequeue = new Stack();

	public void enqueue(int key) {
		stackToEnqueue.push(key);
	}

	public Node dequeue() {
		if (stackToEnqueue.isEmpty() && stackToDequeue.isEmpty()) {
			throw new IndexOutOfBoundsException("Dequeue not allowed on an empty Queue");
		}

		if (!stackToDequeue.isEmpty()) {
			return stackToDequeue.pop();
		}

		while (!stackToEnqueue.isEmpty()) {
			stackToDequeue.push(stackToEnqueue.pop().data);
		}
		return stackToDequeue.pop();
	}
}
