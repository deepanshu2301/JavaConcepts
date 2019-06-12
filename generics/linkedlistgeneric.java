package generics;

public class linkedlistgeneric<T> {
	private class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;
	
	
	public int size(){
		return this.size();
		
	}
	
	public boolean isEmpty(){
		return this.size==0;
		
	}
	
	public void display() {
	
		System.out.println("-------------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("-------------------------");
	}

	public T getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		return this.head.data;
	}

	public T getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		return this.tail.data;
	}

	public T getAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	public void addLast(T item) {

		// create a new node
		Node nn = new Node();

		// update the values of new node
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size > 0)
			this.tail.next = nn;

		// summary object update
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	public void addFirst(T item) {

		Node nn = new Node();

		nn.data = item;
		nn.next = null;
		
		
		nn.next = this.head;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}

	}

	public Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void addAt(int idx, T item) throws Exception {

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0)
			getFirst();

		else if (idx == this.size)
			getLast();

		else {
			Node nn = new Node();

			nn.data = item;
			nn.next = null;

			Node nn1 = getNodeAt(idx - 1);
			Node nn2 = getNodeAt(idx);

			nn1.next = nn;
			nn.next = nn2;

			this.size++;
		}
	}

	public T removeFirst() throws Exception {

		if (this.size < 0) {
			throw new Exception("Invalid Index.");
		}

		T rv = head.data;
		if (this.size == 0) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = head.next;
		}
		this.size--;

		return rv;
	}

	public T removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL empty");
		}
		T rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node nn1 = getNodeAt(this.size - 2);
			this.tail = nn1;
			this.tail.next = null;
		}
		this.size--;
		return rv;
	}

	public T removeAt(int idx) throws Exception {

		if (idx <= 0 || idx >= this.size) {
			throw new Exception("LL empty");
		}

		T rv = getAt(idx);
		if (idx == 1)
			return removeFirst();
		if (idx == this.size - 1)
			return removeLast();

		else {
			Node nn1 = getNodeAt(idx - 1);
			nn1.next = nn1.next.next;

		}

		this.size--;
		return rv;
	}
}
