package lec2;

import java.util.Scanner;

public class p21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr=n/2;
		int nsp=1;
		int nst=(n/2)+1;
		int row=1;
		while(row<=n)
		{
			int cst=1;
			for(cst=1; cst<=nst; cst++)
			{
				System.out.print("*"+"	");
			}
			int csp=1;
			if(row==1 || row==n)
			{
				nsp=0;
			}
			for(csp=1; csp<nsp; csp++)
			{
				System.out.print("	");
			}
			int csd=1;
			if(row==1 || row==n)
			{
				csd=2;
			}
			
			for(; csd<=nst; csd++)
			{
				System.out.print("*"+"	");
			}
			
		System.out.println();
		if(row<=nr)
		{
			nsp=nsp+2;
			nst--;
		}
		else
		{
			nsp=nsp-2;
			nst++;
		}
		row++;
		}
				

		

	}

}
