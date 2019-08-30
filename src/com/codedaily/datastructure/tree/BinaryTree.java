package com.codedaily.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public abstract class BinaryTree {

	TreeNode root;

	public BinaryTree() {
		root = null;
	}

	void inOrderTraverse() {
		inOrderTraverse(root);
	}

	void inOrderTraverse(TreeNode root) {
		if (root == null) {
			return;
		}

		inOrderTraverse(root.left);
		System.out.print(root.key + " ");
		inOrderTraverse(root.right);

	}

	void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key + " ");
	}

	void preOrderTraverse() {
		preOrder(root);
	}

	void postOrderTraverse() {
		postOrder(root);
	}

	public boolean isBST() {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(TreeNode node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.key <= min || node.key >= max) {
			return false;
		}

		return isBST(node.left, min, node.key) && isBST(node.right, node.key, max);
	}

	public void DFSDisplay() {
		if (root == null) {
			System.err.println("Empty tree");
			return;
		}

		Stack<TreeNode> bfsStack = new Stack<TreeNode>();
		bfsStack.add(root);
		while (!bfsStack.isEmpty()) {
			TreeNode top = bfsStack.pop();
			if (top.hasLeft()) {
				bfsStack.push(top.left);
			}
			if (top.hasRight()) {
				bfsStack.push(top.right);
			}

			System.out.print(top + " ");
		}
	}

	public void BFSDisplay() {
		if (root == null) {
			System.err.println("Empty Tree");
			return;
		}
		Queue<TreeNode> dfsQ = new LinkedList<TreeNode>();

		dfsQ.add(root);
		while (!dfsQ.isEmpty()) {
			TreeNode front = dfsQ.peek();
			dfsQ.remove();
			if (front.hasLeft()) {
				dfsQ.add(front.left);
			}
			if (front.hasRight()) {
				dfsQ.add(front.right);
			}

			System.out.print(front + " ");
		}
	}

	public boolean has(int searchKey) {
		return findElement(root, searchKey) != null;
	}

	public void add(int key) {
		insert(root, key);
	}

	public void DFSRecur() {
		DFSRecur(root);
	}

	public void DFSRecur(TreeNode node) {
		if (node == null) {
			return;
		}

		DFSRecur(node.left);
		System.out.print(" " + node.key);
		DFSRecur(node.right);
	}

	public abstract TreeNode insert(TreeNode node, int key);

	public abstract TreeNode findElement(TreeNode node, int searchKey);

	public abstract TreeNode remove(TreeNode node, int key);

}
