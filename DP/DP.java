package DP;

public class DP {

	public static void main(String[] args) {
		// int n = 2;
		// int[] strg = new int[n + 1];
		// System.out.println(fibonacciRbtr(n, strg));
		// System.out.println(fibonacciI(n));
		// System.out.println(fibonacciIslider(n));
		// System.out.println(printboardpath(n, 0));
		// System.out.println(printboardpathRbtr(n, 0, strg));
		// System.out.println(printboardpathI(n));
		// System.out.println(printboardpathIslider(n));
		// System.out.println(printmazepath(0, 0, n, n));
		// System.out.println(printmazepathRbtr(0, 0, n, n));
		// System.out.println(printmazepathI(n, n));
		// System.out.println(printmazepathIslider(n));
		// System.out.println(azepathdd(0, 0, n, n, ""));
		// System.out.println(mazepathddRbtr(0, 0, n, n));
		// System.out.println(LCS("dfgsvgsvhtvhvesrgrvrvrehjb","retyyterd"));
		 System.out.println(LCSBU("dfgsvgsvhtvhvesrgrvrvrehjb","rettewftvyrvd"));
		// LCSString("abcd", "agdcf");
		// System.out.println(EditDistance("abcd", "agcfd"));
//		 System.out.println(EditDistanceBU("abcde", "bcdae"));
		// int[] arr = { 1, 2, 3, 4 };
		// System.out.println(MatrixMultiplication(arr, 0, arr.length - 1));
		// System.out.println(MCM(arr));
//		int[] wts = { 1, 3, 4, 5 };
//		int[] price = { 1, 4, 5, 7 };
//		int[][] strg = new int[wts.length][8];
//		System.out.println(knapsack(wts, price, 0, 7, strg));
//		System.out.println(knapsackBU(wts, price, 7));
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

	public static int fibonacciRbtr(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibonacciRbtr(n - 1, strg);
		int fnm2 = fibonacciRbtr(n - 2, strg);

		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

	public static int fibonacciI(int n) {

		int[] strg = new int[n + 1];

		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int fibonacciIslider(int n) {

		int[] strg = new int[2];

		strg[0] = 0;
		strg[1] = 1;
		int counter = n;

		while (counter >= 2) {
			int ans = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = ans;
			counter--;
		}

		return strg[1];
	}

	public static int printboardpath(int end, int curr) {
		if (curr > end) {
			return 0;
		}

		if (curr == end) {
			return 1;
		}

		int count = 0;
		for (int i = 1; i <= 6; i++)

		{
			count += printboardpath(end, curr + i);

		}

		return count;
	}

	public static int printboardpathRbtr(int end, int curr, int[] strg) {
		if (curr > end) {
			return 0;
		}

		if (curr == end) {
			return 1;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		for (int i = 1; i <= 6; i++)

		{
			count += printboardpathRbtr(end, curr + i, strg);

		}
		strg[curr] = count;

		return count;
	}

	public static int printboardpathI(int end) {

		int[] strg = new int[end + 6];

		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}

		return strg[0];
	}

	public static int printboardpathIslider(int end) {

		int[] strg = new int[6];

		strg[0] = 1;

		for (int i = end - 1; i >= 0; i--) {
			int ans = strg[1] + strg[2] + strg[3] + strg[4] + strg[0] + strg[5];

			for (int j = 5; j >= 1; j--) {
				strg[j] = strg[j - 1];
			}
			strg[0] = ans;
		}

		return strg[0];
	}

	public static int printmazepath(int cr, int cc, int er, int ec) {
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		if (cr == er && cc == ec) {
			return 1;
		}

		count += printmazepath(cr + 1, cc, er, ec);
		count += printmazepath(cr, cc + 1, er, ec);

		return count;
	}

	public static int printmazepathRbtr(int cr, int cc, int er, int ec) {

		// top down method
		int[][] arr = new int[er][ec];
		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			return 1;
		}

		if (arr[cr][cc] != 0) {
			return arr[cr][cc];
		}
		int count = printmazepath(cr + 1, cc, er, ec);
		int count1 = printmazepath(cr, cc + 1, er, ec);
		arr[cr][cc] = count + count1;

		return arr[0][0];
	}

	public static int printmazepathI(int er, int ec) {

		int[][] arr = new int[er + 2][ec + 2];

		arr[er][ec] = 1;
		// so that loop can be initialized

		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {

				arr[i][j] += arr[i][j + 1] + arr[i + 1][j];
			}

		}
		return arr[0][0];
	}

	public static int printmazepathIslider(int er) {

		int[] arr = new int[er + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}

		for (int j = er - 1; j >= 0; j--) {
			for (int i = arr.length - 1; i >= 1; i--) {

				arr[i - 1] = arr[i] + arr[i - 1];

			}
		}
		return arr[0];
	}

	public static int mazepathdd(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			// System.out.print(ans + " ");
			return 1;
		}
		int vc = 0;

		vc += mazepathdd(cr + 1, cc, er, ec, ans + "V");
		vc += mazepathdd(cr, cc + 1, er, ec, ans + "H");
		if (cr == cc || cr + cc == er + 1) {
			vc += mazepathdd(cr + 1, cc + 1, er, ec, ans + "D");
		}
		return vc;

	}

	public static int mazepathddRbtr(int cr, int cc, int er, int ec) {

		int[][] arr = new int[er][ec];

		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			return 1;
		}
		if (arr[cr][cc] != 0) {
			return arr[cr][cc];
		}
		int vc2 = 0;
		int vc = mazepathddRbtr(cr + 1, cc, er, ec);
		int vc1 = mazepathddRbtr(cr, cc + 1, er, ec);
		// arr[cr][cc] = vc + vc1;
		if (cr == cc || cr + cc == er + 1) {
			vc2 = mazepathddRbtr(cr + 1, cc + 1, er, ec);
		}
		arr[cr][cc] = vc + vc1 + vc2;

