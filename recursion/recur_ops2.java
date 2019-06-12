package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class recur_ops2 {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
		// int n=twins(str,0);
		// System.out.println(n);
//		parenthesis(str);
		String str="hihithithiabc";
		hibye2(str);
		// int n = scn.nextInt();
		// int m = scn.nextInt();
		// ArrayList<String> abc =;
		// cointoss(3, 0,"");
		// cointoss2H(3,0,"",false);
		// System.out.println(cointoss2Hi(3,0,"",false));
		// System.out.println(printmazepathi(0,0,2,2,""));
		// System.out.println(printmazepathddmmi(0,0,2,2,""));
		// System.out.println(printboardpath(10, 0, ""));
		// System.out.println(getpermrdc(str, ""));
		// getpermrd(str, "");
		// lexgetperm("abc", "");
		// boolean flag=obidientstring(str, false);
		// System.out.println(flag);
		// int num=0;
		// int count=0;
		// num=TOHcount(n,"T1","T2","T3",count);
		// System.out.println(num);
		// TOH(n,"T1","T2","T3");
		// String str = "a+{b+(c+{d})}]";
		// ArrayList<Character> ans = new ArrayList<>();
		// boolean flag = isbalanced(str, ans, 0, true);
		// System.out.println(flag);
		// int [] arr={10,50,20,5,40,90,1000};
		// int [] arr1={30,40,70};
		// int []ans= mergesorted(arr,arr1); (in this function sorted elements
		// are passed an it returns their added array )
		// int []ans1=mergesort(arr, 0, arr.length-1);
		// int []ans=quicksort(arr, 0, arr.length-1);
		// for(int val: ans1)
		// {
		// System.out.println(val);
		// }
	}

	public static boolean obidientstring(String str, boolean flag) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				flag = true;
				if (ch == 'a') {
					char ch1 = str.charAt(i + 1);
					if (ch1 == 'a') {
						flag = true;
					} else if (ch1 == ' ') {
						flag = true;
					} else if (ch1 == 'b') {
						char ch2 = str.charAt(i + 1 + 1);
						if (ch2 == 'b') {
							flag = true;
						}
					}
				} else if (ch == 'b') {
					char ch2 = str.charAt(i + 1);
					if (ch2 == 'b') {
						char ch3 = str.charAt(i + 1 + 1);
						if (ch3 == 'a') {
							flag = true;
						} else if (ch3 == ' ') {
							flag = true;
						}
					}
				}
			}

		}
		return flag;

	}

	public static boolean isbalanced(String str, ArrayList<Character> ans, int idx, boolean flag) {
		if (idx == str.length() && ans.size() != 0) {
			flag = false;

		}
		if (idx == str.length()) {
			return flag;
		}

		char r = str.charAt(idx);
		if (r == '(' || r == '[' || r == '{') {
			ans.add(r);
			System.out.println(ans);
		}
		if (r == ')' || r == ']' || r == '}') {
			char rc = ans.remove(ans.size() - 1);
			System.out.println(rc);
			if (((int) rc - (int) r) > 2) {
				System.out.println((int) rc - (int) r);
				flag = false;
				return flag;
			}
		}

		isbalanced(str, ans, idx + 1, flag);
		System.out.println("pohocha");
		return flag;

	}

	public static void lexgetperm(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			if (ch > ros.charAt(ros.length()) - 1) {
				lexgetperm(ros, ans + ch);
			}
		}
	}

	public static void getpermrd(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		boolean[] arr = new boolean[256];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);

			if (arr[(int) ch] == false) {
				arr[(int) ch] = true;
				getpermrd(ros, ans + ch);

			}
		}
	}

	public static int getpermrdc(String ques, String ans) {
		if (ques.length() == 0) {

			return 1;
		}
		boolean[] arr = new boolean[256];
		int a = 0;
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);

			if (arr[(int) ch] == false) {
				arr[(int) ch] = true;
				a += getpermrdc(ros, ans + ch);

			}
		}
		return a;
	}

	public static void cointoss(int n, int curr, String ans)

	{
		if (curr > n) {
			return;
		}

		if (curr == n) {
			System.out.println(ans);
			return;
		}

		cointoss(n, curr + 1, ans + "H");
		cointoss(n, curr + 1, ans + "T");

	}

	public static void cointoss2H(int n, int curr, String ans, boolean islastHI)

	{
		if (curr > n) {
			return;
		}

		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (islastHI) {

			cointoss2H(n, curr + 1, ans + "T", false);
		} else {
			cointoss2H(n, curr + 1, ans + "H", true);
			cointoss2H(n, curr + 1, ans + "T", false);
		}
	}

	public static int cointoss2Hi(int n, int curr, String ans, boolean islastHI)

	{
		if (curr > n) {
			return 0;
		}

		if (curr == n) {
			System.out.println(ans);
			return 1;
		}
		int a = 0;
		int b = 0;
		if (islastHI) {

			a = cointoss2Hi(n, curr + 1, ans + "T", false);
		} else {
			b = cointoss2Hi(n, curr + 1, ans + "H", true);
			a = cointoss2Hi(n, curr + 1, ans + "T", false);
		}
		return a + b;
	}

	public static int printmazepathi(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;
		}

		int vt = printmazepathi(cr + 1, cc, er, ec, ans + "V");
		int ht = printmazepathi(cr, cc + 1, er, ec, ans + "H");
		return ht + vt;
	}

	public static int printmazepathddmmi(int cr, int cc, int er, int ec, String ans)

	{
		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;
		}
		int vt = 0;
		int ht = 0;
		int dt = 0;
		for (int i = 1; i <= er; i++) {
			vt += printmazepathddmmi(cr + i, cc, er, ec, ans + "V" + i);

			ht += printmazepathddmmi(cr, cc + i, er, ec, ans + "H" + i);
		}
		for (int i = 1; i <= er && i <= ec; i++) {
			dt += printmazepathddmmi(cr + i, cc + i, er, ec, ans + "D" + i);
		}
		return vt + ht + dt;
	}

	public static int printboardpath(int end, int curr, String ans) {

		if (curr > end) {
			return 0;
		}

		if (curr == end) {
			System.out.println(ans);
			return 1;
		}
		int tc = 0;
		for (int i = 1; i <= 6; i++)

		{
			tc += printboardpath(end, curr + i, ans + i);
		}
		return tc;
	}

	public static int[] mergesort(int[] arr, int left, int right) {
		if (left == right) {
			int[] br = new int[1];
			br[0] = arr[left];
			return br;
		}
		int mid = (left + right) / 2;
		int[] ls = mergesort(arr, left, mid);
		int[] rs = mergesort(arr, mid + 1, right);

		int[] ans = mergesorted(ls, rs);
		return ans;
	}

	public static int[] mergesorted(int[] one, int[] two) {
		int[] ans = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] > two[j]) {
				ans[k] = two[j];
				j++;
				k++;
			} else {
				ans[k] = one[i];
				i++;
				k++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				ans[k] = two[j];
				j++;
				k++;
			}
		}
		if (j == two.length)

		{
			while (i < one.length) {
				ans[k] = one[i];
				i++;
				k++;
			}

		}

		return ans;

	}

	public static int[] quicksort(int[] arr, int left, int right) {
		if (left == right) {
			int[] br = new int[1];
			br[0] = arr[left];
			return br;
		}
		int mid = (left + right) / 2;
		int[] ls = mergesort(arr, left, mid);
		int[] rs = mergesort(arr, mid + 1, right);

		int[] ans = mergesorted(ls, rs);
		return ans;
	}

	public static void TOH(int n, String src, String dest, String help) {
		if (n == 0)
			return;

		TOH(n - 1, src, help, dest);
		System.out.println("move " + n + "th disc from " + src + " to " + dest);
		TOH(n - 1, help, dest, src);
	}

	public static int TOHcount(int n, String src, String dest, String help, int count) {
		if (n == 0)
			return 1;

		// int count=0;
		TOHcount(n - 1, src, help, dest, count);
		count++;
		// System.out.println("move " + n + "th disc from " + src + " to " +
		// dest);
		TOHcount(n - 1, help, dest, src, count);
		return count;
	}

	public static int twins(String str, int idx) {

		if (idx == str.length() - 2) {
			return 0;
		}
		int count = 0;
		char ch = str.charAt(idx);
		char ch1 = str.charAt(idx + 2);
		if (ch == ch1) {
			count++;
		}
		count += twins(str, idx + 1);
		return count;
	}

	public static void parenthesis(String str) {
		int c=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				c = i + 1;
			}
		}
		while (str.charAt(c) != ')') {
			System.out.print(str.charAt(c));
			c++;
		}
	}
	
	public static void hibye2(String str){
		int count=0;
		for(int i=0;i<str.length()-2;i++){
			int j=str.indexOf("hi");
			if(str.charAt(j+2) !='t'){
				count++;
			}else{	
				
			}
		}
		System.out.println(count);
		
	}
}
