package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arralist {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
//		int[] one = { 9, 9, 9 };
//		int[] two = { 9, 9, 9, 9 };
		int[] arr = { 1,1,0,1,0,0,1,1,0,1,1,0,1 };
		int m = scn.nextInt();
		maxone(arr,m);

		// System.out.println(Intersection(one, two));
//		System.out.println(add(one, two));
	}

	public static ArrayList<Integer> Intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0, j = 0; i < one.length && j < two.length;) {
			if (one[i] == two[j]) {
				ans.add(one[i]);
				i++;
				j++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				i++;
			}

		}
		return ans;
	}

	public static ArrayList<Integer> add(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		int carry=0;
		int i=one.length-1;
		int j=two.length-1;
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
			ans.add(0,rem);
			carry=sum/10;
			
			i--;
			j--;
		}
		if(carry!=0)
		{
			ans.add(0,carry);
		}
		return ans;
	}
	
	public static void maxone(int []arr, int m)
	{
		
		for(int counter=0; counter <= arr.length-1; counter++)
		{
			if(arr[counter]!=0)
			{
				
			}
			
			
		}
	}
	
	
	
}
