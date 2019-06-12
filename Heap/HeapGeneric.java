package Heap;

import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>> {

	private ArrayList<T> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isempty() {
		return this.data.size() == 0;
	}

	public void display() {
		System.out.println(this.data);
	}

	
	public void add(T item) {

		this.data.add(item);
		int ci = this.data.size() - 1;
		// int pi=(ci-1)/2;
		upheapify(ci);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if ( this.compare(data.get(ci), data.get(pi)) >0) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);

	}

	public T remove() {
		if(this.data.size()==0)
		throw new RuntimeException("heap is empty");
		
		swap(0, data.size() - 1);
		T rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int i) {

		int li = i;
		int lci = (2 * i) + 1;
		int rci = (2 * i) + 2;

		if (lci < data.size() && this.compare(data.get(lci), data.get(li)) >0) {
			li = lci;
		}
		if (rci < data.size() && this.compare(data.get(rci), data.get(li)) >0) {
			li = rci;
		}

		if (li != i) {
			swap(i, li);
			downheapify(li);
		}

	}
	
	private int compare(T t, T o){
		return t.compareTo(o);
	}

	public T get() {
		
		return this.data.get(0);
	}
}
