package kadaneAlgorithm;

public class MaximumProduct {
	
	public static int maximumProduct(int[] arr) {
		int start = 0;
		int maxBestEnding = arr[start];
		int minBestEnding = arr[start];
		int res = arr[start];
		
		for(int i=1;i<arr.length;i++) {
			int v1 = arr[i];
			int v2 = maxBestEnding * v1;
			int v3 = minBestEnding * v1;
			
			maxBestEnding = Math.max(v1, Math.max(v2, v3));
			minBestEnding = Math.min(v1, Math.min(v2, v3));
			
			res = Math.max(res, Math.max(maxBestEnding, minBestEnding));
			
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