		return arr[0][0];

	}

	public static int LCS(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int a1 = LCS(ros1, s2);
			int a2 = LCS(s1, ros2);

			ans = Math.max(a1, a2);
		}

		return ans;
	}

	public static int LCSBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int i = s1.length(); i >= 0; i--) {

			for (int j = s2.length(); j >= 0; j--) {
				{
					if (i == s1.length() || j == s2.length()) {
						strg[i][j] = 0;
					} else {

						if (s1.charAt(i) == s2.charAt(j)) {
							strg[i][j] = strg[i + 1][j + 1] + 1;
						} else {

							int ch1 = strg[i][j + 1];
							int ch2 = strg[i + 1][j];
							strg[i][j] = Math.max(ch1, ch2);
						}
					}
				}
			}
		}

		return strg[0][0];
	}

	public static void LCSString(String s1, String s2) {

		String[][] strg = new String[s1.length() + 1][s2.length() + 1];

		for (int i = s1.length(); i >= 0; i--) {

			for (int j = s2.length(); j >= 0; j--) {
				{
					if (i == s1.length() || j == s2.length()) {
						strg[i][j] = "";
					} else {

						if (s1.charAt(i) == s2.charAt(j)) {
							strg[i][j] = strg[i + 1][j + 1] + s2.charAt(j);

						} else {

							String ch1 = strg[i][j + 1];
							String ch2 = strg[i + 1][j];
							if (ch1.length() > ch2.length()) {
								strg[i][j] = ch1;
							} else {
								strg[i][j] = ch2;
							}
						}
					}
				}
			}
		}

		System.out.println(strg[0][0]);
	}

	public static int EditDistance(String s1, String s2) {

		if (s1.length() == 0 && s2.length() == 0) {
			return 0;
		}
		if (s1.length() != 0 && s2.length() == 0) {
			return s1.length();
		}
		if (s1.length() == 0 && s2.length() != 0) {
			return s2.length();
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans;
		if (ch1 == ch2) {
			ans = EditDistance(ros1, ros2);
		} else {
			int a1 = EditDistance(ros1, s2);
			int a2 = EditDistance(s1, ros2);
			int a3 = EditDistance(ros1, ros2);

			ans = Math.min(a1, Math.min(a2, a3)) + 1;
		}

		return ans;
	}

	public static int EditDistanceBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length(); row >= 0; row--) {

			for (int col = s2.length(); col >= 0; col--) {
				{

					if (col == s2.length()) {
						strg[row][col] = s1.length() - row;
					}
					if (row == s1.length()) {
						strg[row][col] = s2.length() - col;

					}
					if (col != s2.length() && row != s1.length()) {
						if (s1.charAt(row) == s2.charAt(col)) {
							strg[row][col] = strg[row + 1][col + 1];
						} else {

							int ch1 = strg[row][col + 1];
							int ch2 = strg[row + 1][col];
							int ch3 = strg[row + 1][col + 1];
							strg[row][col] = Math.min(ch1, Math.min(ch2, ch3)) + 1;
						}

					}
				}
			}
		}

		return strg[0][0];
	}

	public static int MatrixMultiplication(int[] arr, int si, int ei) {

		int ans = Integer.MAX_VALUE;

		if (si + 1 == ei) {
			return 0;
		}
		for (int i = si + 1; i <= ei - 1; i++) {

			int lh = MatrixMultiplication(arr, si, i);
			int rh = MatrixMultiplication(arr, i, ei);
			int sa = arr[si] * arr[ei] * arr[i];
			int ans1 = sa + lh + rh;
			if (ans1 < ans) {
				ans = ans1;
			}
		}

		return ans;
	}

	public static int MCM(int[] arr) {

		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 2; slide++) {

			for (int si = 0; si <= n - slide - 2; si++) {
				int ans = Integer.MAX_VALUE;
				int ei = si + slide + 1;
				for (int i = si + 1; i <= ei - 1; i++) {

					int lh = strg[si][i];
					int rh = strg[i][ei];
					int sa = arr[si] * arr[ei] * arr[i];
					int ans1 = sa + lh + rh;
					if (ans1 < ans) {
						ans = ans1;
					}

				}
				strg[si][ei] = ans;
			}
		}

		return strg[0][n - 1];

	}

	public static int knapsack(int[] wts, int[] price, int vidx, int capacity, int[][] strg) {

		if (vidx == wts.length) {
			return 0;
		}
		if (strg[vidx][capacity] != 0) {
			return strg[vidx][capacity];
		}
		int exclude = knapsack(wts, price, vidx + 1, capacity, strg);
		int include = 0;
		if (capacity >= wts[vidx]) {
			include = price[vidx] + knapsack(wts, price, vidx + 1, capacity - wts[vidx], strg);
		}
		int ans = Math.max(exclude, include);
		strg[vidx][capacity] = ans;
		return ans;
	}

	public static int knapsackBU(int[] wts, int[] price, int cap) {

		int nr = wts.length + 1;
		int nc = cap + 1;
		int[][] strg = new int[nr][nc];
		for (int row = 0; row < nr; row++) {
			for (int col = 0; col < nc; col++) {

				if (row == 0 || col == 0) {
					strg[row][col] = 0;

				} else {

					if (wts[row - 1] > col) {
						strg[row][col] = strg[row - 1][col];
					} else {

						int include = price[row - 1] + strg[row - 1][col - wts[row - 1]];
						int exclude = strg[row - 1][col];
						int ans = Math.max(include, exclude);
						strg[row][col] = ans;
					}
				}
			}
		}
		return strg[nr - 1][nc - 1];
	}

}
