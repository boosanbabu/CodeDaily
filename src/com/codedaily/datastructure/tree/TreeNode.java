package com.codedaily.datastructure.tree;

public class TreeNode {
	int key;
	TreeNode left, right;

	public TreeNode(int d) {
		key = d;
	}

	TreeNode(int d, TreeNode l, TreeNode r) {
		key = d;
		left = l;
		right = r;
	}

	boolean hasChild() {
		return hasRight() || hasLeft();
	}

	boolean hasBothChild() {
		return hasRight() && hasLeft();
	}

	boolean hasRight() {
		return right != null;
	}

	boolean hasLeft() {
		return left != null;
	}

	public String toString() {
		return key + "";
	}
}