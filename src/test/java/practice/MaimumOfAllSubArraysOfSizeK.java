package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaimumOfAllSubArraysOfSizeK {
	
	public static ArrayList<Integer> maximumOfAllSubArraysOfSizeK(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		if(size == 0 || k == 0) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		
		while(end<size) {
			
			while(!deque.isEmpty() && deque.getLast()<arr[end]) {
				deque.removeLast();
			}
			deque.add(arr[end]);
			
			int winSize = end-start+1;
			if(winSize<k) {
				end++;
			}else if(winSize == k) {
				list.add(deque.getFirst());
				
				if(deque.getFirst() == arr[start]) {
					deque.removeFirst();
				}
				start++;
				end++;
			}
		}
		return list;
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,2,6,1}; //3,5,5,6,6
		int k = 3;
		ArrayList<Integer> list = maximumOfAllSubArraysOfSizeK(arr, k);
		System.out.println(list);

	}

}
