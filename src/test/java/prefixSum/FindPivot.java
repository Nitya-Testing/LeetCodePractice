package prefixSum;

public class FindPivot {
	
	public static int findPivot(int[] arr) {
		int size = arr.length;
		int left = 0;
		int sum = 0;
		
		for(int i=0;i<size;i++) {
			sum+= arr[i];
		}
		
		if(sum - arr[0] == 0) {
			return 0;
		}
		
		for(int i=1;i<size;i++) {
			left += arr[i-1];
			int right = sum-arr[i]-left;
			if(left == right) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,7,3,6,5,6};
		int pivot = findPivot(arr);
		System.out.println(pivot);

	}

}
