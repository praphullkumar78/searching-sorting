package com.ty.sorting;

public class BubbleSortDescendingOrder {

	public static int[] bubbleSortDescendingOrder(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 44, 22, 66, 77, 44, 33, 123 };

		int[] array = bubbleSortDescendingOrder(arr);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
