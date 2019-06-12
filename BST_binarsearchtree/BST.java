package BST_binarsearchtree;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public BST(int[] in) {
		this.root = construct(in, 0, in.length - 1);
	}

	private Node construct(int[] in, int ilo, int ihi) {
		if (ilo > ihi) {

			return null;
		}
		int mid = (ilo + ihi) / 2;
		Node nn = new Node();
		nn.data = in[mid];
		this.size++;

		nn.left = construct(in, ilo, mid - 1);
		nn.right = construct(in, mid + 1, ihi);

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

		if (node.right == null) {
			return node.data;
		} else {
			return max(node.right);
		}
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {

		if (item == node.data) {
			return true;
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return find(node.right, item);
		}

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

	public void printinrange(int low, int high) {
		printinrange(this.root, low, high);
	}

	private void printinrange(Node node, int low, int high) {

		if (node == null) {
			return;
		}
		if (node.data >= low && node.data <= high) {
			printinrange(node.left, low, high);
			System.out.println(node.data);
			printinrange(node.right, low, high);
		} else if (node.data < low) {
			printinrange(node.right, low, high);
		} else if (node.data > high) {
			printinrange(node.left, low, high);
		}
	}

	public void printdec() {
		printdec(this.root);
	}

	private void printdec(Node node) {
		if (node == null) {
			return;
		}
		printdec(node.right);
		System.out.println(node.data);
		printdec(node.left);
	}

	private class heapmover {
		int sum = 0;
	}

	public void replacewithlarger() {
		heapmover mover = new heapmover();
		replacewithlarger(this.root, mover);
	}

	private void replacewithlarger(Node node, heapmover mover) {
		if (node == null) {
			return;
		}
		replacewithlarger(node.right, mover);
		int val = node.data;
		node.data = mover.sum;
		mover.sum += val;
		replacewithlarger(node.left, mover);

	}

	public void add(int item) {
		add(this.root, null, false, item);
	}

	private void add(Node node, Node parent, boolean ilc, int item) {
		if (node == null) {
			Node node1 = new Node();
			node1.data = item;
			if (ilc) {
				parent.left = node1;
			} else {
				parent.right = node1;
			}
			return;
		}

		if (node.data < item)
			add(node.right, node, false, item);
		if (node.data > item)
			add(node.left, node, true, item);

	}

	public void remove(int item) {
		remove(this.root, null, false, item);
	}

	public Node max2(Node node) {

		if (node.right == null) {
			return node;
		} else {
			return max2(node.right);
		}
	}

	private void remove(Node node, Node parent, boolean ilc, int item) {
		if (node == null) {

			return;
		}

		if (node.data < item)
			remove(node.right, node, false, item);
		else if (node.data > item)
			remove(node.left, node, true, item);
		else{
			if (node.left == null && node.right == null) {
				if (ilc) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.right == null) {
				if (ilc) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else if (node.left == null) {
				if (ilc) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else {
				int max = max(node.left);
				node.data = max;
				remove(node.left, node, false, max);
			}
		}
	}

}
