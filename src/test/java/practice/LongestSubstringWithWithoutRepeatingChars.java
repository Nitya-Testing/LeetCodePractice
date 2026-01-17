package practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithWithoutRepeatingChars {

	public static int longestSubstringWithoutRepetativeChars(String str) {
		int size = str.length();
		int start = 0;
		int end = 0;
		Map<Character, Integer> map = new HashMap<>();
		int max = -1;

		if (size == 0) {
			throw new IllegalArgumentException("String must have some length.");
		}

		while (end < size) {
			Character endChar = str.charAt(end);
			map.put(endChar, map.getOrDefault(endChar, 0) + 1);

			int winSize = end - start + 1;
			if (map.size() == winSize) {
				max = Math.max(max, winSize);
				end++;
			} else if (map.size() < winSize) {
				while (map.size() < winSize) {
					Character startChar = str.charAt(start);
					int count = map.get(startChar);
					count--;
					map.put(startChar, count);

					if (count == 0) {
						map.remove(startChar);
					}
					start++;

				}
				end++;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		
	}

}
