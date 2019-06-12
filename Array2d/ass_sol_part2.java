package Array2d;

import java.util.ArrayList;
import java.util.Scanner;

public class ass_sol_part2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				int a = scn.nextInt();

				arr[i] = a;
			}
		
			int m = scn.nextInt();
			
				int[] arr1 = new int[m];

				for (int i = 0; i < arr1.length; i++) {
					int a = scn.nextInt();

					arr1[i] = a;
				}
				int j=0;
				if(m>n)
				{
					j=m;
				}
				else
				{
					j=n;
				}
				int[] farr = new int[j];
				farr=sumofarr(arr, arr1);
				if(farr[farr.length-1]!=0){
				for(int i=farr.length-1; i>=0;i--)
					
				{
					
					
					System.out.print(farr[i] + "," + " ");
					
				}
				}
				else
				{
					for(int i=farr.length-2; i>=0;i--)
						
					{
						
						
						System.out.print(farr[i] + "," + " ");
						
					}
				}
				System.out.println("END");
				// int m= scn.nextInt();
				// targetsum3(arr, m);
			

		

	}

//	public static void targetsum3(int[] arr, int m)

//	{
//		for (int counter = 0; counter <= arr.length - 1; counter++) {
//			for (int j = 0; j < arr.length - 1 - counter; j++) {
//				if (arr[j + 1] < arr[j]) {
//					int temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			int a = arr[i];
//
//			for (int j = i + 1; j < arr.length; j++) {
//				int b = arr[j];
//
//				for (int k = j + 1; k < arr.length; k++) {
//					if (arr[k] == m - a - b) {
//
//						if (a > b && a < arr[k]) {
//							System.out.print(b + "," + " " + a + " " + "and" + " " + arr[k]);
//							System.out.println();
//						} else if (a < arr[k] && b > arr[k]) {
//							System.out.print(a + "," + " " + arr[k] + " " + "and" + " " + b);
//							System.out.println();
//						} else if (arr[k] < a && a < b) {
//							System.out.print(arr[k] + "," + " " + a + " " + "and" + " " + b);
//							System.out.println();
//						} else if (arr[k] > b && a > arr[k]) {
//							System.out.print(b + "," + " " + arr[k] + " " + "and" + " " + a);
//							System.out.println();
//						} else if (a > b && b > arr[k]) {
//							System.out.print(arr[k] + "," + " " + b + " " + "and" + " " + a);
//							System.out.println();
//						} else {
//							System.out.print(a + "," + " " + b + " " + "and" + " " + arr[k]);
//							System.out.println();
//						}
//					}
//				}
//			}
//
//		}
//	}

	public static int[] sumofarr(int[] one, int[] two) {
		int m=0;
		if(one.length>two.length)
		{
			 m=one.length-1;
		}
		else
		{
			m=two.length-1;
		}
		int[] arr = new int[m+2];
		int carry=0;
		int i=one.length-1;
		int j=two.length-1;
		int k=0;
		while(i>=0 || j>=0)
		{
			
			int sum=carry;
			if(i>=0)
			{
				sum+=one[i];
			}
			 if (j>=0)
			{
				sum+=two[j];
			}
			
			int rem=sum%10;
			arr[k]=rem;
			carry=sum/10;
			
			i--;
			j--;
			k++;
			
		}
		if(carry!=0)
		{
			arr[k]=carry;
		}
		return arr;
	}

}











