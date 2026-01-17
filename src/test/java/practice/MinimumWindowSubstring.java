package practice;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
	
	public static String minimumWindowSubstring(String s,String t) {
		
		int sSize = s.length();
		int tSize = t.length();
		int start = 0;
		int end = 0;
		Map<Character,Integer> map = new HashMap<>();
		int minWin = Integer.MAX_VALUE;
		int startWin = 0;
		
		if(sSize == 0 || tSize == 0) {
			throw new IllegalArgumentException("s or t string must have some length");
		}
		
		for(int i=0;i<tSize;i++) {
			Character tChars = t.charAt(i);
			map.put(tChars, map.getOrDefault(tChars,0)+1);
		}
		
		int counter = map.size();
		
		while(end<sSize) {
			Character endChar = s.charAt(end);
			if(map.containsKey(endChar)) {
				int count = map.get(endChar);
				count--;
				map.put(endChar, count);
				
				if(count == 0) {
					counter--;
				}
			}
			
			while(counter == 0) {
				if(minWin>end-start+1) {
					minWin = end-start+1;
					startWin = start;
				}
				
				Character startChar = s.charAt(start);
				if(map.containsKey(startChar)) {
					int count = map.get(startChar);
					count++;
					map.put(startChar, count);
					
					if(count>0) {
						counter++;
					}
					
				}
				start++;
			}
			end++;
			
			
		}
		return minWin == Integer.MAX_VALUE?"":s.substring(startWin,startWin+minWin);
		
	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		String minWin = minimumWindowSubstring(s, t);
		System.out.println(minWin);


	}

}
