package slidingWindowPractice;

import java.util.HashMap;

/**
 * You are given a string s and an integer k. 
 * You can choose any character of the string and change it to any other uppercase English character. 
 * You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get 
after performing the above operations.
 */

public class LongestRepeatingCharacterReplacement {
	
	public static int longestRepeatingCharsReplacement(String s, int k) {
		int size = s.length();
		int start = 0;
		int end = 0;
		int maxFreq = 0;
		int max = Integer.MIN_VALUE;
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		while(end<size) {
			Character endChar = s.charAt(end);
			hm.put(endChar, hm.getOrDefault(endChar, 0)+1);
			maxFreq = Math.max(maxFreq, hm.get(endChar));
			int winSize = end-start+1;
			int diff = winSize-maxFreq;
			
			if(diff<=k) {
				//valid
				max = Math.max(max, winSize);
				end++;
			}else {
				while(diff > k) {
					//we have to shrink the window from starting
					Character startChar = s.charAt(start);
					int count = hm.get(startChar);
					count--;
					hm.put(startChar, count);
					
					if(count == 0) {
						hm.remove(startChar);
					}
					start++;
					winSize = end-start+1;
					diff = winSize-maxFreq;
					
				}
				end++;
			}
		}
		return (max == Integer.MIN_VALUE)?0:max;
	}

	public static void main(String[] args) {
		

	}

}
