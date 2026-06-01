package slidingWindownPractice;
/**
 * Given an array of positive integers nums and a positive integer target,
 *  return the minimal length of a subarray whose sum is greater than or equal to target. 
 * If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubArraySum {
	
	public static int minimumSizeSubArraySum(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		while(end<size) {
			sum = sum + arr[end];
			
			if(sum < k) {
				end++;
			}else {
				while(sum>=k) {
					min = Math.min(min, end-start+1);
					sum = sum-arr[start];
					start++;
				}
				end++;
				
				
			}
		}
		return (min == Integer.MAX_VALUE)?0:min;
	}

	public static void main(String[] args) {
		int[] arr = {2,3,1,2,4,3};
		int k = 7;
		int min = minimumSizeSubArraySum(arr, k);
		System.out.println(min);

	}

}
