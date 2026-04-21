package twopointer;

public class RemoveDuplicate {
	
	public static int[] removeDuplicate(int[] arr) {
		int start = 0;
		int end = 1;
		int count = 1;
		int size = arr.length;
		
		while(end<size) {
			if(arr[end]==arr[end-1]) {
				end++;
				continue;
			}
			
			arr[start+1] = arr[end];
			start++;
			count++;
			end++;
			
		}
		
		int[] resArr = new int[count];
		
		for(int i=0;i<count;i++) {
			resArr[i] =arr[i];
		}
		return resArr;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2,2,3,3,3,4,4};
		int[] count = removeDuplicate(arr);
		
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}

	}

}
