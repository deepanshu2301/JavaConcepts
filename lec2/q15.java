package lec2;

public class q15 {

	public static void main(String[] args) {
		int n=5;
		int nr=2*n-1;
		int nsp=0;
		int nst=n;
		int row=1;
		while(row<=nr)
		{
			int csp=0;
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
			if(row<=(nr/2+1))
			{
				nsp=nsp+2;
				nst--;
			}
			else
			{
				nsp=nsp-2;
				nst++;
			}
			
		}
		

	}

}
