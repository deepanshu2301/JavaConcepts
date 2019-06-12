package linkedlist;

public class linkedlist {

	private class Node {
		int data;
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

	public int getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {

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

	public void addLast(int item) {

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

	public void addFirst(int item) {

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

	public void addAt(int idx, int item) throws Exception {

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

	public int removeFirst() throws Exception {

		if (this.size < 0) {
			throw new Exception("Invalid Index.");
		}

		int rv = head.data;
		if (this.size == 0) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = head.next;
		}
		this.size--;

		return rv;
	}

	public int removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL empty");
		}
		int rv = this.tail.data;
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

	public int removeAt(int idx) throws Exception {

		if (idx <= 0 || idx >= this.size) {
			throw new Exception("LL empty");
		}

		int rv = getAt(idx);
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

	public void reversedi() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL empty");
		}

		for (int i = 0, j = this.size - 1; i < j; i++, j--) {

			Node nn1 = getNodeAt(i);
			Node nn2 = getNodeAt(this.size - 1 - i);

			int temp = nn1.data;
			nn1.data = nn2.data;
			nn2.data = temp;

		}

	}

	public void reversepi() throws Exception {

		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		Node a = this.tail;

		this.tail = this.head;
		this.head = a;
		tail.next = null;

	}

//	reverse pointers recursively
	private void PR(Node prev, Node curr) {
		if(curr==null){
			return;
		}
		PR(curr,curr.next);
		curr.next=prev;
	}

	public void PR() {
			
		PR(this.head,this.head.next);
		Node a = this.tail;

		this.tail = this.head;
		this.head = a;
		tail.next = null;
		
	}

	public void reverseDR() {
		HeapMover hm = new HeapMover();
		hm.left = this.head;
		reverseDR(hm, this.head, 0);
	}

	private void reverseDR(HeapMover hm, Node right, int count) {

		if (right == null) {
			return;
		}

		reverseDR(hm, right.next, count + 1);

		if (count >= this.size / 2) {
			int temp = hm.left.data;
			hm.left.data = right.data;
			right.data = temp;
		}

		hm.left = hm.left.next;

	}

	private class HeapMover {
		Node left;
	}

}
