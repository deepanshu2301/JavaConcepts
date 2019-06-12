package lec2;

import java.util.Scanner;

public class dec27 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		int nsp = n - 2;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("	");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*"+"	");
				cst++;
			}
			System.out.println();
			if (row <= (n / 2)) {
				nsp--;
				nst+=2;
			} else {
				nsp++;
				nst-=2;
			}
			row++;

		}

	}

}
