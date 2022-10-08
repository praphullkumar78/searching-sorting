package com.ty.searching;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		Arrays.sort(arr);

		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 11, 22, 10, 40, 30, 77, 33 };
		int key = 30;
		int index = binarySearch(arr, key);
		if (index > 0) {
			System.out.println("key " + key + " present on index : " + index);
		} else {
			System.out.println("Key not present in Array");
		}
	}

}
