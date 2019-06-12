import java.util.Scanner;
public class dec25qa {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int k = 2;
			int b = 1;
			while (n - 1 >= b) {
				while(b-1<=k)
				{
				if (k % b != 0) {
					System.out.print(b);
					b++;
				} else {
					b++;
				}
				
				}
				b = b + 1;
			}
		 
		 
	}

}
