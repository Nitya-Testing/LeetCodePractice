package practice;

import java.util.ArrayList;

public class BalancedParentheses {
	
	
	public static void helper(int open, int close, String output, ArrayList<String> list) {
		if(open == 0 && close == 0) {
			list.add(output);
			return;
			
		}
		
		if(open !=0) {
			String output1 = output;
			output1 = output+"(";
			helper(open-1, close, output1, list);
		}
		
		if(close > open) {
			String output2 = output;
			output2 = output+")";
			helper(open, close-1, output2, list);
		}
		
	}
	
	public static void solve(int n) {
		ArrayList<String> list = new ArrayList<>();
		helper(n, n, "", list);
		System.out.println(list);
	}

	public static void main(String[] args) {
		
		int n = 3;
		solve(n);
		

	}

}
