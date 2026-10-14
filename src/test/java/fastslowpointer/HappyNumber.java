package fastslowpointer;

public class HappyNumber {
	
	public static int squareSum(int num) {
		int sum = 0;
		
		while(num>0) {
			int digit = num % 10;
			sum = sum + digit * digit;
			num = num/10;
		}
		return sum;
			
	}
	
	public static boolean isHappy(int num) {
		int slow = num;
		int fast = num;
		
		while(fast!=1) {
			slow = squareSum(slow);
			fast = squareSum(fast);
			fast = squareSum(fast);
			
			if(slow == fast && slow!=1) {
			return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean ishappy = isHappy(19);
		System.out.println(ishappy);

	}

}
