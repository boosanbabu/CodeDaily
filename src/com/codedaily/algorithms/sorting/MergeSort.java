package com.codedaily.algorithms.sorting;

public class MergeSort {

	public static void mergeSort(int a[], int start, int end) {

		if (start >= end) {
			return;
		}
		int mid = start / 2 + end / 2;
		mergeSort(a, start, mid);
		mergeSort(a, mid + 1, end);
		mergeArray(a, start, mid, end);

	}

	public static void mergeArray(int a[], int l, int m, int r) {
		int i = l, j = m + 1;
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int x = 0; x < n1; x++) {
			L[x] = a[i++];
		}

		for (int x = 0; x < n2; x++) {
			R[x] = a[j++];
		}

		i = 0;
		j = 0;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[l++] = L[i++];
			} else if (L[i] > R[j]) {
				a[l++] = R[j++];
			}
		}

		while (j < n2) {
			a[l++] = R[j++];
		}

		while (i < n1) {
			a[l++] = L[i++];
		}
	}

	public static void main(String[] args) {

		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 10 };
		mergeSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
