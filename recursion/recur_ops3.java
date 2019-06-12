package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class recur_ops3 {

	public static void main(String[] args) {
		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// ArrayList<Integer> primea = new ArrayList<>();
		// primea=prime(n);
		// System.out.println(getBoardPath(0, 3,primea));
		int[] arr = { 2, 3, 5, 1, 4 };
		int[] arr1 = { 2, 3, 5, 1, 4 };
		System.out.println(wine(arr, 2, arr1, 0));
		// String str="hi";
		// StringBuilder sb = new StringBuilder(str);
		// int n=hibyecount(sb, 0);
		// System.out.println(n);
	}

	public static int wine(int[] arr, int year, int[] arr1, int idx) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0 || i == arr.length - 1) {
				int maxsf = wineproblem(arr, year, arr1, idx);
				if (maxsf > max) {
					max = maxsf;
				}
			}
		}
		return max;
	}

	public static int wineproblem(int[] arr, int year, int[] arr1, int idx) {

		if (year > 6) {
			return 0;
		}

		int sum = 0;
		sum += arr[idx];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr1[i] * year;
		}

		sum += wineproblem(arr, year + 1, arr1, idx + 1);

		return sum;
	}

	public static ArrayList<String> getBoardPath(int curr, int end, ArrayList<Integer> prime) {

		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		if (prime.contains(curr)) {
			curr = prime.get(prime.size() - 1);
			prime.remove(prime.size() - 1);
			prime.remove(0);

		}
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {

			ArrayList<String> rr = getBoardPath(curr + dice, end, prime);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}

		return mr;

	}

	public static ArrayList<Integer> prime(int n) {

		ArrayList<Integer> prime = new ArrayList<>();

		int counter = 2;
		while (counter <= n) {
			int flag = 0;
			int div = 2;
			while (div < counter) {
				if (counter % div == 0) {
					flag = 1;
					break;
				} else {
					div++;
				}
			}
			if (flag == 0) {
				prime.add(counter);
			}
			counter++;
		}

		return prime;
	}

	public static int hibyecount(StringBuilder sb, int a) {
		if (a == sb.length() - 2) {
			return 0;
		}
		int count = 0;
		a = sb.indexOf("hi");
		if (sb.charAt(a + 2) != 't' && a != -1) {

			count++;
			a = a + 2;
		} else {
			a = a + 1;
		}
		count += hibyecount(sb, a);
		return count;
	}

}
