package recursion;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Scanner;

public class recur_ops {

	public static void main(String[] args) {

		// ArrayList<String> list = new ArrayList<>();
		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// int m = scn.nextInt();

		// System.out.println(list.size());
		//
		// String str = scn.nextLine();
		// System.out.println(str.length());
		//
		// list.add(str);
		// System.out.println(list.size());
		// System.out.println(getSS("abc"));
		// ArrayList<String> abc = getSS(str);
		// System.out.println(abc.size());
		// for(String val:abc){
		// System.out.print(val + " ");
		// }
		// System.out.println(getKPC("123"));
		// System.out.println(getPermutations("abc"));
//		System.out.println(getBoardPath(0, 7));
		// printssasc("abc", "");
		// System.out.println(getKPCcount(str, ""));
		// getKPC(str, "");
		// getperm(str, "");
		// printlex(0,n);
		// printboardpath(10, 0,"");
		// ArrayList<String> abc = mazepathmm(1,1,n,m);
		// System.out.println(abc.size());
		// System.out.println(printmazepathddcount(1, 1, n, n,""));
		// printmazepathdd(1, 1, n, n,"");
		// printmazepathddmm(0, 0, 2, 2, "");
	}

	public static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(str.length() - 1);
		String ros = str.substring(0, str.length() - 1);

		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {

			mr.add(rrs); // no
			mr.add(rrs + ch); // yes
		}

		return mr;

	}

	public static ArrayList<String> getSSAscii(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(str.length() - 1);
		String ros = str.substring(0, str.length() - 1);

		ArrayList<String> rr = getSSAscii(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {

			mr.add(rrs); // no
			mr.add(rrs + ch); // yes
			mr.add(rrs + (int) ch); // ascii
		}

		return mr;

	}

	public static ArrayList<String> getKPC(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getKPC(ros);
		ArrayList<String> mr = new ArrayList<>();

		String code = getCode(ch);

		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);

			for (String rrs : rr) {
				mr.add(c + rrs);
			}
		}

		return mr;

	}

	public static ArrayList<String> getPermutations(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getPermutations(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {

			for (int i = 0; i <= rrs.length(); i++) {

				String ans = rrs.substring(0, i) + ch + rrs.substring(i);
				mr.add(ans);
			}
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

	public static ArrayList<String> getBoardPath(int curr, int end) {

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

		for (int dice = 1; dice <= 6; dice++) {

			ArrayList<String> rr = getBoardPath(curr + dice, end);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}

		return mr;

	}

	public static void printssasc(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		printssasc(ros, ans);
		printssasc(ros, ans + ch);
		printssasc(ros, ans + (int) ch);

	}

	public static void getKPC(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		String rr = getCode(ch);

		for (int i = 0; i < rr.length(); i++) {
			char ch1 = rr.charAt(i);
			String ros = ques.substring(1);
			getKPC(ros, ans + ch1);
		}

	}

	public static int getKPCcount(String ques, String ans) {
		if (ques.length() == 0) {

			return 1;
		}

		char ch = ques.charAt(0);
		String rr = getCode(ch);
		int count = 0;
		for (int i = 0; i < rr.length(); i++) {
			char ch1 = rr.charAt(i);
			String ros = ques.substring(1);
			count += getKPCcount(ros, ans + ch1);
		}
		return count;
	}

	public static void getperm(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);

			getperm(ros, ans + ch);
		}
	}

	public static void printlex(int strt, int end) {
		if (strt > end) {
			return;

		}

		System.out.print(strt + " ");

		if (strt == 0) {
			for (int i = 1; i <= 9; i++) {
				printlex((strt * 10) + i, end);

			}
		} else {
			for (int i = 0; i <= 9; i++) {
				printlex((strt * 10) + i, end);

			}
		}
	}

	public static void printboardpath(int end, int curr, String ans) {
		if (curr > end) {
			return;
		}

		if (curr == end) {
			System.out.println(ans);
		}

		for (int i = 1; i <= 6; i++)

		{
			printboardpath(end, curr + i, ans + i);
		}

	}

	public static void printmazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(ans);
		}

		printmazepath(cr + 1, cc, er, ec, ans + "V");
		printmazepath(cr, cc + 1, er, ec, ans + "H");

	}

	public static ArrayList<String> mazepathmm(int cr, int cc, int er, int ec) {
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		// for(int i=1;i<=er;i++){
		ArrayList<String> rr = mazepathmm(cr + 1, cc, er, ec);
		for (String t : rr) {
			mr.add("V" + t);
		}
		// }
		// for(int i=1;i<=ec;i++){
		ArrayList<String> rr1 = mazepathmm(cr, cc + 1, er, ec);
		for (String t : rr1) {
			mr.add("H" + t);
		}
		// }
		// for(int i=1;i<=er&&i<=ec;i++){
		ArrayList<String> rr2 = mazepathmm(cr + 1, cc + 1, er, ec);
		if (cr == cc) {
			for (String t : rr2) {
				mr.add("D" + t);
			}
		}
		// }
		return mr;
	}

	public static void printmazepathdd(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}

		printmazepathdd(cr + 1, cc, er, ec, ans + "V");
		printmazepathdd(cr, cc + 1, er, ec, ans + "H");
		if (cr == cc || cr + cc == er + 1) {
			printmazepathdd(cr + 1, cc + 1, er, ec, ans + "D");
		}

	}

	public static int printmazepathddcount(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			// System.out.print(ans + " ");
			return 1;
		}
		int vc = 0;

		vc += printmazepathddcount(cr + 1, cc, er, ec, ans + "V");
		vc += printmazepathddcount(cr, cc + 1, er, ec, ans + "H");
		if (cr == cc || cr + cc == er + 1) {
			vc += printmazepathddcount(cr + 1, cc + 1, er, ec, ans + "D");
		}
		return vc;

	}

	public static void printmazepathddmm(int cr, int cc, int er, int ec, String ans)

	{
		if (cr > er || cc > ec) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= er; i++) {
			printmazepathddmm(cr + i, cc, er, ec, ans + "V" + i);

			printmazepathddmm(cr, cc + i, er, ec, ans + "H" + i);
		}
		for (int i = 1; i <= er && i <= ec; i++) {
			printmazepathddmm(cr + i, cc + i, er, ec, ans + "D" + i);
		}

	}

}
