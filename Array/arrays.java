package Array;

import java.util.Scanner;

public class arrays {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		
//			int [] arr={60,50,40,30,20,10};

			int [] arr={11,22,33,44,55};
		
//		int [] arr= get();
//		display(arr);
//		boolean flag =find(arr);
//		System.out.println(flag);
//		reverse(arr);
//		int [] arr1=inverse(arr);
//		System.out.println();
//		display(arr1);
////		int [] arr1=rotations(arr);
//		System.out.println();
//		display(arr1);
		System.out.println(binarysearch(arr));
//		
}
	public static void bubblesort(int [] arr){
		for(int counter=0; counter<=arr.length-1; counter++)
		{
			for(int j=0; j<arr.length-1-counter; j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		display(arr);
	}
	public static void insertionsort(int []arr)
	{
		for(int counter=1; counter<arr.length; counter++)
		{
			int val=arr[counter];
			int j=counter-1;
			while(j>=0 &&arr[j]>val)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
//		System.out.println();
		display(arr);
	}
	public static void alternativesort(int []arr)
	{
		for(int j=0;j<=(arr.length/2); j++){
		int max=arr[j];
		int min=arr[j];
		for(int i=j+1; i<arr.length;i++)
		{
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.print(max + " ");
//		int min=arr[j];
		for(int i=j+1; i<arr.length;i++)
		{
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.print(min + " ");
		}
	}
	public static void selectionsort(int []arr)
	{
		
		for(int counter=0; counter<arr.length; counter++)
		{
			int min=counter;
			for(int j=min+1; j<arr.length;j++){
			if(arr[min]>arr[j])
			{
				min=j;
			}
			
			}
			int temp=arr[min];
			arr[min]=arr[counter];
			 arr[counter]=temp;
			
		}
//		System.out.println();
		display(arr);
	}
	

	public static int[] get(){
//		System.out.println("size?");
		int n= scn.nextInt();
		int [] arr = new int[n];
		for (int i=0; i<arr.length; i++)
		{
			arr[i] =scn.nextInt();
		}
		return arr;
		
	}
	
	public static void display(int [] arr){
		for(int i=0; i<arr.length; i++ )
		{
			System.out.println(arr[i] + " ");
		}
		
	}
	
	public static boolean find(int [] arr){
		
		
		System.out.println("enter the number");
		int n= scn.nextInt();
		boolean flag=true;
		for(int i=0; i<arr.length; i++ )
		{
			if(arr[i]==n)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		}
		return flag;
	}
	
	public static void reverse(int [] arr){
		int i=0;
		int j=arr.length - 1;
		while(i<=(j+1)/2){
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		display(arr);
	}

//	inverse of an array means that a new array is created on which the indexing and data is interchanged compared to the given array
	

	public static int [] inverse(int [] arr){
		int n=arr.length;
		int [] arr1;
		arr1 =new int[n];
		
		for(int i=0; i <arr.length; i++ )
		{
			int j=arr[i];
			arr1[j]=i;
		}
		return arr1;
	}

	public static int [] rotations(int [] arr){
		System.out.println("enter rotations");
		
	    int r= scn.nextInt();
		r=r%arr.length;
		if(r<0)
		{
			r=r+arr.length;
		}
		
		
		int n=arr.length;
		int [] arr1;
		arr1 =new int[n];
		int x=0;
		while(x<=r-1)
		{
		arr1[x]=arr[n-r+x];
		x++;
		}
		int k=0;
		for(int i=r; i <arr.length; i++ )
		{
			
			arr1[i]=arr[k];
			k++;
			
		}
		
		
		return arr1;
	}
	
	public static int binarysearch(int [] arr){
		System.out.println("val?");
		int val= scn.nextInt();
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]<val)
			{
				left=mid+1;
			}
			else if(arr[mid]>val)
			{
				right=mid-1;
			}
			else 
			{
				return mid;
			}
		}
		return -1;
	}
	
	public static void subset(int [] arr){
		
		
		for(int i=0; i<=((int)Math.pow(2, arr.length-1)-1); i++)
		{
			
		}
	}
	
	
	
	
	
}
