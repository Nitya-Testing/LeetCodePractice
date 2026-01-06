package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringPractice {

	public static int minimumWindowSubstring(String s, String t) {
		int sSize = s.length();
		int tSize = t.length();
		Map<Character, Integer> map = new HashMap<>();
		int start = 0;
		int end = 0;
		int min = Integer.MAX_VALUE;

		if (sSize == 0 || tSize == 0) {
			throw new IllegalArgumentException("No proper String is given to us!!");
		}

		for (int i = 0; i < tSize; i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
		}

		int counter = map.size();

		while (end < sSize) {
			if (map.containsKey(s.charAt(end))) {
				int count = map.get(s.charAt(end));
				count--;
				map.put(s.charAt(end), count);

				if (count == 0) {
					counter--;
				}
			}

			while (counter == 0) {
				min = Math.min(min, end - start + 1);

				Character startChar = s.charAt(start);

				if (map.containsKey(startChar)) {
					int startCharCount = map.get(startChar);
					startCharCount++;
					map.put(startChar, startCharCount);

					if (startCharCount > 0) {
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

	}

}
