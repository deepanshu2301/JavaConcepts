package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class demos_prac {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// pi(5);
		// pd(5);
		// System.out.println(fact(5));
		// System.out.println(power(2,5));
		// int[] arr = { 10, 50, 200, 30, 40, 50, 70 };

		// displayarr(arr,0);
		// displayrevarr(arr,0);
		// System.out.println(max(arr,0));
		// System.out.println(findboolean(arr,0,50));
		// System.out.println(findStartIndex(arr, 0, 70));
		// System.out.println(findlastIndex(arr, 0, 50));
		// int arr1[] =findallind(arr, 0, 50,0);
		// for(int i=0; i<arr1.length;i++)
		// {
		// System.out.print(arr1[i] + " ");
		// }
		// cols(1,5);
		// incpat(1,1,4);
		// box(1,1,4);
		// bubblesort(arr, 0, arr.length-1);
		// for (int val : arr) {
		// System.out.print(val + " ");
		// }
		// System.out.println(getSS("abc"));
		// System.out.println(getSSasc("abc"));
		// System.out.println(KPC("123"));
		// System.out.println(permutations("abc"));
//		System.out.println(boardpath(0, 10));
//		int n = scn.nextInt();
//		int m = scn.nextInt();
//		System.out.println(multiply(n,m));
//		ArrayList<String> abc = mazepathmm(0,0,2,2);
//		System.out.println(abc.size());
//		for (String t : abc) {
//			System.out.print(t);
//		}
		ArrayList<String> abc = divide(10);
		System.out.println(abc.size());
		for (String t : abc) {
			System.out.print(t);
		}

	}

	public static void pi(int n) {
		if (n == 0) {
			return;
		}
		pi(n - 1);
		System.out.println(n);
	}

	public static void pd(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);

		pd(n - 1);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}

		int num = fact(n - 1);
		int ans = n * num;
		return ans;

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int p1 = power(x, n - 1);
		int ans = x * p1;

		return ans;
	}

	public static void displayarr(int[] arr, int n) {
		if (n == arr.length) {
			return;
		}
		System.out.println(arr[n]);
		displayarr(arr, n + 1);

	}

	public static void displayrevarr(int[] arr, int n) {
		if (n == arr.length) {
			return;
		}

		displayrevarr(arr, n + 1);
		System.out.println(arr[n]);

	}

	public static int max(int[] arr, int n) {
		if (n == arr.length) {
			return Integer.MIN_VALUE;
		}
		int r = max(arr, n + 1);
		if (arr[n] > r) {
			return arr[n];
		} else {
			return r;
		}
	}

	public static boolean findboolean(int[] arr, int count, int val) {
		if (count == arr.length) {
			return false;
		}
		if (arr[count] == val) {
			return true;
		}
		return findboolean(arr, count + 1, val);

	}

	public static int findStartIndex(int[] arr, int count, int val) {
		if (count == arr.length) {
			return -1;
		}
		if (arr[count] == val) {
			return count;
		}
		return findStartIndex(arr, count + 1, val);
	}

	public static int findlastIndex(int[] arr, int count, int val) {
		count = arr.length - 1;
		if (count == 0) {
			return -1;
		}
		if (arr[count] == val) {
			return count;
		}
		return findStartIndex(arr, count - 1, val);
	}

	public static int[] findallind(int[] arr, int count, int val, int r) {

		if (count == arr.length) {
			int[] arr2 = new int[r];
			return arr2;
		}
		int[] arr1;
		if (arr[count] == val) {
			arr1 = findallind(arr, count + 1, val, r + 1);
			arr1[r] = count;

		} else {
			arr1 = findallind(arr, count + 1, val, r);
		}

		return arr1;
	}

	public static void cols(int i, int j) {
		if (i > j) {
			return;
		}
		cols(i, j - 1);
		System.out.print("*");

	}

	public static void incpat(int r, int c, int count) {
		if (r > count) {
			return;
		}
		if (c > r) {
			System.out.println();
			incpat(r + 1, 1, count);
			return;

		}
		System.out.print("*");
		incpat(r, c + 1, count);

	}

	public static void box(int r, int c, int count) {
		if (r > count) {
			return;
		}
		if (c > count) {
			System.out.println();
			box(r + 1, 1, count);
			return;

		}
		System.out.print("*");
		box(r, c + 1, count);
	}

	public static void bubblesort(int[] arr, int strt, int end) {
		if (end == 0) {
			return;
		}
		if (strt == end) {
			bubblesort(arr, 0, end - 1);
			return;
		}
		if (arr[strt] > arr[strt + 1]) {
			int temp = arr[strt];
			arr[strt] = arr[strt + 1];
			arr[strt + 1] = temp;
		}
		bubblesort(arr, strt + 1, end);
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String t : rr) {
			mr.add(t);
			mr.add(ch + t);
		}
		return mr;
	}

	public static ArrayList<String> getSSasc(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getSSasc(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String t : rr) {
			mr.add(t);
			mr.add((int) ch + t);
			mr.add(ch + t);
		}
		return mr;
	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> KPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = KPC(ros);
		ArrayList<String> mr = new ArrayList<>();

		String rrs = getCode(ch);
		for (int i = 0; i < rrs.length(); i++) {
			char ch1 = rrs.charAt(i);
			for (String t : rr) {
				mr.add(ch1 + t);
			}
		}
		return mr;
	}

	public static ArrayList<String> permutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = permutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String t : rr) {
			for (int i = 0; i <= t.length(); i++) {
				String ans = t.substring(0, i) + ch + t.substring(i);
				mr.add(ans);
			}
		}
		return mr;
	}

	public static ArrayList<String> boardpath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();

			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int i = 1; i <= 6; i++) {

			ArrayList<String> rr = boardpath(curr + i, 10);

			for (String t : rr) {
				mr.add(i + t);
			}

		}
		return mr;
	}

	
