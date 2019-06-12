package Queue;

public class stackusingqueue {
	queue primaryQueue = new queue();

	// we can make either push function efficient or pop function effiecient
	// efficiency here means O(1).
	// if we consider the starting at last then push is efficient
	public void push(int item) throws Exception {

		try {
			primaryQueue.enqueue(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full.");
		}
	}

	public int pop() throws Exception {

		try {

			queue helperQueue = new queue();

			while (primaryQueue.size() != 1) {
				int temp = primaryQueue.dequeue();
				helperQueue.enqueue(temp);
			}

			int rv = primaryQueue.dequeue();

			primaryQueue = helperQueue;
			helperQueue = new queue();

			return rv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}
	}

	public int top() throws Exception {

		try {

			queue helperQueue = new queue();

			while (primaryQueue.size() != 1) {
				int temp = primaryQueue.dequeue();
				helperQueue.enqueue(temp);
			}

			int rv = primaryQueue.dequeue();
			primaryQueue.enqueue(rv);

			primaryQueue = helperQueue;
			helperQueue = new queue();

			return rv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}

	public int size() {

		return primaryQueue.size();
	}

	public boolean isEmpty() {

		return primaryQueue.isempty();
	}

	public void display() throws Exception {

		display(primaryQueue, 0);
	}

	private void display(queue queue, int count) throws Exception {

		if (queue.size() == count) {
			return;
		}

		int temp = queue.dequeue();
		queue.enqueue(temp);
		display(queue, count + 1);
		System.out.println(temp);

	}
}
