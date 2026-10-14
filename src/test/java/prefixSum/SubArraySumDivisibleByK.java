package prefixSum;

import java.util.HashMap;

public class SubArraySumDivisibleByK {
	
	public static int subArraySumDivisbleByK(int[] arr, int k) {
		int size = arr.length;
		int sum = 0;
		int res = 0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0, 1);
		
		for(int i=0;i<size;i++) {
			sum += arr[i];
			int ques = sum % k;
			if(ques<0) {
				ques = ques+k;
			}
			int count = hm.getOrDefault(ques, 0);
			res += count;
			hm.put(ques, hm.getOrDefault(ques, 0)+1);
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		

	}

}
