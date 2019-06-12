package recursion;

import java.util.Scanner;

public class nqueens {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		 int n = scn.nextInt();
		System.out.println(nqueenscount(new boolean[n][n],0, ""));
		 nqueens(new boolean[n][n],0, "");

	}
	public static boolean isitsafe(boolean[][] board, int row, int col) {
		int r;
		int c;

		r = row - 1;
		c = col;
		while (r >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
		}

		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}

		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static int nqueenscount(boolean[][] board, int row, String ans) {
		if (row >= board.length) {

			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				count += nqueenscount(board, row + 1, ans + "{" + row + 1 + "-" + col + 1 + "}" + " ");
				board[row][col] = false;
			}

		}
		return count;
	}
	public static void nqueens(boolean[][] board, int row, String ans) {
		if (row >= board.length) {
			System.out.print(ans + " ");

			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				nqueens(board, row + 1, ans + "{" + (row + 1) + "-" + (col + 1) + "}" + " ");
				board[row][col] = false;
			}

		}

	}

}
