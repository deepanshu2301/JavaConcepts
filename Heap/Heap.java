package Heap;

import java.util.ArrayList;


public class Heap {

	private ArrayList<Integer> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isempty() {
		return this.data.size() == 0;
	}

	public void display() {
		System.out.println(this.data);
	}

	public void add(int item) {

		this.data.add(item);
		int ci = this.data.size() - 1;
		upheapify(ci);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (data.get(pi) > data.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);

	}

	public int remove() {
		if(this.data.size()==0)
		throw new RuntimeException("heap is empty");
		
		swap(0, data.size() - 1);
		int rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int i) {

		int li = i;
		int lci = (2 * i) + 1;
		int rci = (2 * i) + 2;

		if (lci < data.size() && data.get(lci) < data.get(li)) {
			li = lci;
		}
		if (rci < data.size() && data.get(rci) < data.get(li)) {
			li = rci;
		}

		if (li != i) {
			swap(i, li);
			downheapify(li);
		}

	}
}
