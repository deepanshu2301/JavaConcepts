package Trie_and_Huffman;

import java.util.ArrayList;
import java.util.HashMap;

import Heap.HeapGeneric;

public class Huffman {

	private class Node implements Comparable<Node> {
		char ch;
		Node left;
		Node right;
		int cost;

		@Override
		public int compareTo(Node o) {

			return o.cost - this.cost;
		}

	}

	HashMap<Character, String> encoder = new HashMap<>();
	HashMap<String, Character> decoder = new HashMap<>();

	public Huffman(String trainingdataSet) {

		HashMap<Character, Integer> fmap = new HashMap<>();
		for (int i = 0; i < trainingdataSet.length(); i++) {
			char ch = trainingdataSet.charAt(i);
			if (fmap.containsKey(ch)) {
				int of = fmap.get(ch);
				int nf = of + 1;
				fmap.put(ch, nf);
			} else {
				fmap.put(ch, 1);
			}
		}

		ArrayList<Character> keys = new ArrayList<>(fmap.keySet());
		HeapGeneric<Node> heap = new HeapGeneric<>();
		for (char key : keys) {
			Node nn = new Node();
			nn.ch = key;
			nn.cost = fmap.get(key);
			heap.add(nn);
		}

		while (heap.size() != 1) {
			Node l = heap.remove();
			Node r = heap.remove();

			Node merged = new Node();
			merged.left = l;
			merged.right = r;
			merged.cost = l.cost + r.cost;
			heap.add(merged);
		}

		Node rn = heap.remove();
		encoderdecoder(rn, "");

	}

	private void encoderdecoder(Node rn, String asf) {
		if (rn.left == null && rn.right == null) {
			encoder.put(rn.ch, asf);
			decoder.put(asf, rn.ch);
			return;
		}

		encoderdecoder(rn.left, asf + "0");
		encoderdecoder(rn.right, asf + "1");

	}

	public String encode(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ans += encoder.get(ch);
		}
		return ans;
	}

	public String decode(String str) {
		String ans = "";
		String key = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			key += ch;
			if (decoder.containsKey(key)) {
				ans += decoder.get(key);
				key="";
			}
		}
		return ans;
	}
}
