package kadaneAlgorithmPractice;

public class MinimumSubArraySum {
	
	public static int minSubArraySum(int[] arr) {
		int start = 0; //[3,4,1,5,7];
		int bestEnding = arr[start];
		int res = arr[start];
		
		for(int i=1;i<arr.length;i++) {
			int v1 = arr[i];
			int v2 = bestEnding+arr[i];
			bestEnding = Math.min(v1, v2);
			res = Math.min(res, bestEnding);
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		

	}

}
