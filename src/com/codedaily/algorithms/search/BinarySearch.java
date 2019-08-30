package com.codedaily.algorithms.search;

public class BinarySearch {

	/**
	 * Returns index of searchElement in the array, -1 if not found<br>
	 * Prerequisite : Array should be sorted
	 * 
	 * @param a
	 * @param search
	 * @return
	 */
	public static int search(int a[], int searchElement) {
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == searchElement) {
				return mid;
			}

			if (a[mid] < searchElement) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;
	}

	/**
	 * Returns index of searchElement in the array, -1 if not found<br>
	 * Prerequisite : Array should be sorted
	 * 
	 * @param a
	 * @param search
	 * @return
	 */
	public static int search(int a[], int searchElement, int start, int end) {
		if (end < start)
			return -1;

		int mid = start + (end - start) / 2;
		if (a[mid] == searchElement) {
			return mid;
		}

		if (a[mid] < searchElement) {
			return search(a, searchElement, mid + 1, end);
		} else {
			return search(a, searchElement, start, mid - 1);
		}

	}

	private static int searchRecursive(int[] ar, int i) {
		return search(ar, i, 0, ar.length - 1);
	}

	public static void main(String[] a) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(search(ar, 4));
		System.out.println(searchRecursive(ar, 4));
	}

}
