package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class PickToys {

	public static int pickToys(String str) {
		int size = str.length();
		int start = 0;
		int end = 0;
		int max = -1;
		Map<Character, Integer> map = new HashMap<>();

		if (size == 0) {
			return -1;
		}

		while (end < size) {
			map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);

			if (map.size() < 2) {
				end++;
			} else if (map.size() == 2) {
				max = Math.max(end - start + 1, max);
				end++;
			} else if (map.size() > 2) {
				while (map.size() > 2) {
					int counter = map.get(str.charAt(start));
					counter--;
					map.put(str.charAt(start), counter);

					if (counter == 0) {
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

		String str = "abaaaccdee";
		int count = pickToys(str);
		System.out.println(count);

	}

}
