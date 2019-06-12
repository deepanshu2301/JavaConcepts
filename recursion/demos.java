package recursion;

public class demos {

	public static void main(String[] args) {

//		 PI(5);
//		PD(5);
//		PDI(5);
//		 System.out.println(factorial(5));
//		 System.out.println(power(2, 6));

//		 System.out.println(fibonacci(5));

		int[] arr = { 10, 50, 50, 200, 30, 40, 50, 70 };

//		 displayArray(arr, 0);
		// System.out.println(max(arr, 0));
//		 System.out.println(findBoolean(arr, 0, 50));
//		 System.out.println(findStartIndex(arr, 0, 500));
//		 System.out.println(findLastIndex(arr, 0, 50));
//		 int[] res = findAllIndices(arr, 0, 50, 0) ;
//		//
//		 for(int val : res) {
//		 System.out.print(val + " ");
//		 }

//		 printCols(1, 5);
//		 printBox(1, 1, 4);
		bubbleSort(arr, 0, arr.length - 1);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void PD(int n) {

		if (n == 0) {
			return;

		}
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {

		if (n == 0)
			return;

		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {

		if (n == 0)
			return;

		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);

	}

	public static int factorial(int n) {

		if (n == 0)
			return 1;

		// assumption
		int fnm1 = factorial(n - 1);

		// self work
		int fn = n * fnm1;

		return fn;

	}

	public static int power(int x, int n) {

		if (n == 0)
			return 1;

		int xpnm1 = power(x, n - 1);
		int xpn = x * xpnm1;

		return xpn;

	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;
	}

	public static void displayArray(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		System.out.println(arr[vidx]);
		displayArray(arr, vidx + 1);

	}

	public static void displayReverseArray(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		displayReverseArray(arr, vidx + 1);
		System.out.println(arr[vidx]);

	}

	public static int max(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return Integer.MIN_VALUE;
		}

		int rr = max(arr, vidx + 1);

		if (arr[vidx] > rr) {
			return arr[vidx];
		} else {
			return rr;
		}

	}

	public static boolean findBoolean(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return false;
		}

		if (arr[vidx] == item) {
			return true;
		}

		return findBoolean(arr, vidx + 1, item);
	}

	public static int findStartIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == item) {
			return vidx;
		}

		return findStartIndex(arr, vidx + 1, item);

	}

	public static int findLastIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		int ra = findLastIndex(arr, vidx + 1, item);

		if (arr[vidx] == item && ra == -1) {
			return vidx;
		}

		return ra;
	}

	public static int[] findAllIndices(int[] arr, int vidx, int item, int c) {

		if (vidx == arr.length) {
			int[] br = new int[c];
			return br;
		}

		int[] ra;
		if (arr[vidx] == item) {
			ra = findAllIndices(arr, vidx + 1, item, c + 1);
			ra[c] = vidx;

		} else {
			ra = findAllIndices(arr, vidx + 1, item, c);
		}

		return ra;
	}

	public static void printCols(int col, int n) {

		if (col > n) {
			return;
		}

		System.out.print("*");
		printCols(col + 1, n);
	}

	public static void printBox(int row, int col, int n) {

		if (row > n) {
			return;
		}

		if (col > row) {
			System.out.println();
			printBox(row + 1, 1, n);

			return;
		}

		System.out.print("*");
		printBox(row, col + 1, n);

	}

	public static void bubbleSort(int[] arr, int si, int ei) {

		if (ei == 0) {
			return;
		}

		if (si == ei) {
			bubbleSort(arr, 0, ei - 1);
			return;
		}

		if (arr[si] > arr[si + 1]) {

			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
		}

		bubbleSort(arr, si + 1, ei);

	}

}
