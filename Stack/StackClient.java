package Stack;

public class StackClient {
	public static void main(String[] args) throws Exception {

		// a stack is created whose name is stack
		Stack stack = new dynamicstack();
		// int []arr = {80,50,30,60,100,10,40,90};
		//
		// int []arr1=stockspan(arr);
		//
		// for(int a : arr1){
		// System.out.println(a);
		// }
		//
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		stack.push(20);
		// Stack Hstack = new Stack(stack.size());
		sortStack(stack);
		stack.display();
		// stack.push(60);
		// stack.push(70);
		// stack.push(80);
		// stack.push(90);
		// stack.push(100);
		//
		// stack.display();
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());

		// this line will give the empty stack execption
		// System.out.println(stack.pop());

		// System.out.println(stack.isEmpty());
		// stack.display();
		// disprev(stack);
		// stack.display();

		// stack.display();
		// Stack stack1 = new Stack();
		// reverse(stack,stack1);
		// stack.display();

	}

	// to display the stack in the reverse order as compared to original display
	// function
	public static void disprev(Stack stack) throws Exception {

		if (stack.size() == 0) {
			return;
		}
		int a = stack.pop();
		disprev(stack);
		System.out.println(a);
		stack.push(a);

	}

	// to actually reverse the given stack with the help of another stack
	public static void reverse(Stack stack, Stack stack1) throws Exception {

		if (stack.size() != 0) {
			if (stack.size() == 0) {
				return;
			}
			int a = stack.pop();
			stack1.push(a);
			reverse(stack, stack1);
		} else {
			if (stack1.size() == 0) {
				return;
			}
			int b = stack1.pop();
			reverse(stack, stack1);
			stack.push(b);

		}
	}

	// to sort a given stack
	public static void sortStack(Stack stack) throws Exception {

		if (stack.isEmpty()) {
			return;
		}

		int elementToBePlaced = stack.pop();
		sortStack(stack);
		sortedInsert(stack, elementToBePlaced);
	}

	private static void sortedInsert(Stack stack, int item) throws Exception {

		if (stack.isEmpty() || stack.top() > item) {
			stack.push(item);
			return;
		}

		int temp = stack.pop();
		sortedInsert(stack, item);
		stack.push(temp);

	}

	// The span si of a stock’s price on a certain day i is the maximum number
	// of consecutive days
	// (up to the current day) the price of the stock has been less than or
	// equal to its price on day i.
	// Given input array with all stock prices return the spans. We can do this
	// using an array in O(n^2)
	// time but stack can help us do it in O(n) time.
	public static int[] stockspan(int[] arr) throws Exception {

		int[] arr1 = new int[arr.length];
		Stack stack = new Stack(arr.length);
		arr1[0] = 1;
		stack.push(0);
		for (int i = 1; i < arr.length; i++) {
			while (stack.size() != 0 && arr[i] > arr[stack.top()]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				arr1[i] = i + 1;
			} else {
				arr1[i] = i - stack.top();
			}

			stack.push(i);
		}

		return arr1;

	}
}
