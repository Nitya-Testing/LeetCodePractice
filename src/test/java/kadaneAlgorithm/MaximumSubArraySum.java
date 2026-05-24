package kadaneAlgorithm;

/**
 * Leetcode 53
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */

public class MaximumSubArraySum {
	
	public static int maximumSubArraySum(int[] arr) {
		int start = 0;
		int bestEnding = arr[start];
		int res = arr[start];
		
		for(int i=1;i<arr.length;i++){
			int v1 = arr[i];
			int v2 = arr[i]+bestEnding;
			bestEnding = Math.max(v1,v2);
			res = Math.max(res, bestEnding);
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
