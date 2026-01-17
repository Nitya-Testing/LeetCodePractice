package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatinChars {

	public static String longestSubString(String str) {
		
		if (str == null || str.length() == 0) {
			throw new IllegalArgumentException("String should not be null or having some length");
		}
		
		
		int size = str.length();
		int start = 0;
		int end = 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<>();
		int maxWin = Integer.MIN_VALUE;
		int startWin = 0;


		while (end < size) {
			map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);

			if (map.size() == end - start + 1) {
				if(maxWin < end - start + 1) {
					maxWin = end - start + 1;
					startWin = start;
				}
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
		return str.substring(startWin, startWin+maxWin);

	}

	public static void main(String[] args) {
		String str = "abcddeeffg";
		String max = longestSubString(str);
		System.out.println(max);
	}

}
