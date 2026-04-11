package slidingWindown4thApril;

import java.util.ArrayList;

public class FirstNegetiveNumberUsingList {
	
	public static ArrayList<Integer> firstNegetiveNumber(int[] arr, int k){
		int size = arr.length;
		int start = 0;
		int end = 0;
		ArrayList<Integer> tempList = new ArrayList<>();
		ArrayList<Integer> ansList = new ArrayList<>();
		
		while(end<size) {
			if(arr[end]<0) {
				tempList.add(arr[end]);
			}
			
			if(end-start+1 < k) {
				end++;
			}else if(end-start+1 == k) {
				if(tempList.size() == 0) {
					ansList.add(0);
				}else {
					ansList.add(tempList.get(0));
				}
				
				if(!tempList.isEmpty() && tempList.get(0) == arr[start]) {
					tempList.remove(0);
				}
				start++;
				end++;
			}
		}
		return ansList;
	}

	public static void main(String[] args) {
		
		int[] arr = {-1,3,4,-2,5,6,7}; //-1,-2,-2,-2,0
		int k = 3;
		
		ArrayList<Integer> list = firstNegetiveNumber(arr, k);
		System.out.println(list);

	}

}
