package practice;

public class MaxiumSumSubarrayOfK {
	
	public static int maximumSum(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		if(size == 0 || k == 0) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		
		while(end<size) {
			sum = sum + arr[end];
			int winSize = end-start+1;
			
			if(winSize<k) {
				end++;
			}else if(winSize == k) {
				max = Math.max(max, sum);
				sum = sum-arr[start];
				start++;
				end++;
			}
		}
		return max;
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,3,5};
		int k = 3;
		
		int max = maximumSum(arr, k);
		System.out.println(max);

	}

}
