package twopointer;

public class DutchNationalFlagOptimalSolution {
	
	public static int[] dutchNationalFlag(int[] arr) {
		
		int left = 0;
		int mid = 0;
		int right = arr.length-1;
		
		while(mid<=right) {
			if(arr[mid] == 0) {
				swap(arr,left,mid);
				left++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				swap(arr,mid,right);
				right--;
			}
		}
		return arr;
		
	}

	private static void swap(int[] arr, int left, int mid) {
		
		int temp = arr[left];
		arr[left] = arr[mid];
		arr[mid] = temp;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,1,1,0,0,2,2};
		int[] resSrr = dutchNationalFlag(arr);
		for(int each: resSrr) {
			System.out.println(each);
		}

	}

}
