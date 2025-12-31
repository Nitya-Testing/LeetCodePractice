package slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaximumInSubArray {

	public static ArrayList<Integer> maximumInSubArray(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> ansList = new ArrayList<>();

		if (size == 0 || k == 0 || k > size) {
			throw new IllegalArgumentException("Argument is not correct. Please check.");
		}

		while (end < size) {

			while (!deque.isEmpty() && arr[end] > deque.getLast()) {
				deque.removeLast();
			}
			deque.add(arr[end]);

			if (end - start + 1 < k) {
				end++;
			} else if (end - start + 1 == k) {
				ansList.add(deque.getFirst());

				if (deque.getFirst() == arr[start]) {
					deque.removeFirst();
				}

				start++;
				end++;
			}
		}
		return ansList;

	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		
		ArrayList<Integer> ansList = maximumInSubArray(arr, k);
		System.out.println(ansList);
	}

}
