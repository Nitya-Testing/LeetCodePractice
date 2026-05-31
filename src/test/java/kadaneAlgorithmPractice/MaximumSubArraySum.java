package kadaneAlgorithmPractice;

public class MaximumSubArraySum {
	
	public static int maxSubArraySum(int[] arr) {
		int start = 0;
		int bestEnding = arr[start];
		int res = arr[start];
		
		for(int i=1;i<arr.length;i++) {
			int v1 = arr[i];
			int v2 = bestEnding+arr[i];
			bestEnding = Math.max(v1, v2);
			res = Math.max(res, bestEnding);
		}
		
		return res;
	}

	public static void main(String[] args) {
		

	}

}
