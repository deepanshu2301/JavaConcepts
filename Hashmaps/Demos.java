package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demos {

	
	
	
//	Specialty of this map is that it will perform all the tasks in the order of 1. [O(1)]
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		// put(if the key is already present it will update the key)
		map.put("India", 12);
		map.put("China", 123);
		map.put("SriLanka", 112);
		map.put("Nepal", 712);
//		duplicacy is not possible as it will update the values.
		
		
		// print hashmap
		System.out.println(map);

		// update in hm
		map.put("India", 20);
		System.out.println(map);

		// get(if it is present then it will give value stored for the function and for the else case it will give null)
		System.out.println(map.get("India"));
		System.out.println(map.get("Pak"));
		

		// containsKey(returns true/false)
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsKey("Pak"));

		// remove
		System.out.println(map.remove("India"));
		System.out.println(map.remove("I"));
		System.out.println(map);

		// keyset in arraylist
		ArrayList<String> list = new ArrayList<>(map.keySet());
		System.out.println(list);
		System.out.println("------------------");
		
		
		// keyset using set
		Set<String> keyset = map.keySet();
		System.out.println(keyset);

		// get value using key
		for (String val : list) {
			System.out.println(val + "->" + map.get(val));
		}

		
//		the display function don't follow the order in which they are entered as they rearrange themselves so that they perform
//		all the task in order of n. [ O(1)].` 
//		only display is O(n) rest all the functions are of the order of 1.
		
		
		char ch = maxFrequencyCharacter("aaabbbbbbdddd");
		System.out.println(ch);
	}

	private static char maxFrequencyCharacter(String str) {

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

		return maxchar;

	}

}
