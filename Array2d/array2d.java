package Array2d;

import java.util.Scanner;

public class array2d {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// int[] [] arr = get();
		// display(arr);
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr1 = { { 7, 8, 9, 10 }, { 11, 12, 13, 14 }, { 15, 16, 17, 18 } };

		// verticaldisp(arr);
		// wavedisp(arr);
		// spiraldisp(arr);
		multiply(arr, arr1);
	}

	public static int[][] get() {
		System.out.println("rows?");
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < rows; row++) {
			System.out.println("columns for row" + row);
			int cols = scn.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < cols; col++) {
				System.out.println("enter the values for" + row + "," + col);
				arr[row][col] = scn.nextInt();
			}
		}
		return arr;

	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void verticaldisp(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void wavedisp(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
		}

	}

	public static void spiraldisp(int[][] arr) {
		int minr = 0;
		int maxr = arr.length;
		int minc = 0;
		int maxc = arr[0].length;
		int el = 0;
		int no = arr.length * arr[0].length;
		while (el < no) {

			for (int i = minr; i < maxr && el < no; i++) {
				System.out.print(arr[i][minc] + " ");
				el++;

			}
			minc++;

			for (int i = minc; i < maxc && el < no; i++) {
				System.out.print(arr[maxr - 1][i] + " ");
				el++;
			}
			maxr--;

			for (int i = maxr - 1; i >= 0 && el < no; i--) {
				System.out.print(arr[i][maxc - 1] + " ");
				el++;
			}
			maxc--;

			for (int i = maxc - 1; i > 0 && el < no; i--) {
				System.out.print(arr[minr][i] + " ");
				el++;
			}
			minr++;

		}
	}

	public static int[][] multiply(int[][] arr, int[][] arr1) {
		int r1 = arr.length;
		int c1 = arr[0].length;
		int r2 = arr1.length;
		int c2 = arr1[0].length;
		int[][] arr3 = new int[r1][c2];

		if (c1 == r2) {
			for (int i = 0; i < r1; i++) {

				for (int j = 0; j < c2; j++) {
					int num1 = 0;
					for (int k = 0; k < r2; k++) {
						num1 += (arr[i][k] * arr1[k][j]);
					}
					arr3[i][j] = num1;
				}

			}
			return arr3;
		} else {
			return null;
		}
	}

}
