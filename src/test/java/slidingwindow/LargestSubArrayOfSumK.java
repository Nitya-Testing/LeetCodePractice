package slidingwindow;

public class LargestSubArrayOfSumK {

	public static int largestSubArrayOfSumK(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;

		while (end < size) {
			sum = sum + arr[end];
			if (sum < k) {
				end++;
			} else if (sum == k) {
				max = Math.max(end - start + 1, max);
				end++;
			} else if (sum > k) {
				while (sum > k) {
					sum = sum - arr[start];
					start++;
				}
				end++;
			}
		}
		return max;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 1, 1, 1, 1, 1, 4, 5, 1 };
		int k = 6;

		int max = largestSubArrayOfSumK(arr, k);
		System.out.println(max);

	}

}
