package prefixSubfixSum;

import java.util.HashMap;

public class SubarraySumEqualTok {
	
	public static int subarraySumEqualToK(int[] arr, int k) {
		int size = arr.length;
		int sum = 0;
		int res = 0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0, 1);
		
		for(int i=0;i<size;i++) {
			sum += arr[i]; //count the sum in each index
			int ques = sum-k; //calculate sum-k for each index
			int count = hm.getOrDefault(ques, 0); //check is sum-k i have seen previously?, then get its count
			res += count; // include count to result
			hm.put(sum, hm.getOrDefault(sum, 0)+1); //store the frequency of sum in hashmap
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,1,1};
		int k = 2;
		
		int num = subarraySumEqualToK(arr, k);
		System.out.println(num);
		

	}

}
