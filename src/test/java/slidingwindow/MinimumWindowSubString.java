package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {
	
	/**
	 * 
	 * @param s
	 * @param t
	 * @return The minimum Window Substring Length
	 */
	public static int minimumWindowSubString(String s,String t) {
		int sSize = s.length();
		int tSize = t.length();
		Map<Character,Integer> map = new HashMap<>();
		int start = 0;
		int end = 0;
		int min = Integer.MAX_VALUE;
		
		if(sSize == 0 || tSize == 0) {
			return -1;
		}
		
		for(int i=0;i<tSize;i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
		}
		
		int count = map.size();
				
		
		while(end<sSize) {
			if(map.containsKey(s.charAt(end))) {
				int counter = map.get(s.charAt(end));
				counter--;
				map.put(s.charAt(end), counter);
				
				if(counter == 0) {
					count--;
				}
				
			}
			
			while(count == 0) {
				min = Math.min(min, end-start+1);
				
				char startChar = s.charAt(start);
				 if (map.containsKey(startChar)) {
		                map.put(startChar, map.get(startChar) + 1);
		                if (map.get(startChar) > 0) {
		                    count++;
		                }
		            }
				 
				 start++;
			}
			end++;
		}
		 return min == Integer.MAX_VALUE ? -1 : min;
		
		
	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
	    String t = "ABC";
	    
	  int count =  minimumWindowSubString(s, t);
	  System.out.println(count);

	}

}
