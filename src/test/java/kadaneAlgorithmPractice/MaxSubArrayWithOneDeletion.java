package kadaneAlgorithmPractice;

public class MaxSubArrayWithOneDeletion {
	
	public static int maxSubArrayWithOneDeletion(int[] arr) {
		int start = 0;
		int bestNoDelete = arr[start];
		int bestoneDelete = 0;
		int res = arr[start];
		
		for(int i=1;i<arr.length;i++) {
			int v1 = arr[i];
			int prevNoDelete = bestNoDelete;
			int prevOneDelete = bestoneDelete;
			bestNoDelete = Math.max(v1+prevNoDelete,v1);
			bestoneDelete = Math.max(prevOneDelete+v1, prevNoDelete);
			
			
			res = Math.max(res, Math.max(v1, Math.max(bestoneDelete, bestNoDelete)));
			
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,-2,0,3};
		int sum = maxSubArrayWithOneDeletion(arr);
		System.out.println(sum);

	}

}
