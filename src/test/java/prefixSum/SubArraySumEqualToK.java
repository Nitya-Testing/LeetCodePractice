package prefixSum;

import java.util.HashMap;

public class SubArraySumEqualToK {
	
	public static int subArraySumEqualToK(int[] arr, int k) {
		int size = arr.length;
		int sum = 0;
		int res = 0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0, 1);
		
		
		for(int i=0;i<size;i++) {
			sum += arr[i];
			int ques = sum-k;
			int count = hm.getOrDefault(ques, 0);
			res += count;
			hm.put(sum, hm.getOrDefault(sum, 0)+1);
			
		}
		return res;
		
	
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int k = 3;
		int res = subArraySumEqualToK(arr, k);
		System.out.println(res);

	}

}
