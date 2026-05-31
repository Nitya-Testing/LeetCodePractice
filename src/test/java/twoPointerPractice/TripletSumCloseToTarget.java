package twoPointerPractice;

import java.util.Arrays;

public class TripletSumCloseToTarget {
	
	public static int tripletSumCloseToTarget(int[] arr, int target) {
		Arrays.sort(arr);
		int size = arr.length;
		int final_diff = Integer.MAX_VALUE;
		int resSum = 0;
		
		for(int i=0;i<size-2;i++) {
			if(i>0 &&arr[i-1] == arr[i]) {
				continue;
			}
			int start = i+1;
			int end = size-1;
			
			while(start<end) {
				int sum = arr[i]+arr[start]+arr[end];
				int current_diff = Math.abs(sum-target);
				
				if(final_diff>current_diff || (final_diff == current_diff && sum<resSum)) {
					final_diff = current_diff;
					resSum = sum;
				}
				
				if(sum == target) {
					return sum;
				}else if(sum < target) {
					start++;
				}else {
					end--;
				}
				
			}
		}
		return resSum;
	}

	public static void main(String[] args) {
		

	}

}
