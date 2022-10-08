package com.ty.sorting;

public class BubbleSortAscendingOrder {

	public static int[] bubbleSortAscendingOrder(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 19, 30, 10 };

		int[] array = bubbleSortAscendingOrder(arr);

		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
