package kadaneAlgorithmPractice;

public class MaxSubArrayWithOneDeletion {
	
	public static int maxSubArrayWithOneDeletion(int[] arr) {
		int start = 0;
		int bestNoDelete = arr[start];
		int bestoneDelete = 0;
		int res = arr[start];
		
		for(int i=1;i<arr.length;i++) {
			int v1 = arr[i];
			bestoneDelete = Math.max(bestoneDelete+v1, bestNoDelete);
			bestNoDelete = Math.max(v1+bestNoDelete,v1);
			
			res = Math.max(res, Math.max(v1, Math.max(bestoneDelete, bestNoDelete)));
			
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		

	}

}
