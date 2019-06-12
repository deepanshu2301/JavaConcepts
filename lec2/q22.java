package lec2;

import java.util.Scanner;

public class q22 {

	public static void main(String[] args) {

		// Q1
		// System.out.print("enter the source base=");
		// Scanner scn = new Scanner(System.in);
		// int base = scn.nextInt();
		// System.out.print("enter the source number=");
		// int num = scn.nextInt();
		// int decimal=0;
		// int rem=0;
		// int power=1;
		// while(num!=0)
		// {
		// rem=num%10;
		// decimal+=rem*power;
		// power=power*base;
		//
		//
		// num=num/10;
		// }
		// System.out.print(decimal);

		
		
		
		
		// Q2
		// System.out.print("enter the destination base=");
		// Scanner scn = new Scanner(System.in);
		// int base = scn.nextInt();
		// System.out.print("enter the source number=");
		// int num = scn.nextInt();
		//
		//
		//
		// int snum=0;
		// int rem=0;
		// int power=1;
		// while(num!=0)
		// {
		// rem=num%base;
		// snum+=rem*power;
		// power=power*10;
		//
		//
		// num=num/base;
		// }
		// System.out.print(snum);

		
		
		
		
		// Q3
		// System.out.print("enter the num=");
		// Scanner scn = new Scanner(System.in);
		// int num = scn.nextInt();
		// System.out.print("enter the number of rotations=");
		// int rot = scn.nextInt();
		// if(rot>6 || rot <-6)
		// {
		// rot=rot%6;
		// }
		// if(rot<0)
		// {
		// rot=6+rot;
		// }
		// int dig=0;
		// int num1=num;
		// while(num!=0)
		// {
		// num=num/10;
		// dig++;
		// }
		// int a=(int)Math.pow(10,rot);
		// int front=num1%a;
		// num1=num1/a;
		// int c=dig-rot;
		// int b=(int)Math.pow(10,c);
		// int d=(front*b)+num1;
		// System.out.print(d);

		
		
		
		
		// Q4
//		 System.out.print("enter the num=");
//		 Scanner scn = new Scanner(System.in);
//		 int num = scn.nextInt();
//		 int counter = 1;
//		 int newn = 0;
//		 while (num != 0) {
//		 int a = num % 10;	
//		 newn += (counter * (int) Math.pow(10, a - 1));
//		 num = num / 10;
//		 counter++;
//		 }
//		 System.out.print("inverse number is = " + newn);

		
		
//		copied portion
		if (p1 < p) {
			p1 = p;
			counter++;
		}
	
	// full series strictly decreasing

			if (p1 > p) {
			p1 = p;
			flag++;
		}
	
	// full series same

			if (p1 == p) {
			p1 = p;
			score++;
		}
	
	
		
	if(p1>p)
	{
		int c;
			for(c=1; c<=N-2; c++){
			int s = scn.nextInt();
			if(p<s){
				p=s;
				flag1++;
			}
		}
	
		
	}	
	
	}

}
