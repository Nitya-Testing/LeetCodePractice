package practice;

public class Subset {
	
	public static void subSet(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		String output2 = output;
		
		output2 = output2+input.charAt(0);
		input = input.substring(1);
		
		subSet(input, output1);
		subSet(input, output2);
	}

	public static void main(String[] args) {
		
		subSet("aab", "");

	}

}
