package practice;

public class KthSymbolInGrammer {
	
	public static int kThGrammer(int n, int k) {
		
		if(n == 1 && k == 1) {
			return 0;
		}
		
		int mid = (int)Math.pow(2, n-1)/2;
		
		if(k<=mid) {
			return kThGrammer(n-1, k);
		}else {
			return 1 ^ kThGrammer(n-1, k-mid);
		}
				
	}

	public static void main(String[] args) {
		
		int n = 2;
		int k = 2;
		
		int num = kThGrammer(n, k);
		System.out.println(num);

	}

}
