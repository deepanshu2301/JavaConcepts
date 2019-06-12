package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class assignmentsol {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		int n = scn.nextInt();
//		invertedtriangle(n,1,1);
//		printBox(1,1,n);
//		System.out.println(ntriangle(n));
//		int m = scn.nextInt();
		String str = scn.nextLine();
//		System.out.println(remdup(str));
//		System.out.println(dupfom(str));
//		palindrome2(str,0,str.length()-1);
//		String str1 = scn.nextLine();
//		isreverse(str,str1);
//		System.out.println(sumofdig(str));
//		System.out.println(tonum(str));
		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> ans1 = new ArrayList<>();
		StringBuilder sb=new StringBuilder();
//		ans = boardpath(0,n,m);
//		ans = permutations(str);
		
		for(int j=0;j<str.length();j++)
		{
		char ch = str.charAt(j);
		for(int i=0;i<str.length();i++)
		{
			
			if(ch>str.charAt(i))
			{
				sb.append(str.charAt(i));
			}
			
		}
		
		}
		
		System.out.println(sb);
		char ch=str.charAt(0);
		
		System.out.println(ans.size());
		for (String t : ans) {
			if(ch==t.charAt(0)){
			System.out.print(t + " ");
			}
			else{
				ans1.add(t);
			}
			
				
		}
		for (String t : ans1) {
			System.out.print(t + " ");
		}
		
//		int []arr = new int[n];
//		for(int i=0; i<n; i++)
//		{
//			int m = scn.nextInt();
//			arr[i]=m;
//		}
//		int m = scn.nextInt();
//		ispallindrome(arr,0,arr.length-1);
//		reversearr(arr,0);
//		System.out.println(issorted(arr));
		
//		int m = scn.nextInt();
//		System.out.println(findStartIndex(arr,0 , m));
//		System.out.println(findlastIndex(arr,0 , m));
//		System.out.println(ispresent(arr,0,m));
//		 int arr1[] =findallIndex(arr, 0,m,0);
//				 for(int i=0; i<arr1.length;i++)
//				 {
//				 System.out.print(arr1[i] + " ");
//				 }
//		bubbleSort(arr, 0, arr.length-1);
//		for(int i=0; i<n; i++)
//		{
//			
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println(ans.size());
//		for(int i=0;i<ans.size();i++)
//		{
//			System.out.print(ans.get(i) + " ");
//		}
	}
	
	public static String dupfom(String str){
		if(str.length()==1){
			String s;
			s="";
			return s;
		}
		char ch1=str.charAt(0);
		char ch2=str.charAt(1);
		String ros = str.substring(1);
		StringBuilder sb = new StringBuilder();
		if(ch1==ch2)
		{
			sb.append(ch1);
			sb.append("*");
			sb.append(ch2);
			dupfom(ros);
			
		}
		else
		{
			sb.append(ch1);
			sb.append(ch2);
			dupfom(ros);
		}
		return sb.toString();
	}
	public static void palindrome2(String str,int strt,int end){
		if(strt>=end || str.length()==0){
			System.out.println("true");
			return;
		}
		int i=str.charAt(0);
		int j=str.charAt(end);
		String ros = str.substring(1,str.length()-1);
		if(i==j)
		{
			palindrome2(ros,0,ros.length()-1);
		}
		else
		{
			System.out.println("false");
			return;
		}
	}
	public static void isreverse(String str,String str1){
		if(str.length()==0 && str1.length()==0){
			System.out.println("true");
			return;
		}
		int i=str.charAt(0);
		int j=str1.charAt(str1.length()-1);
		String ros = str.substring(1);
		String ros1 = str1.substring(0,str1.length()-1);
		if(i==j)
		{
			isreverse(ros,ros1);
		}
		else
		{
			System.out.println("false");
			return;
		}
	}
	public static int tonum(String str){
		if(str.length()==0)
		{
			return 0;
		}
		int i=str.charAt(0);
		i=i-48;
		String ros = str.substring(1);
		int r=tonum(ros);
		int ans=(i*(int)Math.pow(10, str.length()-1))+r;
		return ans;
	}
	public static int sumofdig(String str){
		if(str.length()==0)
		{
			return 0;
		}
		int i=str.charAt(0);
		i=i-48;
		String ros = str.substring(1);
		
		int r=sumofdig(ros);

		int ans=r+i;
		return ans;
	}
	public static void invertedtriangle( int ct,int row, int col) {
	
		if(ct<=0)
		{
			return;
		}
		if(col>ct)
		{
			System.out.println();
			invertedtriangle(ct-1,row+1,1);
			return;
		}
		System.out.print("*" + "	");
		invertedtriangle(ct, row, col+1);
		
	}
	public static void reversearr(int[] arr, int strt) {
		if(strt==arr.length)
		{
			return;
		}
		reversearr(arr,strt+1);
		System.out.print(arr[strt] + "	");
	}
	public static void ispallindrome(int [] arr, int strt,int end){
			
			if(strt==end || strt>(arr.length/2) || end<(arr.length/2))
			{
				System.out.println("true");
				return;
				
			}
			if(arr[strt]==arr[end])
			{
				ispallindrome(arr,strt+1,end-1);	
			}
			if(arr[strt]!=arr[end])
			{
				System.out.println("false");
			}
			
	}	
	public static void printBox(int row, int col, int n) {
	

		if (row > n) {
			return;
		}

		if (col > row) {
			System.out.println();
			printBox(row + 1, 1, n);

			return;
		}

		System.out.print("*" + "	");
		printBox(row, col + 1, n);

	}
	public static int[] findallIndex(int[] arr, int count, int val, int r) {
		if (count == arr.length) {
			int[] arr2 = new int[r];
			return arr2;
		}
		int[] arr1;
		if (arr[count] == val) {
			arr1 = findallIndex(arr, count + 1, val, r + 1);
			arr1[r] = count;

		} else {
			arr1 = findallIndex(arr, count + 1, val, r);
		}

		return arr1;
	}
	public static int findlastIndex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}

		int ra = findlastIndex(arr, vidx + 1, item);

		if (arr[vidx] == item && ra == -1) {
			return vidx;
		}

		return ra;
	}
	public static int findStartIndex(int[] arr, int count, int val) {
		if (count == arr.length) {
			return -1;
		}
		if (arr[count] == val) {
			return count;
		}
		return findStartIndex(arr, count + 1, val);
	}
	public static boolean ispresent(int []arr,int strt, int m)
	{
		if(strt==arr.length)
		{
			return false;
		}
		ispresent(arr,strt+1,m);
	    if(arr[strt]==m)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
			
	}
	public static boolean issorted(int []arr)
	{
		int count =1;
		int []arr1= new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			
			arr1[i]=arr[i];
		}
		bubbleSort(arr1,0,arr1.length-1);
		for(int i=0; i<arr1.length;i++)
		{
			if(arr1[i]!=arr[i])
			{
				count=0;
				break;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int ntriangle(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int sum=0;
		int s= ntriangle(n-1);
		sum=n+s;
		return sum;
	}
	public static void bubbleSort(int[] arr, int si, int ei) {

		if (ei == 0) {
			return;
		}

		if (si == ei) {
			bubbleSort(arr, 0, ei - 1);
			return;
		}

		if (arr[si] > arr[si + 1]) {

			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
		}

		bubbleSort(arr, si + 1, ei);

	}
	public static ArrayList<String> boardpath(int curr,int end, int j)
	{
		if(curr == end)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if(curr> end)
		{
			ArrayList<String> br = new ArrayList<>();
		
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		
		for(int  i=1; i<=j; i++)
		{
		
			ArrayList<String> rr = boardpath(curr + i,end,j);
			
			for(String t : rr)
			{
				mr.add(i + t);
			}
			
			
		}
		
		return mr;
	}
	public static ArrayList<String> permutations(String str)
	{
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rr = permutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for(String t : rr)
		{
			for(int i=0; i<=t.length(); i++)
			{
				String ans=t.substring(0, i)+ ch + t.substring(i);
				mr.add(ans);
			}
		}
		return mr;
	}
}
