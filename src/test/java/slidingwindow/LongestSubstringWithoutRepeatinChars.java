package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatinChars {

	public static int longestSubString(String str) {
		
		if (str == null || str.length() == 0) {
			throw new IllegalArgumentException("String should not be null or having some length");
		}
		
		
		int size = str.length();
		int start = 0;
		int end = 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<>();


		while (end < size) {
			map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);

			if (map.size() == end - start + 1) {
				max = Math.max(end - start + 1, max);
				end++;
			} else if (map.size() < end - start + 1) {
				while (map.size() < end - start + 1) {
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
