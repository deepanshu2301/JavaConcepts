package lec3;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class hackerblocksA2 {
	// binary to decimal
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int number = scn.nextInt();
	// System.out.print(converter(number));
	// }
	//
	// public static int converter(int num){
	// int decimal=0;
	// int rem=0;
	// int power=1;
	// while(num!=0)
	// {
	// rem=num%10;
	// decimal+=rem*power;
	// power=power*2;
	// num=num/10;
	// }
	// return decimal;
	//
	// }

	// decimal to octal
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int number = scn.nextInt();
	// System.out.print(converter(number));
	// }
	//
	// public static int converter(int num){
	// int snum=0;
	// int rem=0;
	// int power=1;
	// while(num!=0)
	// {
	// rem=num%8;
	// snum+=rem*power;
	// power=power*10;
	//
	//
	// num=num/8;
	// }
	// return snum;
	//
	// }

	// any to any
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int sb = scn.nextInt();
	// int db = scn.nextInt();
	// int sn = scn.nextInt();
	// System.out.print(converter(sb, db, sn));
	// }
	//
	// public static int converter(int sb, int db, int sn){
	//
	// int decimal=0;
	// int rem=0;
	// int power=1;
	// while(sn!=0)
	// {
	// rem=sn%10;
	// decimal+=rem*power;
	// power=power*sb;
	// sn=sn/10;
	// }
	//
	//
	// int snum=0;
	// int rem1=0;
	// int power1=1;
	// while(decimal!=0)
	// {
	// rem1=decimal%db;
	// snum+=rem1*power1;
	// power1=power1*10;
	//
	//
	// decimal=decimal/db;
	// }
	//
	// return snum;
	//
	// }

	// octal to binary
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int sn = scn.nextInt();
	// System.out.print(converter(sn));
	// }
	//
	// public static int converter(int sn){
	//
	// int decimal=0;
	// int rem=0;
	// int power=1;
	// while(sn!=0)
	// {
	// rem=sn%10;
	// decimal+=rem*power;
	// power=power*8;
	// sn=sn/10;
	// }
	//
	//
	// int snum=0;
	// int rem1=0;
	// int power1=1;
	// while(decimal!=0)
	// {
	// rem1=decimal%2;
	// snum+=rem1*power1;
	// power1=power1*10;
	//
	//
	// decimal=decimal/2;
	// }
	//
	// return snum;
	//
	// }

	// f to c
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int minF = scn.nextInt();
	// int maxF = scn.nextInt();
	// int step = scn.nextInt();
	// int temp = 0;
	// for (temp = minF; temp <= maxF; temp += step) {
	// int F = temp;
	// F = (int) ((5.0 / 9) * (F - 32));
	// System.out.println(temp + "\t" + F);
	//
	// }
	//
	// }

	// count digits
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int number = scn.nextInt();
	// int digit = scn.nextInt();
	// System.out.print(converter(number, digit));
	// }
	//
	// public static int converter(int number, int digit ){
	// int counter=0;
	//
	// while(number!=0)
	// {
	// int rem=1;
	// rem=number%10;
	// if(rem==digit)
	// {
	// counter++;
	// }
	// number=number/10;
	// }
	// return counter;
	//
	// }

	// inverse of a number
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int number = scn.nextInt();
	//
	// System.out.print(converter(number));
	// }
	//
	// public static int converter(int number ){
	// int counter = 1;
	// int newn = 0;
	// while (number != 0) {
	// int a = number % 10;
	// newn += (counter * (int) Math.pow(10, a - 1));
	// number = number / 10;
	// counter++;
	// }
	// return newn;
	//
	// }

	// mirror inverse of a number
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int number = scn.nextInt();
	// boolean flag=converter(number);
	// System.out.print(flag);
	// }
	//
	// public static boolean converter(int number ){
	// boolean flag=false;
	// int counter = 1;
	// int newn = 0;
	// int number1=number;
	// while (number != 0) {
	// int a = number % 10;
	// newn += (counter * (int) Math.pow(10, a - 1));
	// number = number / 10;
	// counter++;
	// }
	// if(newn==number1)
	// {
	// flag=true;
	// }
	// return flag;
	//
	//
	// }

	// logarithm
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// System.out.print("enter number");
	// int a = scn.nextInt();
	// System.out.print("enter base");
	// int b = scn.nextInt();
	// System.out.print(logarithm(a,b));
	//
	// }
	//
	//
	//
	// public static int logarithm(int a, int b)
	// {
	// int counter=0;
	// while (a != 1) {
	//
	// a=a/b;
	// counter++;
	//
	// }
	// return counter;
	// }
	//

	// is armstrong

	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	// int num = scn.nextInt();
	// int digits=numberofdigits(num);
	//
	// boolean flag=isarmstrong(num,digits);
	// System.out.print(flag);
	//
	// }
	//
	//
	// public static int numberofdigits(int num1){
	// int counter=0;
	// while(num1!=0)
	// {
	// num1=num1/10;
	// counter++;
	// }
	// return counter;
	//
	// }
	//
	//
	// public static boolean isarmstrong(int num1, int dig){
	// int numw=0;
	// int num2=num1;
	// while(num1!=0){
	// int a=num1%10;
	// numw +=(int)Math.pow(a, dig);
	// num1=num1/10;
	// }
	// if(num2==numw)
	// {
	// return true;
	// }
	// else
	// {
	// return false;
	// }
	// }
	//

	// print armstrong
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	//
	// int lowerlimit = scn.nextInt();
	// int upperlimit = scn.nextInt();
	//
	// printallarmstrong(lowerlimit, upperlimit);
	//
	// }
	//
	//
	// public static int numberofdigits(int num1){
	// int counter=0;
	// while(num1!=0)
	// {
	// num1=num1/10;
	// counter++;
	// }
	// return counter;
	//
	// }
	//
	//
	// public static boolean isarmstrong(int num1, int dig){
	// int numw=0;
	// int num2=num1;
	// while(num1!=0){
	// int a=num1%10;
	// numw +=(int)Math.pow(a, dig);
	// num1=num1/10;
	// }
	// if(num2==numw)
	// {
	// return true;
	// }
	// else
	// {
	// return false;
	// }
	// }
	// public static void printallarmstrong(int lowerlimit, int upperlimit)
	// {
	// for(int a=lowerlimit+1; a<upperlimit; a++){
	//
	//
	// if(isarmstrong(a,numberofdigits(a))==true)
	// {
	// System.out.println(a);
	// }
	//
	//
	// }
	// }

	// gcd

	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	//
	// int N1 = scn.nextInt();
	// int N2 = scn.nextInt();
	//
	// System.out.print(gcd(N1,N2));
	//
	// }
	//
	//
	// public static int gcd(int n1, int n2)
	// {
	// int divident = n1;
	// int divisor = n2;
	//
	// while (divident % divisor != 0) {
	//
	// int rem = divident % divisor;
	//
	// // iteration prep
	// divident = divisor;
	// divisor = rem;
	// }
	//
	// return divisor;
	// }

	// lcm
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	//
	// int N1 = scn.nextInt();
	// int N2 = scn.nextInt();
	//
	// System.out.print(lcm(N1,N2));
	//
	// }
	//
	//
	// public static int lcm(int n1, int n2) {
	// int divident = n1;
	// int divisor = n2;
	//
	// while (divident % divisor != 0) {
	//
	// int rem = divident % divisor;
	//
	// // iteration prep
	// divident = divisor;
	// divisor = rem;
	// }
	// int gcd=divisor;
	// int lcm;
	// lcm=(n1*n2)/gcd;
	// return lcm;
	// }

	// power
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	//
	// int a= scn.nextInt();
	// int b = scn.nextInt();
	//
	// System.out.print(power(a,b));
	//
	// }
	//
	//
	// public static int power(int a, int b) {
	// int p=1;
	// int ans=1;
	// for(p=1; p<=b; p++)
	// {
	// int m=a;
	// ans=ans*m;
	// }
	// return ans;
	// }

	// lcm
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	//
	// int N1 = scn.nextInt();
	// int N2 = scn.nextInt();
	//
	// series(N1, N2);
	//
	// }
	//
	// public static void series(int n1, int n2) {
	//
	// int a = 1;
	// int n = 1;
	// int counter = 0;
	// for (a = 1; a <= n1; a++) {
	// for (n = 1; counter < n1; n++) {
	// int val = 3 * (n) + 2;
	//
	// if (val % n2 != 0)
	//
	// {
	// System.out.println(val);
	// counter++;
	// }
	//
	// }
	//
	// }
	// }

	// integral part of square root
	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	//
	// int N = scn.nextInt();
	//
	//
	// System.out.println(series(N));
	//
	// }
	//
	// public static int series(int n) {
	// int a=(int)Math.pow(n, 0.5);
	//
	// return a;
	// }

	// cases

	// public static void main(String[] args) {
	// Scanner scn = new Scanner(System.in);
	//
	// int a=scn.nextLine().charAt(0);
	// if(a>='a' && a<='z')
	// {
	// System.out.print("lowercase");
	// }
	// else if(a>='A' &&a<='Z')
	// {
	// System.out.print("UPPERCASE");
	// }
	// else
	// {
	// System.out.print("invalid");
	//
	// }
	//
	//
	// }

	// calculator
	// public static void main(String[] args) {
	//
	// Scanner scn = new Scanner(System.in);
	// int flag=1;
	// while(flag!=0){
	//
	// char a=scn.next().charAt(0);
	// if (a=='X' || a=='x')
	// {
	//
	// flag=0;
	// break;
	// }
	//
	// else if(a=='+'){
	// int N1=scn.nextInt();
	// int N2=scn.nextInt();
	// plus(N1 , N2);
	// flag++;
	//
	//
	// }
	// else if(a=='-'){
	// int N1=scn.nextInt();
	// int N2=scn.nextInt();
	// minus(N1 , N2);
	// flag++;
	//
	// }
	// else if(a=='*'){
	// int N1=scn.nextInt();
	// int N2=scn.nextInt();
	// multiply(N1 , N2);
	// flag++;
	// }
	// else if(a=='/'){
	// int N1=scn.nextInt();
	// int N2=scn.nextInt();
	// divide(N1 , N2);
	// flag++;
	// }
	// else if(a=='%'){
	// int N1=scn.nextInt();
	// int N2=scn.nextInt();
	// modulus(N1 , N2);
	// flag++;
	// }
	// else
	//
	//
	// System.out.println("Invalid operation. Try again.");
	// flag++;
	//
	//
	// }
	//
	// }
	//
	// public static void minus(int N1, int N2)
	// {
	//
	// System.out.println(N1-N2);
	// }
	// public static void plus(int N1, int N2)
	// {
	//
	// System.out.println(N1+N2);
	// }
	// public static void multiply(int N1, int N2)
	// {
	//
	// System.out.println(N1*N2);
	// }
	// public static void divide(int N1, int N2)
	// {
	//
	// System.out.println(N1/N2);
	// }
	// public static void modulus(int N1, int N2)
	// {
	// System.out.println(N1%N2);
	// }

	// VALID INVALID SEQUENCE

	public static void  main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean flag=true;
		int N = scn.nextInt();
		int p = scn.nextInt();
		for(int i=2; i<=N; i++)
		{
			int c = scn.nextInt();
			int f=1;
			if(f!=0)
			{
				if(p>c)
				{
					f=1;
				}
				else
				{
					
				}
			}
			else
			{
				flag=true;
			}
			p=c;
			
		}
				System.out.println(flag);
		
		
		
		
		
		
		
		
	}

}