//	mazepathD2
	public static ArrayList<String> mazepath(int cr, int cc, int er, int ec){
		if(cr>er || cc>ec)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		if(cr==er && cc==ec)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();

			ArrayList<String> rr = mazepath(cr+1,cc,er,ec);
			for (String t : rr) {
				mr.add("V"+ t);
			}
			

			ArrayList<String> rr1 = mazepath(cr,cc+1,er,ec);
			for (String t : rr1) {
				mr.add("H"+ t);
			}

			ArrayList<String> rr2 = mazepath(cr+1,cc+1,er,ec);
			if(cr==cc){
			for (String t : rr2) {
				mr.add("D"+ t);
			}
			}
		return mr;
	}
	
	public static int multiply(int n, int m){
		if(m==0)
		{
			return 0;
		}
		int fac=multiply(n,m-1);
		int sum=fac+n;
		return sum;
	}
	public static ArrayList<String> divide(int n){
		if(n==1)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("1");
			return br;
		}
		if(n<=0)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		if((n%2)!=0 && (n%3)!=0){
		ArrayList<String> rr = divide(n-1);
		for (String t : rr) {
			mr.add(1+ t);
		}
		}
		if((n-1)%2==0){
		ArrayList<String> rr1 = divide(n/2);
		for (String t : rr1) {
			mr.add(2+ t);
		}
		}
		else if((n-1)%3==0){
		ArrayList<String> rr2 = divide(n/3);
		for (String t : rr2) {
			mr.add(3+ t);
		}
		}
		return mr;
		
	}
	public static ArrayList<String> mazepathmm(int cr, int cc, int er, int ec){
		if(cr>er || cc>ec)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		if(cr==er && cc==ec)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for(int i=1;i<=er;i++){
			ArrayList<String> rr = mazepathmm(cr+i,cc,er,ec);
			for (String t : rr) {
				mr.add("V"+i+ t);
			}
		}
		for(int i=1;i<=ec;i++){
			ArrayList<String> rr1 = mazepathmm(cr,cc+i,er,ec);
			for (String t : rr1) {
				mr.add("H"+i+ t);
			}
		}
		for(int i=1;i<=er&&i<=ec;i++){
			ArrayList<String> rr2 = mazepathmm(cr+i,cc+i,er,ec);
			if(cr==cc){
			for (String t : rr2) {
				mr.add("D"+i+ t);
			}
			}
		}
		return mr;
	}

}
