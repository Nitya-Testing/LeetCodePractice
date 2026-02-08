package resursionPractice;

import java.util.ArrayList;

public class GenerateBalancedParentheses {
	
	public static ArrayList<String> solve( int open, int close, String output){
		
		ArrayList<String> list = new ArrayList<>();
		
		if(open == 0 && close == 0) {
		    list.add(output);
		    return list;
		}
		
		
		if(open != 0 ) {
			String output1 = output;
			output1 = output+"(";
			list.addAll(solve(open-1, close, output1));
			
		}
		
		if(close>open) {
			String output2 = output;
			output2 = output+")";
			list.addAll(solve(open, close-1, output2));
			
		}
		return list;
	}

	public static void main(String[] args) {
		
		
		int n = 3;
		int open = n;
		int close = n;
		ArrayList<String> list = solve(open, close, "");
		System.out.println(list);

	}

}
