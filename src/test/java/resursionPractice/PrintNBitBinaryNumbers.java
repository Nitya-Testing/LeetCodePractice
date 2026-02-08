package resursionPractice;

public class PrintNBitBinaryNumbers {
	
	public static void solve(int n, int ones, int zeros, String output) {
		
		//base condition is this
		if(n == 0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		output1 = output+"1";
		
		solve(n-1, ones+1, zeros, output1);
		
		if(zeros<ones) {
			String output2 = output;
			output2 = output+"0";
			solve(n-1, ones, zeros+1, output2);
		}
	}
	
	

	public static void main(String[] args) {
		
		solve(3, 0, 0, "");

	}

}
