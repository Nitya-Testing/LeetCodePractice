package twopointer;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumWithDuplicates {
	
	public static ArrayList<int[]> twoSum(int[] arr, int target){ //{1,1,1,2,2,2,3,3,3,4,4}  Target = 5
		
		Arrays.sort(arr);
		int size = arr.length;
		int start = 0;
		int end = size-1;
		ArrayList<int[]> twoSumList = new ArrayList<>();
		
		while(start<end) {
			if(arr[start]+arr[end] == target) {
				twoSumList.add(new int[] {arr[start],arr[end]});
				while(start<end && arr[start+1]==arr[start]) {
					start++;
				}
				
				while( start< end  && arr[end-1] == arr[end]) {
					end--;
				}
				start++;
				end--;
			}else if(arr[start]+arr[end] < target) {
				start++;
			}else {
				end--;
			}
		}
		if(twoSumList.size() == 0) {
			System.out.println("No two sum matched..");
		}
		return twoSumList;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,1,1,2,2,2,3,3,3,4,4};
		int target = 5;
		
		ArrayList<int[]> list = twoSum(arr, target);
		for (int[] pair : list) {
		    System.out.println(pair[0] + ", " + pair[1]);
		}
		
		

	}

}
