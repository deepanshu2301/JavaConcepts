package Hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {
	private class HMnode {
		K key;
		V value;

		public HMnode(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private LinkedList<HMnode>[] bucketarray;
	private int size;

	public HashMap() {
		this(5);
	}

	public HashMap(int cap) {
		bucketarray = (LinkedList<HMnode>[]) new LinkedList[cap];
		this.size = 0;
		for (int i = 0; i < bucketarray.length; i++) {
			bucketarray[i] = new LinkedList<HMnode>();
		}
	}

	private int hashfunction(K key) {
		int hc = key.hashCode();
		int bi = Math.abs(hc) % bucketarray.length;
		return bi;
	}

	private int findingbucket(LinkedList<HMnode> bucket, K ktbu) {
		for (int i = 0; i < bucket.size(); i++) {
			HMnode pn = bucket.get(i);
			if (pn.key.equals(ktbu)) {
				return i;
			}
		}
		return -1;
	}

	public void put(K key, V value) {

		int bi = hashfunction(key);
		LinkedList<HMnode> bucket = bucketarray[bi];
		int fi = findingbucket(bucket, key);
		if (fi == -1) {
			HMnode nn = new HMnode(key, value);
			this.size++;
			bucket.addLast(nn);
		} else {
			HMnode nn = new HMnode(key, value);
			nn.value = value;
		}

		double threshold = (double) this.size / this.bucketarray.length;

		if (threshold > 2.0) {
			rehash();
		}
//		threshold is the average size of a bucket present in the whole bucketarray
//      traversing should be of constant time so we have taken this.
//		if size increases a limit then a new bucketarray is created and the size is reduced to keep the time fixed.
	}

	private void rehash() {

		LinkedList<HMnode>[] olda = new LinkedList[this.bucketarray.length];
		olda = bucketarray;
		this.bucketarray = (LinkedList<HMnode>[]) new LinkedList[2 * olda.length];
		this.size = 0;

		for (int i = 0; i < bucketarray.length; i++) {
			bucketarray[i] = new LinkedList<HMnode>();
		}
		for (int i = 0; i < olda.length; i++) {
			LinkedList<HMnode> bucket = olda[i];

			for (int j = 0; j < bucket.size(); j++) {
				HMnode node = bucket.get(j);
				put(node.key, node.value);
			}
		}

	}

	public V get(K key) {

		int bi = hashfunction(key);
		LinkedList<HMnode> bucket = bucketarray[bi];
		int fi = findingbucket(bucket, key);
		if (fi == -1) {
			return null;
		} else {
			HMnode nn = bucket.get(fi);
			return nn.value;
		}
	}

	public V remove(K key) {

		int bi = hashfunction(key);
		LinkedList<HMnode> bucket = bucketarray[bi];
		int fi = findingbucket(bucket, key);
		if (fi == -1) {
			return null;
		} else {
			HMnode nn = bucket.remove(fi);
			this.size--;
			return nn.value;

		}
	}

	public boolean containskey(K key) {

		int bi = hashfunction(key);
		LinkedList<HMnode> bucket = bucketarray[bi];
		int fi = findingbucket(bucket, key);
		if (fi == -1) {
			return false;
		} else {
			return true;
		}
	}

	public void display() {
		for (int i = 0; i < bucketarray.length; i++) {
			LinkedList<HMnode> bucket = bucketarray[i];
			System.out.print("B" + i + " ");

			for (int j = 0; j < bucket.size(); j++) {
				HMnode node = bucket.get(j);
				System.out.print(node.key + "@" + node.value + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public ArrayList<K> keyset() {
		ArrayList<K> keys = new ArrayList<>();
		for (int i = 0; i < bucketarray.length; i++) {
			LinkedList<HMnode> bucket = bucketarray[i];

			for (int j = 0; j < bucket.size(); j++) {
				HMnode node = bucket.get(j);
				keys.add(node.key);
			}
		}
		return keys;
	}

}
