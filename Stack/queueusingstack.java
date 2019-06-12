package Stack;

//import Queue.Stack;

public class queueusingstack {
	Stack primaryStack = new Stack();

	public void enqueue(int item) throws Exception {

		try {
			primaryStack.push(item);
		} catch (Exception e) {
			throw new Exception("Queue is full");
		}

	}

	public int dequeue() throws Exception {
		Stack helper = new Stack();

		while (primaryStack.size() != 1) {

			int a = primaryStack.pop();
			helper.push(a);
		}

		int b = primaryStack.pop();

		while (helper.size() != 0) {
			int c = helper.pop();
			primaryStack.push(c);
		}
		return b;

	}

	public int getFirst() throws Exception {
		Stack helper = new Stack();

		while (primaryStack.size() != 1) {

			int a = primaryStack.pop();
			helper.push(a);
		}

		int b = primaryStack.pop();
		primaryStack.push(b);

		while (helper.size() != 0) {
			int c = helper.pop();
			primaryStack.push(c);
		}
		return b;
	}

	public int size() {
		return primaryStack.size();
	}

	public boolean isEmpty() {
		return primaryStack.isEmpty();
	}

	public void display() throws Exception {
		display(primaryStack, 0);
	}

	private void display(Stack primaryStack, int count) throws Exception {

		for (int i = primaryStack.tos; i >= 0; i--) {
			System.out.println(primaryStack.data[i]);
		}

	}

}
