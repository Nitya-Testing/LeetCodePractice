package slidingWindowByPratush;

import java.util.HashMap;

public class LongestSubstringKUniqueCharacters {
	
	public static int longestSubstring(String s, int k) {
		int size = s.length();
		int start = 0;
		int end = 0;
		HashMap<Character,Integer> hm = new HashMap<>();
		int max = Integer.MIN_VALUE;
		
		while(end<size) {
			hm.put(s.charAt(end), hm.getOrDefault(s.charAt(end), 0)+1);
			
			if(hm.size()<k) {
				end++;
			}else if(hm.size() == k) {
				max = Math.max(end-start+1, max);
				end++;
			}else if(hm.size()>k) {
				while(hm.size()>k) {
					Character ch = s.charAt(start);
					int counter = hm.get(ch);
					
					if(counter == 1) {
						hm.remove(ch);
					}else {
						hm.put(ch, counter-1);
					}
					start++;
				}
				end++;
			}
		}
		return (max == Integer.MIN_VALUE)?0:max;
	}

	public static void main(String[] args) {
		

	}

}
