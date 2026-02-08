package practice;

import java.util.ArrayList;

public class GenerateBalancedParentheses {

	public static void solve(int open, int close, String output, ArrayList<String> list) {

		if (open == 0 && close == 0) {
			list.add(output);
			return;
		}

		if (open != 0) {
			String output1 = output;
			output1 = output + "(";
			solve(open - 1, close, output1, list);
		}

		if (close > open) {
			String output2 = output;
			output2 = output + ")";
			solve(open, close - 1, output2, list);
		}

	}

	public static ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> list = new ArrayList<>();
		solve(n, n, "", list);
		return list;
	}

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}

}
