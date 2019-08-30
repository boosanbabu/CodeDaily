package com.codedaily.datastructure.tree;

public class BinarySearchTree extends BinaryTree {

	public BinarySearchTree() {
		super();
	}

	public void add(int key) {
		root = insert(root, key);
	}

	@Override
	public TreeNode insert(TreeNode root, int key) {
		if (root == null) {
			root = new TreeNode(key);
			return root;
		}

		if (key <= root.key) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}

	public void remove(int key) {
		remove(root, key);
	}

	public boolean has(int searchKey) {
		return findElement(root, searchKey) != null;
	}

	/**
	 * Searching on BST is highly efficient - average O(log n) worst case - O(n)
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	public TreeNode findElement(TreeNode root, int key) {
		if (root == null)
			return null;
		if (root.key == key)
			return root;

		if (key > root.key) {
			return findElement(root.right, key);
		} else {
			return findElement(root.left, key);
		}
	}

	/**
	 * Find minValue - root cannot be null
	 * 
	 * @param root
	 * @return
	 */
	public TreeNode minValue(TreeNode root) {
		while (root != null && root.left != null) {
			root = root.left;
		}
		return root;

	}

	/**
	 * Find minValue - root cannot be null
	 * 
	 * @param root
	 * @return
	 */
	public TreeNode minValue() {
		return minValue(root);

	}

	@Override
	public TreeNode remove(TreeNode node, int key) {
		if (node == null) {
			return node;
		}
		/**
		 * If key to be deleted found
		 */
		if (key == node.key) {
			// Case 1 : No child
			if (!node.hasChild()) {
				return null;
			}

			// Case 2 : Has one child
			if (node.hasLeft() && !node.hasRight()) {
				return node.left;
			}

			if (!node.hasLeft() && node.hasRight()) {
				return node.right;
			}

			/**
			 * Case 3 : Has two child - Find the minValue in the right subtree
			 * Delete the nodes having the minValue in right subtree;
			 * 
			 */
			if (node.hasBothChild()) {
				TreeNode nextMinValue = minValue(node.right);
				node.key = nextMinValue.key;
				node.right = remove(node.right, nextMinValue.key);
			}

		}
		// If key is smaller, go to left
		else if (key < node.key) {
			node.left = remove(node.left, key);
		}
		// If key is greater than node value, go to right
		else {
			node.right = remove(node.right, key);
		}

		return node;
	}

}
