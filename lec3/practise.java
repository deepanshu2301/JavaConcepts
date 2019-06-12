package lec3;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 55 };
		System.out.println(binarysearch(arr));

	}

	private static int binarysearch(int[] arr) {

		int val = 22;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (val > arr[mid]) {
				left = mid + 1;
			} else if (val < arr[mid]) {
				right = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;

	}

}
