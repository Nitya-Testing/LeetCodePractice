package slidingWindowPractice;

import java.util.ArrayList;

public class FirstNegetiveNumberInWinSizeK {

	public static ArrayList<Integer> firstNegetiveNumber(int[] arr, int k) {

		// {-3,-2,3,5,6,-3,1,-2}
		int size = arr.length;
		int start = 0;
		int end = 0;
		ArrayList<Integer> helperList = new ArrayList<>();
		ArrayList<Integer> ansList = new ArrayList<>();

		while (end < size) {
			if (arr[end] < 0) {
				helperList.add(arr[end]);
			}

			if (end - start + 1 < k) {
				end++;
			} else if (end - start + 1 == k) {
				if (helperList.isEmpty()) {
					ansList.add(0);
				} else {
					ansList.add(helperList.get(0));
				}

				if (!helperList.isEmpty() && helperList.get(0) == arr[start]) {
					helperList.remove(0);
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
