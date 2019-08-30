package com.codedaily.algorithms.sorting;

public class QuickSort {

	public static void quickSort(int a[], int startIndx, int endIndx) {

		if (startIndx >= endIndx) {
			return;
		}
		int partionIndx = partition(a, startIndx, endIndx);
		quickSort(a, startIndx, partionIndx - 1);
		quickSort(a, partionIndx + 1, endIndx);
	}

	private static int partition(int[] a, int startIndx, int endIndx) {
		int pivot = a[endIndx];
		int partionIndx = startIndx;
		for (int i = startIndx; i < endIndx; i++) {
			/**
			 * If element is less than pivot, swap element from that index to
			 * the partionIndx
			 */
			if (a[i] < pivot) {
				int temp = a[i];
				a[i] = a[partionIndx];
				a[partionIndx] = temp;
				partionIndx++;
			}
		}

		int temp = a[endIndx];
		a[endIndx] = a[partionIndx];
		a[partionIndx] = temp;

		return partionIndx;
	}

	/**
	 * Swap array elements by given indices
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}

	public static void main(String[] args) {

		int a[] = { 3, 2, 4, 5, 1, 4, 9, -1, -9, 9, 8 };
		System.out.println("Actual Array");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		quickSort(a, 0, a.length - 1);
		System.out.println("\nSorted Output");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
