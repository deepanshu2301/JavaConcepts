package string_builder;

import java.util.Scanner;

public class string_ops {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 String str = scn.nextLine();
	
//		 System.out.println(isPalindrome(str));
//		 substrings(str);
//		 palindromeSubstrings(str);
		 
		
	}
	public static void appendString() {

		// String str = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 100000; i++) {

			// str += i;
			sb.append(i);
		}

	}
		
	
	public static boolean isPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}
	
	public static void substrings(String str) {

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				String ss = str.substring(i, j);
				System.out.println(ss);
			}
		}
	}
	
	public static void palindromeSubstrings(String str) {
		int counter=0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				String ss = str.substring(i, j);

				if (isPalindrome(ss))
					counter++;
			}
		}
			System.out.println(counter);
	}
	
	
}
