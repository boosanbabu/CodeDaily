package com.codedaily.datastructure.base;

public class TreeNode {
	public int key;
	public TreeNode left, right;

	public TreeNode(int d) {
		key = d;
	}

	TreeNode(int d, TreeNode l, TreeNode r) {
		key = d;
		left = l;
		right = r;
	}

	public boolean hasChild() {
		return hasRight() || hasLeft();
	}

	public boolean hasBothChild() {
		return hasRight() && hasLeft();
	}

	public boolean hasRight() {
		return right != null;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public String toString() {
		return key + "";
	}
}