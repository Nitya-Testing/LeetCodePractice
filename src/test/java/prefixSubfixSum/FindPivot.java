package prefixSubfixSum;

public class FindPivot {
	
	public static int findPivot(int[] arr) {
		int size = arr.length;
		int[] prefixSum = new int[size];
		int[] suffixSum = new int[size];
		
		for(int i=1;i<size;i++) {
			prefixSum[i] = prefixSum[i-1]+arr[i-1];
		}
		
		for(int i=size-2;i>=0;i--) {
			suffixSum[i] = suffixSum[i+1]+arr[i+1];
		}
		
		for(int i=0;i<size;i++) {
			if(prefixSum[i] == suffixSum[i]) {
				return i;
			}
		}
		return -1;
		
		
		
	
	}

	public static void main(String[] args) {
		
		int [] arr = {1,7,3,6,5,6};
		int pivot = findPivot(arr);
		System.out.println(pivot);
		

	}

}
