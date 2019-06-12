package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hashmaps {

	public static void main(String[] args) {
		// String str = "aabbaaaccc";
		// maxfeq(str);
		// int [] arr= {5,5,7,2,7,5};
		// int [] arr1={6,7,9,5,5};
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		largestseq(arr);
		// intersection(arr, arr1);
		// intersectionnorep(arr, arr1);
	}

	public static void maxfeq(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> keyset = map.keySet();
		int maxfreq = Integer.MIN_VALUE;
		char maxchar = ' ';

		for (char key : keyset) {

			if (map.get(key) > maxfreq) {
				maxfreq = map.get(key);
				maxchar = key;
			}
		}
		System.out.println(maxchar);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int c : arr1) {
			if (map.containsKey(c)) {
				int val = map.get(c);
				map.put(c, val + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (int a : arr2) {
			if (map.containsKey(a)) {
				int val = map.get(a);
				map.put(a, val - 1);
				if (val > 0)
					ans.add(a);
			}
		}

		System.out.println(ans);
	}

	public static void intersectionnorep(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int c : arr1) {
			map.put(c, 1);
		}
		for (int a : arr2) {
			if (map.containsKey(a)) {
				ans.add(a);
				map.remove(a);
				// remove is used so that complexity remains O(n)
			}
		}

		System.out.println(ans);
	}

	public static void largestseq(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			if (map.containsKey(val - 1)) {
				map.put(val, false);
			} else {
				map.put(val, true);
			}
			if (map.containsKey(val + 1)) {
				map.put(val + 1, false);
			}
		}

		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		int maxlen = Integer.MIN_VALUE;
		int maxstart = 0;
		for (int val : list) {
			if (map.get(val)) {
				int pstart = val;
				int count = 0;
				while (map.containsKey(pstart + count)) {
					count++;
				}
				if (count > maxlen) {
					maxlen = count;
					maxstart = pstart;
				}
			}
		}

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < maxlen; i++) {
			ans.add(maxstart + i);
		}

		System.out.println(ans);

	}

}
