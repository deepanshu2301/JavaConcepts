package Heap;

import java.util.ArrayList;

import generics.cars;

public class HeapGenericClient {

	public static void main(String[] args) {

		HeapGeneric<cars> hg = new HeapGeneric<cars>();

		cars[] car = new cars[5];
		car[0] = new cars(100, 1000, "blue");
		car[1] = new cars(200, 2000, "black");
		car[2] = new cars(300, 3000, "violet");
		car[3] = new cars(400, 4000, "red");
		car[4] = new cars(500, 5000, "green");
		hg.add(car[0]);
		hg.add(car[1]);
		hg.add(car[2]);
		hg.add(car[3]);
		hg.add(car[4]);
		System.out.println(hg.remove());
		System.out.println(hg.remove());
		System.out.println(hg.remove());
		System.out.println(hg.remove());
		System.out.println(hg.remove());

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());

		list.get(0).add(10);
		list.get(0).add(20);
		list.get(0).add(30);
		list.get(0).add(40);
		list.get(1).add(2);
		list.get(1).add(3);
		list.get(1).add(5);
		list.get(2).add(6);
		list.get(2).add(15);
		list.get(2).add(23);
		list.get(3).add(1);
		list.get(3).add(2);
		list.get(3).add(3);

		mergesorted(list);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(5);
		list1.add(100);
		list1.add(60);
		list1.add(80);
		list1.add(2);

		kelements(list1, 3);
	}

	private static class pair implements Comparable<pair> {
		int listno;
		int data;
		int itemno;

		@Override
		public int compareTo(pair other) {

			return other.data - this.data;
		}

	}

	public static void mergesorted(ArrayList<ArrayList<Integer>> list) {
		HeapGeneric<pair> heap = new HeapGeneric<>();

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			pair np = new pair();
			np.data = list.get(i).get(0);
			np.listno = i;
			np.itemno = 0;
			heap.add(np);

		}

		while (!heap.isempty()) {
			pair rp = heap.remove();
			ans.add(rp.data);
			rp.itemno++;
			if (rp.itemno < list.get(rp.listno).size()) {
				rp.data = list.get(rp.listno).get(rp.itemno);
				heap.add(rp);
			}
		}

		System.out.println(ans);
	}

	public static void kelements(ArrayList<Integer> list, int k) {
		HeapGeneric<Integer> heap = new HeapGeneric<Integer>();

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			heap.add(list.get(i));
		}

		for (int i = k; i < list.size(); i++) {
			int rv = heap.get();
			if (rv < list.get(i)) {
				heap.remove();
				heap.add(list.get(i));
			}
		}

		while (!heap.isempty()) {
			ans.add(heap.remove());
		}

		System.out.println(ans);
	}

}
