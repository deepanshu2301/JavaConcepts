package Sorting;

public class types_of_sorting {

	public static void main(String[] args) {
		int [] arr={44,11,88,33,99,22};
		quicksort(arr,0,arr.length-1);
		display(arr);
//		selectionsort(arr);
//		insertionsort(arr);
//		alternativesort(arr);
//		bubblesort(arr);
//		 int [] arr={10,50,20,5,40,90,1000};
//		 int [] arr1={30,40,70};
//		 int []ans= mergesorted(arr,arr1);        (in this function sorted elements are passed an it returns their added array )
//		 int []ans1=mergesort(arr, 0, arr.length-1);
		// int []ans=quicksort(arr, 0, arr.length-1);
//		 for(int val: ans1)
//		 {
//		 System.out.println(val);
//		 }
	}
	public static int[] mergesort(int[] arr, int left, int right) {
		if (left == right) {
			int[] br = new int[1];
			br[0] = arr[left];
			return br;
		}
		int mid = (left + right) / 2;
		int[] ls = mergesort(arr, left, mid);
		int[] rs = mergesort(arr, mid + 1, right);

		int[] ans = mergesorted(ls, rs);
		return ans;
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

	public static void quicksort(int[] arr, int ll, int up) {

		if (ll >= up) {
			return;
		}
		int left = ll;
		int right = up;
		int mid = (left + right) / 2;
		int pivot = arr[mid];

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

			quicksort(arr, ll, right);
			quicksort(arr, left, up);
		}
	}
	public static int[] mergesorted(int[] one, int[] two) {
		int[] ans = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] > two[j]) {
				ans[k] = two[j];
				j++;
				k++;
			} else {
				ans[k] = one[i];
				i++;
				k++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				ans[k] = two[j];
				j++;
				k++;
			}
		}
		if (j == two.length)

		{
			while (i < one.length) {
				ans[k] = one[i];
				i++;
				k++;
			}

		}

		return ans;

	}
	
	
	//	display
	public static void display(int [] arr){
		for(int i=0; i<arr.length; i++ )
		{
			System.out.println(arr[i] + " ");
		}
		
	}

}
