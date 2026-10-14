package heap;

import java.util.PriorityQueue;

public class FindSecondLargestNumber { //O(nlogn)  O(n)
	
	public static int findSecondLargestNumber(int[] arr, int n) {
		int size = arr.length;
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			minHeap.add(arr[i]);
		}
		
		for(int i=n;i<size;i++) {
			minHeap.poll();
			minHeap.add(arr[i]);
		}
		
		return minHeap.peek();
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,2,7,9};
		int n = 2;
		System.out.println(findSecondLargestNumber(arr, n));

	}

}
