package recursion;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubSet {
	
	static Set<String> set = new HashSet<>();
	
	public static void uniqueSubSet(String input, String output){
		
		if(input.length() == 0) {
			set.add(output);
			return;
		}
		
		String output1 = output;
		String output2 = output;
		
		output2 = output2+input.charAt(0);
		input = input.substring(1);
		
		uniqueSubSet(input, output1);
		uniqueSubSet(input, output2);
	}

	public static void main(String[] args) {
		
		uniqueSubSet("aab", "");
		
		for(String each: set) {
			System.out.print(each);
			System.out.println(" ");
		}
		

	}

}
