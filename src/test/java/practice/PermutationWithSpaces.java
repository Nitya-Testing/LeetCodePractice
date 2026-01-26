package practice;

public class PermutationWithSpaces {
	
	public static void permutationWithSpaces(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		String output2 = output;
		
		output1 = output + "-" + input.charAt(0);
		output2 = output+input.charAt(0);
		
		input = input.substring(1);
		
		permutationWithSpaces(input, output1);
		permutationWithSpaces(input, output2);
		
	}

	public static void main(String[] args) {
		
		permutationWithSpaces("BC", "A");

	}

}
