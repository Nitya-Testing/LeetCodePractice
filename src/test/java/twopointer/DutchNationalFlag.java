package twopointer;

public class DutchNationalFlag {
	
	public static int[] dutchNationalFlag(int[] arr) {
		
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				zeros++;
			}else if (arr[i] == 1) {
				ones++;
			}else {
				twos++;
			}
		}
		
		int[] resArr = new int[zeros+ones+twos];
		
		for(int i=0;i<zeros;i++) {
			resArr[i] = 0;
		}
		
		for(int i = zeros;i<zeros+ones;i++) {
			resArr[i] = 1;
		}
		
		for(int i = zeros+ones;i<arr.length;i++) {
			resArr[i] = 2;
		}
		return resArr;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,1,1,0,0,2,2};
		int[] resSrr = dutchNationalFlag(arr);
		for(int each: resSrr) {
			System.out.println(each);
		}

	}

}
