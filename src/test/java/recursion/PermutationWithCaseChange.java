package recursion;

public class PermutationWithCaseChange {
	
	public static void permutationWithCaseChange(String input, String output) {
		
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		String output2 = output;
		
		output1 = output+Character.toUpperCase(input.charAt(0));
		output2 = output+input.charAt(0);
		
		input = input.substring(1);
		
		permutationWithCaseChange(input, output1);
		permutationWithCaseChange(input, output2);
	}

	public static void main(String[] args) {
		
		permutationWithCaseChange("ab", "");

	}

}
