package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringPractice {

	public static int minimumWindowSubString(String s, String t) {
		int sSize = s.length();
		int tSize = t.length();
		int start = 0;
		int end = 0;
		int min = Integer.MAX_VALUE;
		Map<Character, Integer> map = new HashMap<>();

		if (sSize == 0 || tSize == 0) {
			throw new IllegalArgumentException("s or t string should have some length");
		}

		for (int i = 0; i < tSize; i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
		}

		int counter = map.size();

		while (end < sSize) {
			Character endCharacter = s.charAt(end);
			if (map.containsKey(endCharacter)) {
				int count = map.get(endCharacter);
				count--;
				map.put(endCharacter, count);

				if (count == 0) {
					counter--;
				}
			}

			while (counter == 0) {
				min = Math.min(min, end - start + 1);
				Character startCharacter = s.charAt(start);
				if (map.containsKey(startCharacter)) {
					int count = map.get(startCharacter);
					count++;
					map.put(startCharacter, count);

					if (count > 0) {
						counter++;
					}

				}
				start++;

			}
			end++;
		}

		return min == Integer.MAX_VALUE ? -1 : min;

	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";

		int count = minimumWindowSubString(s, t);
		System.out.println(count);
	}

}
