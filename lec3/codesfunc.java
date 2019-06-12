package lec3;

import java.util.Scanner;

public class codesfunc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int lowerlimit = scn.nextInt();
		int upperlimit = scn.nextInt();
				int digits=numberofdigits(num);
				boolean flag=true;
				flag=isarmstrong(num,digits);
				printallarmstrong(lowerlimit, upperlimit);
				
			}
	
	
	public static int numberofdigits(int num1){
		int counter=0;
		while(num1!=0)
		{
			num1=num1/10;
			counter++;
		}
		return counter;
		
	}
	
	
	public static boolean isarmstrong(int num1, int dig){
		int numw=0;
		int num2=num1;
		while(num1!=0){
		int a=num1%10;
	    numw +=(int)Math.pow(a, dig);
	    num1=num1/10;
		}
		if(num2==numw)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		public static void printallarmstrong(int lowerlimit, int upperlimit)
		{
			for(int a=lowerlimit; a<=upperlimit; a++){
				
				
				if(isarmstrong(a,numberofdigits(a))==true)
				{
					System.out.println(a);
				}
				
				
			}
		}
		
		
		
		
		
	}
	

