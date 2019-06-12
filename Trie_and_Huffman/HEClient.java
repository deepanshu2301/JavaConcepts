package Trie_and_Huffman;

public class HEClient {

	public static void main(String[] args) {
		Huffman hc  = new Huffman("aaaaaabbbbbcccde");
		System.out.println(hc.encode("bce"));
		System.out.println(hc.decode("101111101"));

	}

}
