package practice;

public class PrintNbitBinaryNumber {
	
	public static void solve(int n, int ones, int zeros, String output) {
		
		if(n == 0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		output1 = output+"1";
		solve(n-1, ones+1, zeros, output1);
		
		if(ones>zeros) {
			String output2 = output;
			output2 = output+"0";
			solve(n-1, ones, zeros+1, output2);
		}
		
		
	}

	public static void main(String[] args) {
		
		solve(3, 0, 0, "");

	}

}
