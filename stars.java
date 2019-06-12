import java.util.Scanner;

public class stars {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in) ;
		int n= scn.nextInt();
		int space=n-1;
		int star=1;
		int i=0;
		while (i<n)
		{
			int a=space;
			while(space!=0)
			{
		 
			System.out.print(" ");
			space--;
			}
			space=a;
			int b=star;
			while (star!=0)
			{
			System.out.print("*");
			star--;
			}
			System.out.println("\n");
			star=b;
			space=space-1;
			star=star+2;
			i++;
		}
	

	}

}
