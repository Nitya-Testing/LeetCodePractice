package slidingWindown4thApril;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegetiveNumberUsingDeque {
	
	public static ArrayList<Integer> firstNegetiveNumber(int[] arr, int k){
		int size = arr.length;
		int start = 0;
		int end = 0;
		Deque<Integer> deque = new LinkedList<>();
		ArrayList<Integer> ansList = new ArrayList<>();
		
		while(end<size) {
			if(arr[end]<0) {
				deque.addLast(end);
			}
			
			if(end-start+1 < k) {
				end++;
			}else if(end-start+1 == k) {
				if(deque.isEmpty()) {
					ansList.add(0);
				}else {
					ansList.add(arr[deque.getFirst()]);
				}
				
				if(!deque.isEmpty() && deque.getFirst() == start) {
					deque.pollFirst();
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
