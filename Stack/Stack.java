package Stack;

public class Stack {
	protected int[] data;
	protected int tos;

	// tos refers to top of stack
	// it is a counter which is used to iterate within the array

	// default size of an array is set here
	// this is a constructor as no return type is specified
	public Stack() {
		this(5);
	}

	// cap will have the size of array
	// we always initiate tos by -1
	// value of tos will be increased after every addition
	// this is a constructor as no return type is specified
	public Stack(int cap) {

		this.data = new int[cap];
		this.tos = -1;
	}

	// this is used to add an element in the array
	public void push(int item) throws Exception {

		// it will throw an exception if the limit of array is achieved
		if (this.size() == this.data.length) {
			throw new Exception("Stack is Full.");
		}
		this.tos++;
		this.data[this.tos] = item;

	}

	// it is used to display an element and then remove it from the array
	public int pop() throws Exception {

		if (this.size() == 0) {
			throw new Exception("Stack is Empty.");
		}

		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;

		return rv;
	}

	// it is used to display an element
	public int top() throws Exception {

		if (this.size() == 0) {
			throw new Exception("Stack is Empty.");
		}

		int rv = this.data[this.tos];
		return rv;
	}

	// it will return the size of the array
	public int size() {
		return this.tos + 1;
	}

	// it will check if the array is empty or not
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// it will display the whole array
	public void display() {

//		System.out.println("-------------------------");
		for (int i = this.tos; i >= 0; i--) {
			System.out.println(this.data[i] + " ");
		}
//		System.out.println(".");
//		System.out.println("-------------------------");
	}

}
