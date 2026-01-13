package recursion;

public class SortArrayUsingRecursionPractice {
	
	public static void sort(int[] arr, int k) {
		if(k == 1) {
			return;
		}
		
		sort(arr, k-1);
		insert(arr,k-1);
		
	}
	
	public static void insert(int[] arr, int index) {
		if(index == 0 || arr[index]>=arr[index-1]) {
			return;
		}
		
		int temp = arr[index];
		arr[index] = arr[index-1];
		arr[index-1] = temp;
		
		insert(arr,index-1);
	}

	public static void main(String[] args) {
		
		int[] arr = {4,1,2,3};
		sort(arr, arr.length);
		
		for(Integer each: arr) {
			System.out.print(each);
			System.out.println();
		}

	}

}
