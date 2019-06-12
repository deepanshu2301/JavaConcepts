package generic_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//import binarytree.binarytree.orderpair;

public class generictree {

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;
	private int size;

	public generictree() {
		// scanner is passed so that the whole data can be readed in a single
		// time and we don't need to write the data in seperate lines.
		this.root = takeinput(new Scanner(System.in), null, -1);
	}

	public Node takeinput(Scanner scn, Node parent, int ith) {
		if (parent == null) {
			System.out.println("enter the data of root class");
		} else {
			System.out.println("enter the value of " + ith + "");
		}

		int val = scn.nextInt();
		Node nn = new Node();
		nn.data = val;
		size++;

		System.out.println("enter the number of childrens");
		int nc = scn.nextInt();
		for (int i = 0; i < nc; i++) {
			Node child = takeinput(scn, nn, i);
			nn.children.add(child);
		}

		return nn;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void dispaly() {
		display(this.root);
	}

	private void display(Node node) {
		String str = node.data + "->";

		for (int i = 0; i < node.children.size(); i++) {
			str += node.children.get(i).data + ",";
		}
		str += ".";
		System.out.println(str);
		for (Node child : node.children) {
			display(child);
		}
	}

	public int size2() {
		return size2(this.root);
	}

	private int size2(Node node) {
		int size = 0;
		for (Node child : node.children) {
			size += size2(child);
		}
		return size + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		int imax = Integer.MIN_VALUE;

		for (Node child : node.children) {
			int maxsf = max(child);
			if (maxsf > imax) {
				imax = maxsf;
			}

		}
		if (node.data < imax) {
			return imax;
		} else {
			return node.data;
		}

	}

	public boolean find(int item) {
		return find(this.root, item, false);
	}

	private boolean find(Node node, int item, boolean flag) {

		if (item == node.data) {
			flag = true;
		}

		for (Node child : node.children) {
			flag = find(child, item, flag);
		}

		return flag;
	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {

		int hi = -1;

		for (Node child : node.children) {
			int hsf = height(child);
			if (hsf > hi) {
				hi = hsf;
			}

		}

		return hi + 1;

	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}

		for (int i = 0, j = node.children.size() - 1 - i; i < node.children.size() / 2; i++) {

			Node node1 = node.children.get(i);
			Node node2 = node.children.get(j);

			node.children.set(j, node1);
			node.children.set(i, node2);

		}

	}

	public void linearize() {
		linearize(this.root);
	}

	private void linearize(Node node) {

		for (Node child : node.children) {
			linearize(child);
			Node nn = getleft(child);
			Node nn1 = new Node();
			nn1.data = child.data;
			nn.children.add(nn1);
		}

	}

	private Node getleft(Node node) {

		for (Node child : node.children) {
			getleft(child);
		}
		return node;

	}

	private class parent {
		Node nn;
	}

	public void flatten() {
		parent par = new parent();
		par.nn = this.root;
		flatten(this.root, par);
	}

	private void flatten(Node node, parent par) {
		// if(node==null){
		// return;
		// }

		for (Node child : node.children) {
			flatten(child, par);
			Node nn1 = new Node();
			nn1.data = child.data;
			par.nn.children.add(nn1);
			child = null;
		}

		display(par.nn);
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {

		System.out.print(node.data + " ");
		for (Node child : node.children) {
			preorder(child);
		}
	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}
		System.out.println(node.data);
	}

	public void levelorder() {

		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data);
			for (Node child : rn.children) {
				queue.addLast(child);
			}
		}
	}

	public void levelorderzigzag() {
		int flag = 0;

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> stack = new LinkedList<>();

		queue.addLast(this.root);

		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");
			if (flag % 2 == 0) {
				for (Node child : rn.children) {

					stack.addFirst(child);
				}
			} else {
				for (int i = rn.children.size() - 1; i >= 0; i--) {
					stack.addFirst(rn.children.get(i));
				}

			}
			if (queue.isEmpty()) {
				System.out.println();
				flag++;
				queue = stack;
				stack = new LinkedList<>();
			}

		}
	}

	public void levelorderlinewise() {

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> queue2 = new LinkedList<>();
		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				queue2.addLast(child);
			}
			if (queue.isEmpty()) {
				System.out.println();
				queue = queue2;
				queue2 = new LinkedList<>();
			}

		}
	}

	private class heapmover {

		int size = 0;
		int height = 0;
		boolean found = false;
		int max = Integer.MIN_VALUE;
		Node justlarger;
		Node pred;
		Node sucs;
	}

	public void multimover(int item) {
		heapmover mover = new heapmover();
		multisolver(this.root, mover, item, 0);

		System.out.println("size=" + mover.size);
		System.out.println("max=" + mover.max);
		System.out.println("height=" + mover.height);
		System.out.println("found=" + mover.found);
		System.out.println("pred=" + (mover.pred == null ? null : mover.pred.data));
		System.out.println("sucs=" + (mover.sucs == null ? null : mover.sucs.data));
		System.out.println("just larger=" + (mover.justlarger == null ? null : mover.justlarger.data));
	}

	private void multisolver(Node node, heapmover mover, int item, int level) {

		mover.size++;

		if (level > mover.height) {
			mover.height = level;
		}
		if (node.data > mover.max) {
			mover.max = node.data;
		}
		if (mover.found == true && mover.sucs == null) {
			mover.sucs = node;
		}
		if (node.data == item) {
			mover.found = true;
		}
		if (mover.found == false) {
			mover.pred = node;
			;
		}

		if (node.data > item) {
			if (mover.justlarger == null) {
				mover.justlarger = node;
			}
			if (node.data < mover.justlarger.data) {
				mover.justlarger = node;
			}
		}

		for (Node child : node.children) {

			multisolver(child, mover, item, level + 1);
		}

	}

	private class orderpair {
		Node node;
		int childrendone;
		boolean selfwork;

	}

	public void preorderi() {
		LinkedList<orderpair> stack = new LinkedList<>();
		orderpair rp = new orderpair();
		rp.node = this.root;
		stack.addFirst(rp);

		while (!stack.isEmpty()) {
			orderpair np = stack.getFirst();
			if (np.node == null) {
				stack.removeFirst();
				continue;
			}

			if (np.selfwork == false) {
				System.out.print(np.node.data + " ");
				np.selfwork = true;
			} else if (np.childrendone < np.node.children.size()) {
				orderpair zp = new orderpair();
				zp.node = np.node.children.get(np.childrendone);
				np.childrendone++;
				stack.addFirst(zp);
			} else {
				stack.removeFirst();

			}

		}
		System.out.println(".");
	}
}
