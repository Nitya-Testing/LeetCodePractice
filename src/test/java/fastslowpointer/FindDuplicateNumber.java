package fastslowpointer;

public class FindDuplicateNumber {

	public static int findDuplicateNumber(int[] arr) {
		int slow = 0;
		int fast = 0;
		
		while(true) {
			slow = arr[slow];
			fast = arr[fast];
			fast = arr[fast];
			
			if(slow == fast) {
				slow = 0;
				while(slow !=fast) {
					slow = arr[slow];
					fast = arr[fast];
				}
				return slow;
			}
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,4};
		int duplicate = findDuplicateNumber(arr);
		System.out.println(duplicate);

	}

}
