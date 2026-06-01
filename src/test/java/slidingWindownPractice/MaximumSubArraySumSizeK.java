package slidingWindownPractice;

public class MaximumSubArraySumSizeK {
	
	public static int maximumSubArraySumSizeK(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		while(end<size) {
			sum = sum+arr[end];
			
			if(end-start+1 < k) {
				end++;
			}else if(end-start+1 == k) {
				max = Math.max(max, sum);
				sum = sum-arr[start];
				start++;
				end++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {100,200,300,400};
		int k = 2;
		int sum = maximumSubArraySumSizeK(arr, k);
		System.out.println(sum);
		

	}

}
