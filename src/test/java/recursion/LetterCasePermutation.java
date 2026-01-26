package recursion;

public class LetterCasePermutation {
	
	public static void letterCasePermutation(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		if(Character.isAlphabetic(input.charAt(0))) {
			String output1 = output;
			String output2 = output;
			output1 = output+Character.toUpperCase(input.charAt(0));
			output2 = output+Character.toLowerCase(input.charAt(0));
			input = input.substring(1);
			
			letterCasePermutation(input, output1);
			letterCasePermutation(input, output2);
			
		}else {
			String output1 = output;
			output1 = output+input.charAt(0);
			input = input.substring(1);
			letterCasePermutation(input, output1);
		}
		
		
	}

	public static void main(String[] args) {
		
		letterCasePermutation("a1B2", "");

	}

}
