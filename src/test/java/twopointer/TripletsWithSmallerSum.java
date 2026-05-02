package twopointer;

import java.util.Arrays;

public class TripletsWithSmallerSum {
	
	public static int tripletsWithSmallerSum(int[] arr, int sum) {
		Arrays.sort(arr)	;
		int size = arr.length;
		int count = 0;
		
		for(int i=0;i<size-2;i++) {
			int left = i+1;
			int right = size-1;
			
			
			while(left<right) {
				if(arr[i]+arr[left]+arr[right] < sum) {
					count = count + (right-left);
					left++;
				}else {
					right--;
				}
			}
		}
		return count;
			
		}
		

	public static void main(String[] args) {
		int[] arr = {-2, 0, 1, 3};
		int sum = 2;
		int count = tripletsWithSmallerSum(arr, sum);
		System.out.println(count);

	}

}
