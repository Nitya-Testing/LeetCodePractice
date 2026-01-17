package practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueChars {

	public static int longestSubstringWithKUniqueChars(String str, int k) {

		int size = str.length();
		int start = 0;
		int end = 0;
		Map<Character, Integer> map = new HashMap<>();
		int max = -1;

		if (size == 0 || k == 0) {
			throw new IllegalArgumentException("Invalid Arguments!!");
		}

		while (end < size) {
			map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);

			if (map.size() < k) {
				end++;
			} else if (map.size() == k) {
				max = Math.max(max, end - start + 1);
				end++;
			} else if (map.size() > k) {

				while (map.size() > k) {

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
		String s1 = "aabacbebebe";
		int k1 = 3;
		System.out.println("Test 1 (Expected 7): " + longestSubstringWithKUniqueChars(s1, k1));

		// Test Case 2: K is larger than unique chars in string
		String s2 = "abc";
		int k2 = 5;
		System.out.println("Test 2 (Expected -1): " + longestSubstringWithKUniqueChars(s2, k2));

		// Test Case 3: Whole string is the answer
		String s3 = "aabbcc";
		int k3 = 3;
		System.out.println("Test 3 (Expected 6): " + longestSubstringWithKUniqueChars(s3, k3));
	}

}
