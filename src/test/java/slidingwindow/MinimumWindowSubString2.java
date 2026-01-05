package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString2 {

	public static String minimumWindowSubString(String s, String t) {
		int sSize = s.length();
		int tSize = t.length();
		int start = 0;
		int end = 0;
		int minLen = Integer.MAX_VALUE;
		int minStart = 0;
		Map<Character, Integer> map = new HashMap<>();

		if (sSize == 0 || tSize == 0) {
			throw new IllegalArgumentException("s or t string must be having valid length");
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
				if (minLen > end - start + 1) {
					minLen = end - start + 1;
					minStart = start;
				}

				Character ch = s.charAt(start);

				if (map.containsKey(ch)) {
					int startCount = map.get(ch);
					startCount++;
					map.put(ch, startCount);

					if (map.get(ch) > 0) {
						counter++;
					}
					
				}
				start++;
				
			}
			end++;
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

	}

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";

		String subString = minimumWindowSubString(s, t);
		System.out.println(subString);
	}

}
