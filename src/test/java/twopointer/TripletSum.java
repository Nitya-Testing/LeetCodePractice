package twopointer;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletSum {
	
	public static ArrayList<int[]> triplet(int[] arr){
		Arrays.sort(arr); //Sort the array So we can use two pointer
		int size= arr.length;
		ArrayList<int[]> resList = new ArrayList<>();
		
		for(int i=0;i<size-2;i++) {
			if(i>0 && arr[i] == arr[i-1]) {
				continue;
			}
			int left = i+1;
			int right = size-1;
			int sum = -1 * arr[i];
			
			while(left<right) {
				if(arr[left]+arr[right] == sum) {
					resList.add(new int[] {arr[i],arr[left],arr[right]});
					
					while(left<right && arr[left]==arr[left+1]){
						left++;
					}
					
					while(left<right && arr[right] == arr[right-1]) {
						right--;
					}
					left++;
					right--;
				}else if(arr[left]+arr[right] < sum) {
					left++;
				}else {
					right--;
				}
				
			}
		}
		return resList;
	}

	public static void main(String[] args) {
		
		int[] arr = {-1,1,0,2,-1,-1,4};
		
		ArrayList<int[]> resList = triplet(arr);
		
		for(int[] each:resList) {
			System.out.println(each[0] + " " + each[1] + " " + each[2]);
		}

	}

}
