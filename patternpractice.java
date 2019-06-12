import java.util.Scanner;

public class patternpractice {

	public static void main(String[] args) {
		// q1

//		 Scanner scn = new Scanner(System.in);
//		 int n = scn.nextInt();
//		 int row=1;
//		 while(row<=n)
//		 {
//		 int c=1;
//		 while(c<=n)
//		 {
//		 System.out.print("*");
//		 c++;
//		 }
//		 System.out.println();
//		 row++;
//		 }

		// q2
//		 Scanner scn = new Scanner(System.in);
//		 int n = scn.nextInt();
//		 int row=1;
//		 while(row<=n)
//		 {
//		 int c=1;
//		 while(c<=row)
//		 {
//		 System.out.print("*");
//		 c++;
//		 }
//		 System.out.println();
//		 row++;
//		 }

		// q3
//		 Scanner scn = new Scanner(System.in);
//		 int n = scn.nextInt();
//		 int row = 1;
//		 int cst=n;
//		 while (row <= n) {
//		 int c = 1;
//		 while (c <= cst) {
//		 System.out.print("*");
//		 c++;
//		 }
//		 System.out.println();
//		 row++;
//		 cst--;

		// // q4
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int row=1;
		 int nsp=n-1;
		 int nst=1;
		 while(row<=n)
		 {
		 int csp=1;
		 while(csp<=nsp)
		 {
		 System.out.print(" ");
		 csp++;
		 }
		 int cst=1;
		 while(cst<=nst)
		 {
		 System.out.print("*");
		 cst++;
		 }
		 System.out.println();
		 row++;
		 nsp--;
		 nst++;
		//
		 }
		// // q5
		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// int row=1;
		// int nsp=0;
		// int nst=n;
		// while(row<=n)
		// {
		// int csp=0;
		// while(csp<=nsp)
		// {
		// System.out.print(" ");
		// csp++;
		// }
		// int cst=1;
		// while(cst<=nst)
		// {
		// System.out.print("*");
		// cst++;
		// }
		// System.out.println();
		// row++;
		// nsp--;
		// nst++;
		//
		// }
		
//		ladder pattern
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int row = 1;
//		int a=1;
//		while (row <= n) {
//			
//			int c=1;
//			while(c<=row)
//			{
//				System.out.print(a+" ");
//				a++;
//				c++;
//			}
//			System.out.println();
//			row++;
//			}

		
//		pattern 4 fibbonacci pattern
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int row = 1;
//		
//		while (row <= n) {
//			int a = 0;
//			int b = 1;
//			while (a<= n) {
//				
//				System.out.print(a);
//				int sum = a + b;
//				a = b;
//				b = sum;
//			
//			}
//			System.out.println();
//			row++;
//			}
//		
		
		
//		mirror star patter (pattern no. 5) (spacing error)
//		Scanner scn = new Scanner(System.in);
//		 int n = scn.nextInt();
//		int nsp = n - 2;
//		int nst = 1;
//		int row = 1;
//		while (row <= n) {
//			int csp = 1;
//			while (csp <= nsp) {
//				System.out.print("	");
//				csp++;
//			}
//			int cst = 1;
//			while (cst <= nst) {
//				System.out.print("*"+"	");
//				cst++;
//			}
//			System.out.println();
//			if (row <= (n / 2)) {
//				nsp--;
//				nst+=2;
//			} else {
//				nsp++;
//				nst-=2;
//			}
//			row++;
//
//		}

		
//		pattern with zeroes(done)
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int i;
//		for (i=1; i<=n; i++)
//		{
//			if(i==1)
//			{
//				System.out.print(i);
//			}
//			else if (i==2)
//			{
//				System.out.print(i+"	"+i);
//			}
//			else
//			{
//				int k=1;
//				while(k<=i)
//				{
//				if (k==1 || k==i)
//				{
//					System.out.print(i+"	");
//					k++;
//				}
//				else
//				{
//					System.out.print("0"+"	");
//					k++;
//				}
//				}
//			}
//			System.out.println();
//		}
		
		// pattern rhombus
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int row=1;
//		int nsp=n-1;
//		int nst=1;
//		int i=1;
//		while(row<=(2n-1))
//		{
//			int csp=1;
//			while(csp<=nsp)
//			{
//				System.out.print(" ");
//				csp++;
//			}
//			int cst=1;
//			int counter=1;
//
//			while(cst<=nst)
//			{
//				
//				if (counter==1 || counter==nst)
//				{
//					System.out.print(i);
//					cst++;
//					counter++;
//				}
//				else{
//					while(counter>1 && counter<nst)
//						{
//						while(counter<=((nst+1)/2))
//						{
//							int x=1;
//							while(x<row)
//							{
//				System.out.print(i+x);
//				counter++;
//				cst++;
//				x++;
//							}
//						}
//						while(counter>=((nst+1)/2))
//						{
//							int y=1;
//							while(y>row)
//							{
//							System.out.print(i-1);
//							counter++;
//							cst++;
//							y--;
//							}
//						}
//						}
//				}
//			}
//			System.out.println();
//			row++;
//			i++;
//			nsp--;
//			nst=nst+2;
//		}
		// pattern 4(done)
//				 Scanner scn = new Scanner(System.in);
//				 int n = scn.nextInt();
//				 int row=1;
//				 int a = 0;
//					int b = 1;
//					int sum=0;
//				 while(row<=n)
//				 {
//				 int c=1;
//				 while(c<=row)
//				 {
//				System.out.print(a+"	");
//				 sum = a + b;
//						a = b;
//						b = sum;
//						 c++;
//					}
//				 System.out.println();
//				 row++;
//					
//				
//				 }
	 
	}

}
