package slowFastPointer;

public class HappyNumber {
	
	public static boolean happyNumber(int num) {
		int slow = num;
		int fast = num;
		
		while(fast !=1) {
			slow = squareSum(slow);
			fast = squareSum(fast);
			fast = squareSum(fast);
			
			if(slow == fast && slow!=1) {
				return false;
			}
		}
		return true;
	}

	private static int squareSum(int number) {
		int sum = 0;
		while(number>0) {
			int digit = number % 10;
			sum = sum + digit*digit;
			number = number/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		

	}

}
