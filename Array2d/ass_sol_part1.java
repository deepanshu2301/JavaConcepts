package Array2d;
import java.util.Scanner;

public class ass_sol_part1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 int n= scn.nextInt();
		 if(n>=1 && n<=1000){
		 int [] arr = new int[n];
		
		 for (int i=0; i<arr.length; i++)
		 {
		 int a=scn.nextInt();
		
		 arr[i]=a;
		 }
		 int m= scn.nextInt();
		 int [] arr1 = new int[m];
		 
		 
		
		 for (int i=0; i<arr1.length; i++)
		 {
		 int a=scn.nextInt();
		
		 arr1[i]=a;
		 }
//		 
		 
//		 intersection(arr,arr1);
		 sumofarrays(arr,arr1);
//		 int m= scn.nextInt();
//		 targetsumpairs2(arr,m);
//		 targetsumpairs3(arr,m);
		 }
		
		 
			// bubbleSort(arr);
		// for (int i=0; i<arr.length; i++)
		// {
		// int a=scn.nextInt();
		// if(a>=0 && a<=n-1)
		// {
		// arr1[i]=a;
		// }
		// }
		// System.out.println(rotate1(arr,arr1));

		// inverse(arr);
		// reverse(arr);
		// int m= scn.nextInt();
		// System.out.println(find(arr,m));
		// System.out.println(maxInArray(arr));
		// System.out.println(binarySearch(arr,m));

		// int rows = scn.nextInt();
		// int cols = scn.nextInt();
		// if(rows>=1 && rows<=10 && cols >=1 && cols <=10){
		// int[][] arr = new int[rows][];
		//
		// for (int row = 0; row < arr.length; row++) {
		//
		//
		//
		//
		// arr[row] = new int[cols];
		//
		// for (int col = 0; col < arr[row].length; col++) {
		//
		//
		// arr[row][col] = scn.nextInt();
		// }
		// }
		// spiralDisplayclock(arr);
		// spiralDisplayanticlock(arr);
		// }
		// waveDisplay(arr);

	}
//	public static void targetsumpairs3(int []arr, int m)
//	 {
//		for(int counter=0; counter<=arr.length-1; counter++)
//		{
//			for(int j=0; j<arr.length-1-counter; j++)
//			{
//				if(arr[j+1]<arr[j])
//				{
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//
//		 for(int a=0; a<arr.length; a++)
//		 {
//			 int b=arr[a];
//			
//			
//			
//			 for(int c=a; c<arr.length;c++)
//			 {
//				 if(arr[c+1]<=m-b)
//				 {
//				 	int d=arr[c+1];
//				 
//				
//				 if(arr[c]==m-b-d)
//				 {
//					 System.out.print(b + "," + " " + d + " " + "and" +" " +arr[c]);
//					 System.out.println();
//				 }
//				 }
//		      }
//				 
//	     }
//}
	 
//	public static void intersection(int [] arr, int [] arr1)
//	{
//
//		System.out.print("[");
//		for(int counter=0; counter<=arr.length-1; counter++)
//		{
//			for(int j=0; j<arr.length-1-counter; j++)
//			{
//				if(arr[j+1]<arr[j])
//				{
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		int k=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			
//
//			int m=arr[i];
//			
//			for(int j=0; j<arr1.length; j++)
//			{
//				
//				if(m==arr1[j])
//				{
//					if(k==0){
//					System.out.print(m);
//					arr1[j]=0;
//					 k=1;
//					}
//					else
//					{
//					System.out.print("," + " " +m);
//					arr1[j]=0;
//					break;
//					}
//				}
//			
//			}
//		}
//		System.out.print("]");
//	}
	public static void sumofarrays(int []arr , int [] arr1)
	{
		int a=arr.length-1;
		int b=arr1.length-1;
		int m=0;
		if(a>b)
		{
			 m=a;
		}
		else
		{
			 m=b;
		}
		int [] farr = new int[m];
		for(int i=arr.length-1, j=arr1.length-1; i>=0 && j>=0; i--, j--)
		{
			int z=arr[i] + arr1[j];
			if(j>=i){
			if(z<10)
			{
				farr[j]=z;
			}
			else
			{
				farr[j]=z%10;
				farr[j-1]+=1;
			}
			}
			else
			{
				if(z<10)
				{
					farr[i]=z;
				}
				else
				{
					farr[i]=z%10;
					farr[i-1]+=1;
				}
			}
		}
		
		for(int i=0; i<farr.length;i++){
			System.out.print(farr[i] + "," + " ");
		}
		System.out.println("END");
	}
