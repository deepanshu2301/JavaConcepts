import java.util.Scanner;

public class hackerblogspatterns {

	public static void main(String[] args) {

		// mountain pattern
		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		//
		// int nst = 1;
		// int nsp = 2 * n - 3;
		//
		// for (int row = 1; row <= n; row++) {
		// int val=1;
		// for (int cst = 1; cst <= nst; cst++) {
		// System.out.print(val+" ");
		// val++;
		// }
		//
		// for (int csp = 1; csp <= nsp; csp++) {
		// System.out.print(" ");
		// }
		//
		// int cst = 1;
		// if (row == n) {
		// cst = 2;
		// }
		// int val1=val-1;
		// if(row==n)
		// {
		// val1=val1-1;
		// }
		// for (; cst <= nst; cst++) {
		// System.out.print(val1+" ");
		// val1--;
		// }
		//
		// System.out.println();
		// nst++;
		// nsp -= 2;
		// }

		// pattern rhombus
		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// int nr=(2*n)-1;
		// int nst = 1;
		// int nsp =n-1;
		// int val=1;
		// for (int row = 1; row <= nr; row++) {
		// for (int csp = 1; csp <= nsp; csp++) {
		// System.out.print(" ");
		// }
		// if(row<=(nr+1)/2)
		// {
		// val=row;
		// }
		//
		// int cst = 1;
		// while (cst <= nst) {
		//
		// System.out.print(val+" ");
		// if(row!=1)
		// {
		// if(cst<(nst+1)/2)
		// {
		// val++;
		// }
		// else{
		//
		// val--;
		// }
		// }
		// cst++;
		// }
		//
		// System.out.println();
		// if(row<n)
		// {
		// nst+=2;
		// nsp--;
		// val++;
		// }
		// else{
		// nst-=2;
		// nsp++;
		//
		// }
		// }

		// pattern mountain
		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// int nr=n;
		// int nst = 1;
		// int nsp =n-1;
		// int val=1;
		// for (int row = 1; row <= nr; row++) {
		// for (int csp = 1; csp <= nsp; csp++) {
		// System.out.print(" ");
		// }
		//
		// val=row;
		//
		//
		// int cst = 1;
		// while (cst <= nst) {
		//
		// System.out.print(val+" ");
		// if(row!=1)
		// {
		// if(cst<(nst+1)/2)
		// {
		// val++;
		// }
		// else{
		//
		// val--;
		// }
		// }
		// cst++;
		// }
		//
		// System.out.println();
		//
		// nst+=2;
		// nsp--;
		// val++;
		//
		// }
		// pascals triangle
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int i = 1;
//		int k = 1;
//		int number = 1;
//		int j=1;
//		for(i=0; i<n;i++)
//		{
//			number=1;
//			for(j=0; j<=i;j++)
//			{
//				System.out.print(number+"	");
//				number=number*(i-j)/(j+1);
//			}
//			System.out.println();
//		}
	}

}
