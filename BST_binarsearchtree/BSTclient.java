package BST_binarsearchtree;

public class BSTclient {

	public static void main(String[] args) {
		int[] in = { 10, 20, 30, 40, 50, 60, 70, };
		BST bst = new BST(in);
		bst.display();
		// bst.size();
		// bst.isEmpty();
		// bst.max();
		// bst.height();
		// bst.find(40);
		System.out.println("----------");
//		bst.printinrange(20,30);
//		bst.printdec();
//		bst.replacewithlarger();
//		bst.add(55);
		
//		bst.display();
//		System.out.println("=====");
		bst.remove(60);
		bst.display();

	}

}
