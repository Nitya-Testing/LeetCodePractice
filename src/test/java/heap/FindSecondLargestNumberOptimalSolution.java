package heap;

public class FindSecondLargestNumberOptimalSolution {
	
	public static int findSecondLargestNumber(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			if(num>largest) {
				second_largest = largest;
				largest = num;
				
			}else if(num<largest && num>second_largest) {
				second_largest = num;
			}
		}
		return second_largest;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,2,7,9};
		
		System.out.println(findSecondLargestNumber(arr));

	}

}
