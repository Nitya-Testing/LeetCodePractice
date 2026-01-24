package recursion;

public class SubSet {
	
	public static void printSubSets(String input,String output) {
		if(input.length() == 0) {
			System.out.print(output + " , ");
			return;
		}
		
		String output1 = output;
		String output2 = output;
		
		output2 = output2+input.charAt(0);
		input = input.substring(1);
		
		printSubSets(input, output1);
		printSubSets(input, output2);
	}

	public static void main(String[] args) {
		
		printSubSets("abc", "");
		System.out.println();

	}

}
