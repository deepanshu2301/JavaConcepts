package lec2;

public class lastpattern {

	public static void main(String[] args) {

		int n = 10;
		int nsp = n - 1;
		int row = 1;
		int nst = 1;
		while (row <= n) {
			int csp = 1;
			for (csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");

			}
			if (row == 1) {
				System.out.print("0");
			}

			int cst = 1;
			while (cst <= nst) {
				while (cst <= nst / 2) {
					int val;
					val = 10 - row + 1;
					for (; val <= 9; val++) {
						System.out.print(val);
						cst++;
					}
				}

				if (row != 1) {
					if (cst == (nst + 1) / 2) {
						System.out.print("0");
					}

				}
				cst++;

				int c = 9;
				while (cst > (nst + 1) / 2 && cst <= nst) {

					System.out.print(c);
					c--;

					cst++;

				}

			}
			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}

	}

}
