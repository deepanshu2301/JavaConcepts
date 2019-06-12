package Trie_and_Huffman;

public class TPClient {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.addword("been");
		trie.addword("bea");
		trie.addword("be");
		trie.addword("sea");
		trie.addword("sean");
		trie.addword("see");
		trie.display();
		// System.out.println("========");
		// trie.Display();
		// System.out.println(trie.search("bee"));
		// System.out.println(trie.search("been"));
		// System.out.println(trie.search("be"));
		// System.out.println("=");
		// trie.remove("sea");
		// trie.display();
		// System.out.println("==");
		// trie.remove("se");
		// trie.display();
		// System.out.println("===");
		// trie.remove("sea");
		// trie.display();
		// System.out.println(trie.search("s"));

	}

}
