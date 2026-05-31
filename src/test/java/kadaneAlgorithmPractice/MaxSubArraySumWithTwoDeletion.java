package kadaneAlgorithmPractice;

public class MaxSubArraySumWithTwoDeletion {
	
  public static int maxSubArraySumWithTwoDeletion(int[] arr) {
	  int start = 0;
	  int bestNoDelete = arr[start];
	  int bestOneDelete = 0;
	  int bestTwoDelete = 0;
	  int res = arr[start];
	  
	  for(int i=1;i<arr.length;i++) {
		  int v1 = arr[i];
		  bestTwoDelete = Math.max(bestTwoDelete+v1, bestOneDelete);
		  bestOneDelete = Math.max(bestOneDelete+v1, bestNoDelete);
		  bestNoDelete = Math.max(bestNoDelete+v1, v1);
		  
		  res = Math.max(res, Math.max(bestTwoDelete, Math.max(bestOneDelete, bestNoDelete)));
	  }
	  
	  return res;
	  
  }

	public static void main(String[] args) {
		

	}

}
