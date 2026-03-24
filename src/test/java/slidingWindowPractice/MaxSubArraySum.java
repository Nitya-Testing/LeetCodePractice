package slidingWindowPractice;

public class MaxSubArraySum {
	
	public static int maximumSubArraySum(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		
		while(end<size) {
			count = count+arr[end];
			
			if(end-start+1 < k) {
				end++;
			}else if(end-start+1 == k) {
				max = Math.max(count, max);
				count = count-arr[start];
				start++;
				end++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7}; //6,9,12,15,18 O(n) , O(1)
		int k = 3;
		int max = maximumSubArraySum(arr, k);
		System.out.println(max);

	}

}
