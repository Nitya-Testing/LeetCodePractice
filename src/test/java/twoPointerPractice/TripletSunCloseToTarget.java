package twoPointerPractice;

import java.util.Arrays;

public class TripletSunCloseToTarget {
	
	public static int tripletSumCloseToTarget(int[] arr, int target) {
		Arrays.sort(arr);
		int size = arr.length;
		int final_diff = Integer.MAX_VALUE;
		int resSum = 0;
		
		for(int i = 0; i < size-2; i++) {
			int start = i+1;
			int end = size-1;
			
			while(start<end) {
				int sum = arr[i]+arr[start]+arr[end];
				int curr_diff = Math.abs(sum-target);
				
				if(final_diff>curr_diff) {
					final_diff = curr_diff;
					resSum = sum;
				}
				
				if(sum == target) {
					return sum;
				}else if(sum<target) {
					start++;
				}else {
					end--;
				}
			}
			
		}
		return resSum;
	}

	public static void main(String[] args) {
		
		int[] arr = {-1,2,1,-4};
		int target = 1;
		
		
		int min = tripletSumCloseToTarget(arr, target);
		System.out.println(min);
		

	}

}
