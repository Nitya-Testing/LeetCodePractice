package recursionPractice7thMarch;

public class NthGrammerPractice {
	
	public static int solve(int n, int k) {
		if(n ==1 && k ==1) {
			return 0;
		}
		
		int length = (int) Math.pow(2, n-1);
		int mid = length/2;
		
		if(k<=mid) {
			return solve(n-1, k);
		}else {
			return 1 ^ solve(n-1, k-mid);
		}
	}

	public static void main(String[] args) {
		
		

	}

}
