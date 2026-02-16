package recursionPractice16thFeb;

public class NthGrammer {
	
	public static int solve(int n, int k) {
		//base Condition
		if(n ==1 && k==1) {
			return 0;
		}
		
		int len = (int) Math.pow(2, n-1);
		int mid = len/2;
		
		if(k<=mid) {
			return solve(n-1, k);
		}else {
			return 1 ^ solve(n-1, k-mid);
		}
	}

	public static void main(String[] args) {
		
		int num = solve(3, 3);
		System.out.println(num);

	}

}
