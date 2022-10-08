package com.ty.searching;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 11, 22, 33, 42, 56, 76, 55 };
		int key = 56;

		int index = linearSearch(arr, key);
		if (index > 0) {
			System.out.println("Key "+key+" present on index :"+index);
		} else {
			System.out.println("Key not present in array");
		}
	}

}
