package twopointer;

import java.util.Arrays;

public class TwoSum {
	
	public static int[] twoSum(int[] arr, int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			if(arr[start]+arr[end] == target) {
				return new int[] {arr[start],arr[end]};
			}else if(arr[start]+arr[end] < target) {
				start++;
			}else {
				end--;
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		
		int[] arr = {2,3,1,-1,0,7};
		int target = 5;
		
		int[] res = twoSum(arr, target);
		System.out.println("Two numbers which sum is "+ target+ " is " + res[0] +" , "+ res[1]);
		
		//O(nlogn) Time complexity
		//O(1) Space Complexity

	}

}