//	public static void targetsumpairs2(int []arr, int m)
//	 {
//		for(int counter=0; counter<=arr.length-1; counter++)
//		{
//			for(int j=0; j<arr.length-1-counter; j++)
//			{
//				if(arr[j+1]<arr[j])
//				{
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//
//		 for(int a=0; a<arr.length; a++)
//		 {
//			 int b=arr[a];
//			 for(int c=a; c<arr.length;c++)
//			 {
//				 
//				 if(arr[c]==m-b)
//				 {
//					 if(m%2==0){
//
//						 if(c!=a){
//					 System.out.println(b + " " + "and"+" "+arr[c]);
//						 }
//					 }
//					 else
//					 {
//						 if(b<arr[c]){
//						 System.out.println(b + " " + "and"+" "+arr[c]);
//						 }
//						 else if(b>arr[c])
//						 {
//							 System.out.println(arr[c] + " " + "and"+" "+b);
//						 }
//					 }
//				 }
//				 
//			 }
//		 }
//	 }
	// public static void spiralDisplayanticlock(int[][] arr) {
	//
	// int rowMin = 0;
	// int rowMax = arr.length - 1;
	// int colMin = 0;
	// int colMax = arr[0].length - 1;
	// int nel = arr.length * arr[0].length;
	//
	// int counter = 0;
	//
	// while (counter < nel) {
	// // first row
	// for (int col = colMin; counter < nel && col <= colMax; col++) {
	// System.out.print(arr[rowMin][col] +","+ " ");
	// counter++;
	// }
	// rowMin++;
	// // end col
	// for (int row = rowMin; counter < nel && row <= rowMax; row++) {
	// System.out.print(arr[row][colMax] +","+ " ");
	// counter++;
	// }
	// colMax--;
	// // end row
	// for (int col = colMax; counter < nel && col >= colMin; col--) {
	// System.out.print(arr[rowMax][col] +","+ " ");
	// counter++;
	// }
	// rowMax--;
	// // first col
	// for (int row = rowMax; counter < nel && row >= rowMin; row--) {
	// System.out.print(arr[row][colMin] + ","+" ");
	// counter++;
	// }
	// colMin++;
	//
	// }
	// System.out.print("END");
	// }
	
	
	
	
	// public static void spiralDisplayclock(int[][] arr) {
	//
	// int rowMin = 0;
	// int rowMax = arr.length - 1;
	// int colMin = 0;
	// int colMax = arr[0].length - 1;
	// int nel = arr.length * arr[0].length;
	//
	// int counter = 0;
	//
	// while (counter < nel) {
	// // first col
	// for (int row = rowMin; counter < nel && row <= rowMax; row++) {
	// System.out.print(arr[row][colMin] + ","+" ");
	// counter++;
	// }
	// colMin++;
	//
	// // end row
	// for (int col = colMin; counter < nel && col <= colMax; col++) {
	// System.out.print(arr[rowMax][col] +","+ " ");
	// counter++;
	// }
	// rowMax--;
	//
	// // end col
	// for (int row = rowMax; counter < nel && row >= rowMin; row--) {
	// System.out.print(arr[row][colMax] +","+ " ");
	// counter++;
	// }
	// colMax--;
	//
	// // first row
	// for (int col = colMax; counter < nel && col >= colMin; col--) {
	// System.out.print(arr[rowMin][col] +","+ " ");
	// counter++;
	// }
	// rowMin++;
	// }
	// System.out.print("END");
	// }
	// wave display both (just reverse the rows and columns and [0]'s)
	// public static void waveDisplay(int[][] arr) {
	//
	// for (int row = 0; row < arr.length; row++) {
	//
	// if (row % 2 == 0) {
	// for (int col = 0; col < arr[0].length; col++) {
	//
	// System.out.print(arr[row][col] + "," + " ");
	// }
	// } else {
	// for (int col = arr[0].length - 1; col >= 0; col--) {
	//
	// System.out.print(arr[row][col] + "," + " ");
	// }
	// }
	// }
	// System.out.println("END");
	// }

	// public static int maxInArray(int[] arr) {
	//
	// int max = Integer.MIN_VALUE;
	//
	// for (int i = 0; i < arr.length; i++) {
	// if (arr[i] > max) {
	// max = arr[i];
	// }
	// }
	//
	// return max;
	//
	// }

	// public static int find(int[] arr, int val) {
	//
	// for (int i = 0; i < arr.length; i++) {
	// if (arr[i] == val) {
	// return i;
	// }
	// }
	// return -1;
	//
	// }

	// public static int binarySearch(int[] arr, int val) {
	//
	// int left = 0;
	// int right = arr.length - 1;
	//
	// while (left <= right) {
	//
	// int mid = (left + right) / 2;
	//
	// if (arr[mid] < val) {
	// left = mid + 1;
	// } else if (arr[mid] > val) {
	// right = mid - 1;
	// } else {
	// return mid;
	// }
	// }
	//
	// return -1;
	//
	// }

	// public static void reverse(int[] arr) {
	//
	// int left = 0;
	// int right = arr.length - 1;
	//
	// while (left < right) {
	//
	// int temp = arr[left];
	// arr[left] = arr[right];
	// arr[right] = temp;
	//
	// left++;
	// right--;
	// }
	// for (int i = 0; i < arr.length; i++) {
	// System.out.println(arr[i]);
	// }
	//
	// }

	// public static void inverse(int[] arr) {
	//
	// int[] na = new int[arr.length];
	//
	// for (int i = 0; i < na.length; i++) {
	// na[arr[i]] = i;
	// }
	// for (int i = 0; i < arr.length; i++) {
	// System.out.println(na[i]);
	//
	// }
	// }

	// public static boolean rotate(int[] arr) {
	//
	// int[] na = new int[arr.length];
	//
	// for (int i = 0; i < na.length; i++) {
	// na[arr[i]] = i;
	// }
	// for(int j=0; j<arr.length; j++)
	// {
	// if(arr[j]!=na[j])
	// {
	// return false;
	// }
	//
	// }
	// return true;
	//
	// }

	// public static boolean rotate1(int[] arr, int[] arr1) {
	//
	// int[] na = new int[arr.length];
	//
	// for (int i = 0; i < na.length; i++) {
	// na[arr1[i]] = i;
	// }
	// for(int j=0; j<arr.length; j++)
	// {
	// if(arr[j]!=na[j])
	// {
	// return false;
	// }
	//
	// }
	// return true;
	//
	// }

	// public static void bubbleSort(int[] arr) {
	//
	// for (int counter = 0; counter < arr.length - 1; counter++) {
	//
	//// System.out.println("Counter " + counter);
	// for (int j = 0; j < arr.length - 1 - counter; j++) {
	//
	// if (arr[j + 1] < arr[j]) {
	// int temp = arr[j];
	// arr[j] = arr[j + 1];
	// arr[j + 1] = temp;
	// }
	//
	// }
	//
	//
	// }
	// for (int i=0; i<arr.length; i++)
	// {
	// System.out.println(arr[i]);
	// }
	// }

}
