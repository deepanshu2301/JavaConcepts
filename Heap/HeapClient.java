package Heap;

public class HeapClient {

	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.add(100);
		heap.add(25);
		heap.add(80);
		heap.add(40);
		heap.add(50);
		
		heap.display();
		
		System.out.println("======");
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		
		
	}
	

}
