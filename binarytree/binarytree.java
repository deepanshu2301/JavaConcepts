package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//import BST_binarsearchtree.BST.heapmover;
import linkedlist.linkedlist;

public class binarytree {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public binarytree() {
		this.root = takeinput(new Scanner(System.in), null, true);
	}

	private Node takeinput(Scanner scn, Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("enter the data of root class");
		} else {
			if (ilc == true) {
				System.out.println("enter the data of left class ");
			} else {
				System.out.println("enter the data of right class ");
			}
		}

		int val = scn.nextInt();
		Node nn = new Node();
		nn.data = val;
		size++;

		System.out.println("left child present ? ");
		boolean hlc = scn.nextBoolean();
		if (hlc) {
			nn.left = takeinput(scn, nn, true);
		}

		System.out.println("right child present ? ");
		boolean hrc = scn.nextBoolean();
		if (hrc) {
			nn.right = takeinput(scn, nn, false);
		}

		return nn;
	}

	public binarytree(int[] pre, int[] post, int[] in) {
		this.root = constructprein(pre, in, 0, pre.length - 1, 0, in.length - 1);
		this.root = constructpostin(post, in, 0, post.length - 1, 0, in.length - 1);
	}

	private Node constructprein(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
		if (plo > phi) {

			return null;
		}
		Node nn = new Node();
		nn.data = pre[plo];
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				si = i;
				break;
			}
		}
		int nel = si - ilo;
		nn.left = constructprein(pre, in, plo + 1, plo + nel, ilo, si - 1);
		nn.right = constructprein(pre, in, plo + nel + 1, phi, si + 1, ihi);

		return nn;

	}

	private Node constructpostin(int[] post, int[] in, int plo, int phi, int ilo, int ihi) {
		if (plo > phi) {

			return null;
		}
		Node nn = new Node();
		nn.data = post[phi];
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (post[phi] == in[i]) {
				si = i;
				break;
			}
		}
		int nel = si - ilo;

		nn.left = constructpostin(post, in, plo, plo + nel - 1, ilo, si - 1);
		nn.right = constructpostin(post, in, plo + nel, phi - 1, si + 1, ihi);

		return nn;

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		String str = "";
		if (node == null) {
			return;
		}

		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}

		str += "=>" + node.data + "<=";
		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}

		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size2() {
		return size2(this.root);
	}

	private int size2(Node node) {

		if (node == null) {
			return 0;
		}
		int lc = size2(node.left);
		int rc = size2(node.right);

		return lc + rc + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node == null) {
			return 0;
		}
		int imax = Integer.MIN_VALUE;

		int maxl = max(node.left);
		if (maxl > imax) {
			imax = maxl;
		}

		int maxr = max(node.right);
		if (maxr > maxl) {
			imax = maxr;
		}

		if (node.data > imax) {
			imax = node.data;
		}
		return imax;

	}

	public boolean find(int item) {
		return find(this.root, item, false);
	}

	private boolean find(Node node, int item, boolean flag) {

		if (node == null) {
			return flag;
		}
		if (item == node.data) {
			flag = true;
		}

		flag = find(node.left, item, flag);
		flag = find(node.right, item, flag);

		return flag;
	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {

		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		if (rh > lh) {
			return rh + 1;
		} else {
			return lh + 1;
		}

	}

	public ArrayList<Integer> path(int item) {
		ArrayList<Integer> ans = new ArrayList<>();
		return path(this.root, item, ans);
	}

	private ArrayList<Integer> path(Node node, int item, ArrayList<Integer> ans) {

		ArrayList<Integer> temp = new ArrayList<>();
		if (node == null && node.data != item) {
			ans.remove(ans.size() - 1);

			return ans;
		}
		if (node.data == item) {
			ans.add(item);

		}

		ans.add(node.data);
		path(node.left, item, ans);
		path(node.right, item, ans);

		return ans;

	}

	public int diameter() {
		return diameter(this.root);
	}

	private diapair diameter2(Node node) {

		if (node == null) {
			diapair res = new diapair();
			res.height = -1;
			res.diameter = 0;
			return res;
		}

		diapair left = diameter2(node.left);
		diapair right = diameter2(node.right);
		diapair ans = new diapair();
		ans.height = Math.max(left.height, right.height) + 1;
		int lh = left.diameter;
		int rh = right.diameter;
		int sw = left.height + right.height + 2;
		ans.diameter = Math.max(lh, Math.max(rh, sw));
		return ans;

	}

	private class diapair {
		int height;
		int diameter;
	}

	public int diameter2() {
		diapair abc = diameter2(this.root);
		return abc.diameter;
	}

	private int diameter(Node node) {

		if (node == null) {
			return 0;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		int d = lh + rh + 2;

		int d1 = diameter(node.left);
		int d2 = diameter(node.right);
		if (d1 > d && d1 > d2) {
			d = d1;
		} else if (d2 > d && d2 > d1) {
			d = d2;
		}

		return d;

	}

	private class balancedpair {
		int height;
		boolean isbalanced;
	}

	public boolean isbalanced() {
		balancedpair ans = isbalanced(this.root);
		return ans.isbalanced;
	}

	private balancedpair isbalanced(Node node) {

		if (node == null) {
			balancedpair ans = new balancedpair();
			ans.height = -1;
			ans.isbalanced = true;
			return ans;
		}
		balancedpair left = isbalanced(node.left);
		balancedpair right = isbalanced(node.right);
		balancedpair res = new balancedpair();
		res.height = Math.max(left.height, right.height) + 1;
		int bf = Math.abs(left.height - right.height);
		if (bf <= 1 && left.isbalanced && right.isbalanced) {
			res.isbalanced = true;
		}
		return res;
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {

		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
	}

	public void inorder() {
		inorder(this.root);
	}

	private void inorder(Node node) {

		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);

	}

	private class orderpair {
		Node node;
		boolean selfwork;
		boolean leftwork;
		boolean rightwork;
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
				System.out.println(np.node.data + " ");
				np.selfwork = true;
			} else if (np.leftwork == false) {
				orderpair zp = new orderpair();
				zp.node = np.node.left;
				np.leftwork = true;
				stack.addFirst(zp);
			} else if (np.rightwork == false) {
				orderpair zp = new orderpair();
				zp.node = np.node.right;
				np.rightwork = true;
				stack.addFirst(zp);
			} else {
				stack.removeFirst();

			}

		}
		System.out.println(".");

	}

	public void postorderi() {

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

			if (np.leftwork == false) {
				orderpair zp = new orderpair();
				zp.node = np.node.left;
				np.leftwork = true;
				stack.addFirst(zp);
			} else if (np.rightwork == false) {
				orderpair zp = new orderpair();
				zp.node = np.node.right;
				np.rightwork = true;
				stack.addFirst(zp);
			} else if (np.selfwork == false) {
				System.out.println(np.node.data + " ");
				np.selfwork = true;
			} else {
				stack.removeFirst();

			}

		}
		System.out.println(".");

	}

	public void inorderi() {

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

			if (np.leftwork == false) {
				orderpair zp = new orderpair();
				zp.node = np.node.left;
				np.leftwork = true;
				stack.addFirst(zp);
			} else if (np.selfwork == false) {
				System.out.println(np.node.data + " ");
				np.selfwork = true;
			} else if (np.rightwork == false) {
				orderpair zp = new orderpair();
				zp.node = np.node.right;
				np.rightwork = true;
				stack.addFirst(zp);
			} else {
				stack.removeFirst();

			}

		}
		System.out.println(".");

	}

	private class BSTPair {

		Node largestNode;
		int size;
		int max;
		int min;
		boolean isBST;

	}

	public void LargestBST() {
		BSTPair pair = LargestBST(this.root);
		System.out.println(pair.largestNode.data);
		System.out.println(pair.size);
	}

	private BSTPair LargestBST(Node node) {

		if (node == null) {
			BSTPair br = new BSTPair();
			br.isBST = true;
			br.largestNode = null;
			br.max = Integer.MIN_VALUE;
			br.min = Integer.MAX_VALUE;
			br.size = 0;
			return br;
		}

		BSTPair left = LargestBST(node.left);
		BSTPair right = LargestBST(node.right);

		BSTPair mr = new BSTPair();

		mr.max = Math.max(node.data, Math.max(left.max, right.max));
		mr.min = Math.min(node.data, Math.min(left.min, right.min));

		if (left.isBST && right.isBST && node.data >= left.max && node.data < right.min) {

			mr.isBST = true;
			mr.largestNode = node;
			mr.size = left.size + right.size + 1;
		} else {

			mr.isBST = false;

			if (left.size >= right.size) {

				mr.largestNode = left.largestNode;
				mr.size = left.size;
			} else {
				mr.largestNode = right.largestNode;
				mr.size = right.size;
			}
		}

		return mr;
	}

}
