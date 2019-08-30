package com.codedaily.run;

import com.codedaily.datastructure.tree.BinarySearchTree;

public class TreeRunner {

	public static void main(String... args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.add(7);
		bst.add(5);
		bst.add(15);
		bst.add(3);
		bst.add(-6);
		bst.add(11);
		bst.add(21);
		bst.add(2);
		bst.add(24);
		bst.add(-7);

		System.out.println("LEVEL ORDER ");
		bst.BFSDisplay();
		System.out.println("Is BST? " + bst.isBST());

		System.out.println("\nLEVEL ORDER ");
		bst.BFSDisplay();

		System.out.println("Is BST? " + bst.isBST());

		bst.DFSRecur();
		System.out.println();
		bst.DFSDisplay();
	}

}
