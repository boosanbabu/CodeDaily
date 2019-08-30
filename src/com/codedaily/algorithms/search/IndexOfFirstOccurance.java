package com.codedaily.algorithms.search;

public class IndexOfFirstOccurance {

	/**
	 * Returns index of firstOccurence of searchElement in the array, -1 if not
	 * found<br>
	 * Prerequisite : Array should be sorted
	 * 
	 * @param a
	 * @param search
	 * @return
	 */
	public static int search(int a[], int searchElement, int start, int end) {
		if (end < start) {
			return Integer.MAX_VALUE;
		}

		int mid = start + (end - start) / 2;
		if (a[mid] == searchElement) {
			return Math.min(mid, search(a, searchElement, start, mid - 1));

		}

		if (a[mid] < searchElement) {
			return search(a, searchElement, mid + 1, end);
		} else {
			return search(a, searchElement, start, mid - 1);
		}
	}

	private static int search(int[] ar, int i) {
		int res = search(ar, i, 0, ar.length - 1);
		return res == Integer.MAX_VALUE ? -1 : res;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 2, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 8, 9 };
		System.out.println(search(ar, 5));
		System.out.println(search(ar, 8));
		System.out.println(search(ar, 16));
		System.out.println(search(ar, 11));
		System.out.println(search(ar, 1));
		System.out.println(search(ar, 2));
		System.out.println(search(ar, 9));
	}

}
