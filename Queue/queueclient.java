package Queue;

public class queueclient {

	public static void main(String[] args) throws Exception {

		queue Queue = new dynamimcqueue();
		Queue.enqueue(10);
		Queue.enqueue(20);
		Queue.enqueue(30);
		Queue.enqueue(40);
		Queue.enqueue(50);
		// Queue.enqueue(60);
		// Queue.enqueue(70);
		// Queue.enqueue(80);
		// Queue.enqueue(90);
		// Queue.enqueue(100);

		// Queue.display();
		// Queue.dequeue();
		// Queue.dequeue();
		// Queue.enqueue(60);
		// Queue.enqueue(70);
		// Queue.display();
		// Queue.dequeue();
		// Queue.enqueue(90);
		// Queue.display();
		// Queue.enqueue(100);
		// Queue.enqueue(110);
		// Queue.enqueue(120);
		// Queue.enqueue(130);
		// Queue.display();

		// Queue.display();
		// reverse(Queue);
		// Queue.display();

		// Queue.display();
		disprev(Queue, 0);
		// System.out.println();
		// Queue.display();

	}

	public static void reverse(queue Queue) throws Exception {

		if (Queue.size() == 0) {
			return;
		}
		int a = Queue.dequeue();
		reverse(Queue);
		System.out.print(a + " ");
		Queue.enqueue(a);
	}

	public static void disprev(queue Queue, int count) throws Exception {

		if (Queue.size() == count) {
			return;
		}
		int a = Queue.dequeue();
		Queue.enqueue(a);
		disprev(Queue, count + 1);
		System.out.print(a + " ");

	}

}
