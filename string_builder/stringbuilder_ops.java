package string_builder;

import java.util.Scanner;

public class stringbuilder_ops {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
//		 String str = "aaabbccds";
		// System.out.println(toggleCase(str));
		// System.out.println(replaceLowerUpper(str));
		// System.out.println(differenceinascii(str));
		// System.out.println(maxf(str));
		// System.out.println(condup(str));
		System.out.println(comp(str));

	}

	public static String comp(String str) {
//		StringBuilder sb = new StringBuilder();
//		StringBuilder sb2 = new StringBuilder();
//
//		StringBuilder sb1 = new StringBuilder();
//		int x1 = 0;
//		sb1.append(str.charAt(0));
//		for (int i = 1, j=0; i < str.length() || j < sb1.length(); i++, j++) {
//			char ch = str.charAt(i);
//			if (ch != sb1.charAt(x1)) {
//				System.out.println(ch);
//				x1++;
//			}
//			char ch1 = sb1.charAt(j);
//
//			int val = 0;
//			for (int i1 = 0; i1 < str.length(); i1++) {
//				if (str.charAt(i) == ch1) {
//					val++;
//				}
//			}
//			if (val > 1) {
//				System.out.println(val);
//			}
//
//		}

//		for (int j = 0; j < sb1.length(); j++) {
//
//			char ch1 = sb1.charAt(j);
//
//			int val = 0;
//			for (int i = 0; i < str.length(); i++) {
//				if (str.charAt(i) == ch1) {
//					val++;
//				}
//			}
//			if (val > 1) {
//				System.out.println(val);
//			}
//
//		}

//		int l = sb.length() - 1;
//		for (int i = 0; i <= sb1.length() - 1; i++) {
//
//			char ch = sb1.charAt(i);
//			sb2.append(ch);
//
//			if (l >= 0) {
//
//				char ch1 = sb.charAt(i);
//
//				sb2.append(ch1);
//
//				l--;
//			}
//		}

//		return sb2.toString();
		StringBuilder sb = new StringBuilder();
		int j=0;
		int k=0;
		sb.append(str.charAt(0));
		while(j<str.length())
		{
			char ch = str.charAt(j);
			j=j+1;
			int t=0;
			k=0;
			while(j<str.length() && ch==str.charAt(j))
			{
				j++;
				t++;
				k=1;
			}
			if(k==1)
			{
				sb.append(t+1);
				
			}
			if(j<str.length())
			{
				sb.append(str.charAt(j));
			}
		}
		return sb.toString();
		
	}

	public static String condup(String str) {
		StringBuilder sb = new StringBuilder();
		int x = 0;
		sb.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != sb.charAt(x)) {
				sb.append(ch);
				x++;
			}

		}
		return sb.toString();
	}

	public static char maxf(String str) {
		char ch;
		int valf = 0;
		char re = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			int val = 0;
			ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch1 = str.charAt(j);
				if (ch == ch1) {
					val++;
				}

			}

			if (val > valf) {
				valf = val;
				re = ch;
			}

		}
		return re;
	}

	public static String differenceinascii(String str) {
		StringBuilder sb = new StringBuilder();
		char z = str.charAt(0);
		sb.append(z);
		// working
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i != str.length() - 1) {
				char ch1 = str.charAt(i + 1);
				int j = (ch1 - ch);

				sb.append(j);
				sb.append(ch1);
			}
			// if(i==str.length()-1)
			// {
			// sb.append(ch);
			// }

		}
		return sb.toString();
	}

	public static String toggleCase(String str) {

		StringBuilder sb = new StringBuilder();

		// work here
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			char ans = ' ';
			if (ch >= 'a' && ch <= 'z') {
				ans = (char) (ch - 'a' + 'A');
			} else if (ch >= 'A' && ch <= 'Z') {
				ans = (char) (ch + 'a' - 'A');
			}
			sb.append(ans);
		}

		return sb.toString();
	}

	public static String replaceLowerUpper(String str) {

		StringBuilder sb = new StringBuilder();

		// work here
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (i % 2 != 0) {
				char ans = (char) (ch - 1);
				sb.append(ans);
				// sb.append(--ch);
			} else {
				char ans = (char) (ch + 1);
				sb.append(ans);
				// sb.append(++ch);
			}
		}

		return sb.toString();

	}

}
