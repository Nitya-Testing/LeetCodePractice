package twoPointerPractice;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
 */

public class SortColors {
	
	public static int[] sortColors(int[] arr) {
		int size = arr.length;
		int left = 0;
		int mid = 0;
		int right = size-1;
		
		while(mid<=right) {
			if(arr[mid] == 0) {
				swap(arr,left,mid);
				left++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				swap(arr, mid,right);
				right--;
				
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int mid, int right) {
		int temp = arr[mid];
		arr[mid] = arr[right];
		arr[right] = temp;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2,1,0,0,1,1,2,0};
		int[] sorted = sortColors(arr);
		
		for(int each:sorted) {
			System.out.println(each);
		}

	}

}
