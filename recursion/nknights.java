package recursion;

import java.util.Scanner;

public class nknights {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int count=nknightscount(new boolean[n][n], 1, "", 0);
			System.out.println(count);
			nknights(new boolean[n][n], 1, "", 0);
	

	}

	public static void nknights(boolean[][] board, int val, String asf, int kpsf) {

		if (kpsf == board.length) {
			System.out.print(asf + " ");
			return;
		}

		for (int pos = val; pos <= board.length * board.length; pos++) {

			int row = (pos - 1) / board.length;
			int col = (pos - 1) % board.length;

			board[row][col] = true;
			nknights(board, pos + 1, asf + "{" + row + "-" + col + "} ", kpsf + 1);
			board[row][col] = false;
		}
	}
	
	
	public static int nknightscount(boolean[][] board, int val, String asf, int kpsf) {

		if (kpsf == board.length) {
			return 1;
		}

		int count=0;
		for (int pos = val; pos <= board.length * board.length; pos++) {

			int row = (pos - 1) / board.length;
			int col = (pos - 1) % board.length;

			board[row][col] = true;
			count+=nknightscount(board, pos + 1, asf + "{" + row + "-" + col + "}", kpsf + 1);
			board[row][col] = false;
		}
		
		return count;
	}
}
