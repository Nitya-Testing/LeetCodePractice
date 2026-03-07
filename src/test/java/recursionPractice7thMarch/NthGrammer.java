package recursionPractice7thMarch;

public class NthGrammer {
	
	public static int solve(int n, int k) {
		//base condition
		if(n ==1 && k ==1) {
			return 0;
		}
		
		//identify the mid
		int mid = (int) (Math.pow(2, n-1)/2);
		
		//if k is less than equal to mid then solve it with n-1 and k
		if(k<=mid) {
			return solve(n-1, k);
		}else {
			//otherwise solve it with n-1 and k-mid with its complement
			return 1 ^ solve(n-1, k-mid);
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println(solve(2, 2));

	}

}
