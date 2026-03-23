package slidingWindowPractice;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegetiveNumberInWinSizeKUsingQueue {
	
	public static ArrayList<Integer> firstNegetiveNumber(int[] arr, int k){
		int size = arr.length;
		int start = 0;
		int end = 0;
		Deque<Integer> queue = new LinkedList<>();
		ArrayList<Integer> ansList = new ArrayList<>();
		
		while(end<size) {   // { -3, -2, 3, 5, 6, -3, 1, -2 }  , {1} . {-3.
			if(arr[end]<0) {
				queue.addLast(end);
			}
			
			if(end-start+1 < k) {
				end++;
			}else if(end-start+1 == k) {
				if(queue.isEmpty()) {
					ansList.add(0);
				}else {
					ansList.add(arr[queue.getFirst()]);
				}
				
				if(!queue.isEmpty() && queue.getFirst() == start) {
					queue.pollFirst();
				}
				start++;
				end++;
			}
		}
		return ansList;
	}

	public static void main(String[] args) {
		int[] arr = { -3, -2, 3, 5, 6, -3, 1, -2 };
		int k = 3;

		ArrayList<Integer> list = firstNegetiveNumber(arr, k);
		System.out.println(list);

	}

}
