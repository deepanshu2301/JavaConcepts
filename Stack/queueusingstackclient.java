package Stack;

public class queueusingstackclient {

	public static void main(String[] args) throws Exception {

		queueusingstack queue = new queueusingstack();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		System.out.println("--------");
		int a = queue.dequeue();
		System.out.println(a);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		queue.display();
		int b = queue.getFirst();
		System.out.println(b);
		queue.display();
	}

}
