package twoPointerPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumWithDuplicates {
	
	public static ArrayList<int[]> twoSumWithDuplicates(int[] arr, int k){
		Arrays.sort(arr);
		int size = arr.length;
		int start = 0;
		int end = size-1;
		ArrayList<int[]> resList = new ArrayList<>();
		
		while(start<end) {
			if(arr[start] + arr[end] == k) {
				resList.add(new int[] {arr[start], arr[end]});
				start++;
				end--;
				
				while(start<end && arr[start-1] == arr[start]) {
					start++;
				}
				
				while(start<end && arr[end+1] == arr[end]) {
					end--;
				}
			}else if(arr[start]+arr[end]<k) {
				start++;
			}else {
				end--;
			}
		}
		return resList;
	}

	public static void main(String[] args) {
		

	}

}
