package lec3;

import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter number");
		int a = scn.nextInt();
		System.out.print("enter base");
		int b = scn.nextInt();
		logarithm(a,b);
		
	}
	
	

	public static void logarithm(int a, int b)
	{
		int counter=0;
		while (a != 1) {
			
			a=a/b;
			counter++;
			
		}
		System.out.print(counter);
	}
	
	
	
	
}
