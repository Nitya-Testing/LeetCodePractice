package slidingWindownPractice;

import java.util.HashMap;

public class LongestSubstringWithKUniqueChars {
	
	public static String longestSubstringWithKUniqueChars(String s, int k) {
		int size = s.length();
		int start = 0;
		int end = 0;
		HashMap<Character,Integer> hm = new HashMap<>();
		int maxWin = Integer.MIN_VALUE;
		int startWin = 0;
		
		while(end<size) {
			Character endChar = s.charAt(end);
			hm.put(endChar, hm.getOrDefault(endChar,0)+1);
			
			if(hm.size()<k) {
				end++;
			}else if(hm.size() == k) {
				if(maxWin<end-start+1) {
					maxWin = end-start+1;
					startWin = start;
				}
				end++;
			}else {
				while(hm.size() > k) {
					Character startChar = s.charAt(start);
					int count = hm.get(startChar);
					count--;
					
					hm.put(startChar, count);
					
					if(count == 0) {
						hm.remove(startChar);
					}
					start++;
				}
				end++;
			}
		}
		return (maxWin == Integer.MIN_VALUE)?"":s.substring(startWin, startWin+maxWin);
	}

	public static void main(String[] args) {
		String s = "aabacbebebe";
		int k = 3;
		String maxSubString = longestSubstringWithKUniqueChars(s, k);
		System.out.println(maxSubString);

	}

}
