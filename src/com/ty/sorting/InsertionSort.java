package com.ty.sorting;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 11, 3, 5, 6 };

		int[] array = insertionSort(arr);

		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
