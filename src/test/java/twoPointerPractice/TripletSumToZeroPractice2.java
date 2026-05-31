package twoPointerPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZeroPractice2 {
	
	public static List<List<Integer>> tripletSum(int[] arr){
		Arrays.sort(arr);
		int size = arr.length;
		List<List<Integer>> resList = new ArrayList<>();
		
		for(int i=0;i<size-2;i++) {
			if(i>0 && arr[i-1]==arr[i]) {
				continue;
			}
			int start = i+1;
			int end = size-1;
			
			while(start<end) {
				int sum = arr[i]+arr[start]+arr[end];
				
				if(sum == 0) {
					List<Integer> tempList = new ArrayList<>();
					tempList.add(arr[i]);
					tempList.add(arr[start]);
					tempList.add(arr[end]);
					
					resList.add(tempList);
					
					start++;
					end--;
					
					while(start<end && arr[start-1] == arr[start]) {
						start++;
					}
					
					while(start<end && arr[end+1] == arr[end]) {
						end--;
					}
				}else if(sum<0) {
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
