package Assignment_2_2;

import java.util.HashMap;

public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		if (anagrams(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams.");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams.");
		}
	}

	public static boolean anagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		HashMap<Character, Integer> Map = new HashMap<>();
		for (char c : s1.toCharArray()) {
			if (Map.containsKey(c)) {
				Map.put(c, Map.get(c) + 1);
			} else {
				Map.put(c, 1);
			}
		}
		for (char c : s2.toCharArray()) {
			if (!Map.containsKey(c)) {
				return false;
			}
			Map.put(c, Map.get(c) - 1);
			if (Map.get(c) == 0) {
				Map.remove(c);
			}
		}
		return Map.isEmpty();
	}
}