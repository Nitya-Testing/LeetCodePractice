package resursionPractice;

public class PermutationWithSpaces {
	
	public static void solve(String input, String output) {
		
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		String output2 = output;
		
		output1 = output+"-"+input.charAt(0);
		output2 = output+input.charAt(0);
		
		input = input.substring(1);
		
		solve(input, output1);
		solve(input, output2);
	}

	public static void main(String[] args) {
		
		String input = "ABC";
		String output = "";
		
		output = output+input.charAt(0);
		input = input.substring(1);
		
		
		solve(input, output);

	}

}
