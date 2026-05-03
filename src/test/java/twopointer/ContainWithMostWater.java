package twopointer;

public class ContainWithMostWater {
	
	public static int containMostWater(int[] arr) {
		int size = arr.length;
		int start = 0;
		int end = size-1;
		int max_area = Integer.MIN_VALUE;
		
		while(start<end) {
			int area = Math.min(arr[start], arr[end]) * (end-start);
			max_area = Math.max(max_area, area);
			
			if(arr[start]<arr[end]) {
				start++;
			}else {
				end--;
			}
			
		}
		return max_area;
		
	}

	public static void main(String[] args) {
		

	}

}
