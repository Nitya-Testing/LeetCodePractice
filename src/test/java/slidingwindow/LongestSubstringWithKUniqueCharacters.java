package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacters {

	public static int longestSubstringWithKUniqueCharacters(String str, int k) {

		if (str == null || str.length() == 0 || k == 0) {
			return -1;
		}

		int size = str.length();
		int start = 0;
		int end = 0;
		Map<Character, Integer> map = new HashMap<>();
		int max = -1;

		while (end < size) {
			map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);

			if (map.size() < k) {
				end++;
			} else if (map.size() == k) {
				max = Math.max(end - start + 1, max);
				end++;
			} else if (map.size() > k) {
				while (map.size() > k) {
					int startCount = map.get(str.charAt(start));
					startCount--;

					map.put(str.charAt(start), startCount);

					if (startCount == 0) {
						map.remove(str.charAt(start));
					}

					start++;

				}

				end++;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		String s1 = "aabacbebebe";
		int k1 = 3;
		System.out.println("Test 1 (Expected 7): " + longestSubstringWithKUniqueCharacters(s1, k1));

		// Test Case 2: K is larger than unique chars in string
		String s2 = "abc";
		int k2 = 5;
		System.out.println("Test 2 (Expected -1): " + longestSubstringWithKUniqueCharacters(s2, k2));

		// Test Case 3: Whole string is the answer
		String s3 = "aabbcc";
		int k3 = 3;
		System.out.println("Test 3 (Expected 6): " + longestSubstringWithKUniqueCharacters(s3, k3));
	}

}
