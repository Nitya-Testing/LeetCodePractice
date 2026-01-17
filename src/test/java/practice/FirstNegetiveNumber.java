package practice;

import java.util.ArrayList;

public class FirstNegetiveNumber {
	
	public static ArrayList<Integer> firstNegetive(int[] arr, int k){
		int size = arr.length;
		int start = 0;
		int end = 0;
		ArrayList<Integer> helperList = new ArrayList<>();
		ArrayList<Integer> ansList = new ArrayList<>();
		
		if(size == 0 || k == 0) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		
		while(end<size) {
			if(arr[end]<0) {
				helperList.add(arr[end]);
			}
			
			int winSize = end-start+1;
			
			if(winSize<k) {
				end++;
			}else if(winSize == k) {
				if(helperList.isEmpty()) {
					ansList.add(0);
				}else {
				ansList.add(helperList.get(0));
				}
				
				if(!helperList.isEmpty() && helperList.get(0) == arr[start]) {
					helperList.remove(0);
				}
				start++;
				end++;
			}
			
		}
		return ansList;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {-1,2,3,4,-2,-5,6};
		int k = 3;
		ArrayList<Integer> ansList = firstNegetive(arr, k);
		System.out.println(ansList);

	}

}
