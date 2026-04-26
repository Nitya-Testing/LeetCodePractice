package twopointer;

public class MergeTwoSortedArrays {
	
	public static int[] mergeTwoSortedArrays(int[]arr1,int[]arr2) {
		int m = arr1.length;
		int n = arr2.length;
		
		int i= 0;
		int j = 0;
		int k = 0;
		
		int[] res = new int[m+n];
		
		while(i < m && j < n) {
			if(arr1[i] <= arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i < m) {
			res[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j < n) {
			res[k] = arr2[j];
			k++;
			j++;
		}
		return res;
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9};
		
		int[] res = mergeTwoSortedArrays(arr1, arr2);
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

}
