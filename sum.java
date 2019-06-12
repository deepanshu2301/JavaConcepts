import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		// int counter=1;
		// int sum=0;
		// while(counter<=n)
		// {
		// sum=sum+ counter;
		// counter=counter+1;
		// }
		// System.out.println(sum);

		// prime number
		// int k = 2;
		// int b = 1;
		// while (n - 1 >= k) {
		// if (n % k == 0) {
		// b = 0;
		// break;
		// } else {
		// b = 1;
		// }
		// k = k + 1;
		// }
		// if (b == 1) {
		// System.out.println("prime");
		// } else {
		// System.out.println("not prime");
		// }

		// print fibbonacci series

		// int a = 0;
		// int b = 1;
		// while (a<= n) {
		//
		// System.out.println(a);
		// int sum = a + b;
		// a = b;
		// b = sum;
		//
		// }
		// nth fibbonacci number
		// int i = 1;
		// int a = 0;
		// int b = 1;
		// while (i <= n) {
		// int sum = a + b;
		// a = b;
		// b = sum;
		// i = i+1;
		// }
		// System.out.print(a);

		// store print reverse
		// int reverse=0;
		// while (n!=0)
		// {
		// int a=n%10;
		// reverse= ((reverse*10)+a);
		// n=n/10;
		// }
		//
		// System.out.print(reverse);

		// int space=n-1;
		// int star=1;
		// int i=0;
		// while (i<n)
		// {
		// int a=space;
		// while(space!=0)
		// {
		//
		// System.out.print(" ");
		// space--;
		// }
		// space=a;
		// int b=star;
		// while (star!=0)
		// {
		// System.out.print("*");
		// star--;
		// }
		// System.out.println("\n");
		// star=b;
		// space=space-1;
		// star=star+2;
		// i++;
		// }

		// sum of odd and even placed digits
		// int n1=n;
		//
		// int esum=0;
		// int osum=0;
		//
		// while(n1!=0)
		// {
		// int c=n1%10;
		// osum=osum+c;
		// n1=n1/10;
		// int b=n1%10;
		// esum=esum+b;
		// n1=n1/10;
		// }
		//
		// System.out.println(osum);
		// System.out.println(esum);

		// int a=2;
		// while(a<n)
		// {
		// int k=2;
		// while(a%k!=0)
		// {
		// System.out.print(a);
		// k++;
		//
		// }
		// a++;
		// }
		// print primes between 2 and n
		int counter = 2;
		while (counter <= n) {
			int flag = 0;
			int div = 2;
			while (div < counter) {
				if (counter % div == 0) {
					flag = 1;
					break;
				} else {
					div++;
				}
			}
			if (flag == 0) {
				System.out.println(counter);
			}
			counter++;
		}

	}

}
