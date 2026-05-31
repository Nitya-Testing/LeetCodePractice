package twoPointerPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumToZero {
	
	public static ArrayList<int[]> threeSum(int[] arr){
		Arrays.sort(arr);
		int size = arr.length;
		ArrayList<int[]> resList = new ArrayList<>();
		
		for(int i=0;i<size-2;i++) {
			if(i>0 && arr[i-1] == arr[i]) {
				continue;
			}
			int start = i+1;
			int end = size-1;
			
			while(start<end) {
				int sum = arr[start]+arr[end]+arr[i];
				if(sum == 0) {
					resList.add(new int[] {arr[i],arr[start],arr[end]});
					start++;
					end--;
					
					while(start<end && arr[start-1] == arr[start]) {
						start++;
					}
					
					while(start<end && arr[end+1] == arr[end]) {
						end--;
					}
				}else if(sum < 0) {
					start++;
				}else {
					end--;
				}
			}
		}
		return resList;
	}

	public static void main(String[] args) {
		

	}

}
