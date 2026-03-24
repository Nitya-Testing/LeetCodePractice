package slidingWindowPractice;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegetiveNumberWithQueue {
	
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
		int[] arr = { -3, -2, 3, 5, 6, -3, 1, -2 }; //O(n)
		int k = 3;

		ArrayList<Integer> list = firstNegetiveNumber(arr, k);
		System.out.println(list);

	}

}
