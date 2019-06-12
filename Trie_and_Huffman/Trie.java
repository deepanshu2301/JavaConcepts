package Trie_and_Huffman;

import java.util.ArrayList;
import java.util.HashMap;

public class Trie {

	private class Node {
		char ch;
		boolean eow;
		HashMap<Character, Node> table;

		public Node(char ch) {
			this.ch = ch;
			this.eow = false;
			this.table = new HashMap<>();

		}
	}

	private Node root;
	private int noofword;
	private int noofnode;

	public Trie() {
		this.root = new Node('.');
	}

	public void addword(String word) {
		addword(this.root, word);
	}

	private void addword(Node parent, String word) {

		if (word.length() == 0) {
			parent.eow = true;
			noofword++;
			return;
		}
		char c = word.charAt(0);
		String row = word.substring(1);
		Node child = parent.table.get(c);
		if (child == null) {
			child = new Node(c);
			parent.table.put(c, child);
			addword(child, row);
		} else {
			addword(child, row);
		}

	}

	// Words display
	public void display() {
		display(this.root, "");
	}

	private void display(Node node, String asf) {

		if (node.eow == true) {
			System.out.println(asf);
		}
		ArrayList<Character> keys = new ArrayList<>(node.table.keySet());
		for (Character key : keys) {
			display(node.table.get(key), asf + key);
		}

	}

	// Node-wise display
	public void Display() {
		Display(this.root);
	}

	private void Display(Node node) {
		ArrayList<Character> keys = new ArrayList<>(node.table.keySet());
		String ans = node.ch + " -> ";

		for (Character key : keys) {
			ans += key + " ";

		}
		ans += ".";
		System.out.println(ans);
		for (Character key : keys) {
			Display(node.table.get(key));
		}

	}

	public boolean search(String word) {
		return search(this.root, word);
	}

	private boolean search(Node parent, String word) {

		if (word.length() == 0) {
			return parent.eow;
		}
		char c = word.charAt(0);
		String row = word.substring(1);
		Node child = parent.table.get(c);

		if (child == null) {
			return false;
		} else {
			return search(child, row);
		}

	}

	public void remove(String word) {
		remove(this.root, word);
	}

	private void remove(Node parent, String word) {

		if (word.length() == 0) {
			parent.eow = false;
			noofword--;
			return;
		}
		char c = word.charAt(0);
		String row = word.substring(1);
		Node child = parent.table.get(c);

		if (child == null) {
			return;
		} else {
			remove(child, row);
		}
		if (child.eow == false && child.table.size() == 0) {
			parent.table.remove(c);
			noofnode--;
		}

	}

}
