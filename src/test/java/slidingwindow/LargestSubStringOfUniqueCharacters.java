package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringOfUniqueCharacters {
	
	public static int largestSubStringOfUniqueCharacters(String str) {
		int size = str.length();
		int start = 0;
		int end = 0;
		int max = -1;
		Map<Character,Integer> map = new HashMap<>();
		
		if(size == 0) {
			return -1;
		}
		
		while(end<size) {
			map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0)+1);
			
			if(map.size()<end-start+1) {
				end++;
			}else if(map.size() == end-start+1) {
				max = Math.max(end-start+1, max);
				end++;
			}else if(map.size() > end-start+1) {
				while(map.size() > end-start+1) {
					int counter = map.get(str.charAt(start));
					counter--;
					map.put(str.charAt(start), counter);
					
					if(counter == 0) {
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
		
		String str = "abcdabde";
		int count = largestSubStringOfUniqueCharacters(str);
		System.out.println(count);

	}

}
