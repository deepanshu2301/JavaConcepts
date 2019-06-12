package tns;

import java.util.Arrays;
import java.util.Scanner;

public class complexity {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int x = scn.nextInt();
//		polynomial(n, x);
//		System.out.println(power(n,x));
		SOE(25);
	}

	public static void polynomial(int n, int x) {
		
		int val = (int) Math.pow(x, n);
		int a = 1;
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			a = val * i;
			sum += a;
			val = val / x;

		}
		System.out.println(sum);
	}

	public static int power(int n,int x){
		if(n==0){
			return 1;
		}
		
		int ae=1;
		int ans=1;
		ae=power(n/2,x);
		if(n%2==0){
			ans=ae*ae;
		}
		else
		{
			ans=ae*ae*x;
		}
		return ans;
	}
	public static void SOE(int n){
		
		boolean[] primes = new boolean [n+1];
		Arrays.fill(primes, true);
		primes[0]=false;
		primes[1]=false;
		for(int table=2;table*table<=n;table++){
			if(primes[table]==false)
				continue;
			for(int count=2;count*table<=n;count++){
				primes[count*table]=false;
			}
		
	}
		for(int i=2;i<primes.length;i++){
			if(primes[i]){
				System.out.println(i);
			}
		}
}
	
	
	
}
