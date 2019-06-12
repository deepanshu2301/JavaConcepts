package adapters;

import linkedlist.linkedlist;

public class queue_using_LL {

	private linkedlist list = new linkedlist();

	public void enqueue(int item) {

		list.addLast(item);

	}

	public int dequeue() throws Exception {
		try {
			int rv = list.removeFirst();
			return rv;
		} catch (Exception e) {
			throw new Exception("Queue is empty");
		}
	}

	public int getFront() throws Exception {
		try {
			int rv = list.getFirst();
			return rv;
		} catch (Exception e) {
			throw new Exception("Queue is empty");
		}
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return isEmpty();
	}

	public void dispaly() {
		list.display();
	}

}
