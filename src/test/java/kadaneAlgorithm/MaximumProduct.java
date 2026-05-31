package kadaneAlgorithm;

public class MaximumProduct {
	
	public static int maximumProduct(int[] arr) {
		int start = 0;
		int maxBestEnding = arr[start]; //5
		int minBestEnding = arr[start]; //5
		int res = arr[start];
		
		for(int i=1;i<arr.length;i++) {
			int v1 = arr[i]; //-5
			int v2 = maxBestEnding * v1; //-25
			int v3 = minBestEnding * v1; //-25
			
			maxBestEnding = Math.max(v1, Math.max(v2, v3)); //-5
			minBestEnding = Math.min(v1, Math.min(v2, v3)); //-25
			
			res = Math.max(res, Math.max(maxBestEnding, minBestEnding));
			
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,-5};
		int product = maximumProduct(arr);
		System.out.println(product);

	}

}
