package OOPS_story4;

public class FOClient {

	// two functions can be overloaded on the basis of number of arguments and types of arguments only
	// no overloading can be made on the basis of return type, use of static,and type of class(public/private)

	public static void main(String[] args) {

		// sum("abc", 2, 3, 5, 6, 7, 8);
		sum("abc", "def");
		int[] arr = { 3, 4, 5 };
		sum(arr);
	}

	public static void sum(int a, int b) {
		System.out.println(a + b + 9);
	}

	public static void sum(int a) {
		System.out.println(a);
	}

	// public void sum(int a, int b) {
	// System.out.println(a + b);
	// }

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void sum(String a, String b) {
		System.out.println(a + b);
	}

	// a function can be called with variable number of arguments also they are stored in an array and are saved
	// for this method the type of variables should be of same type(int,float,etc).
	// only one variable argument can be passes in a function and that too  should be present in the last.
	// we can also pass a array in the variable argument. it has the ability to read an array itself if required
	public static void sum(int... arg) {

		System.out.println("in vargs");
		int sum = 0;
		for (int val : arg)
			sum += val;

		System.out.println(sum);
	}
}
