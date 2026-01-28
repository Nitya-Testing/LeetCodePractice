package recursion;

import java.util.ArrayList;

public class BalancedParentheses {

	public static ArrayList<String> solve(int open, int close, String output) {

		ArrayList<String> list = new ArrayList<>();

		if (open == 0 && close == 0) {
			list.add(output);
			return list;
		}

		if (open != 0) {
			String output1 = output;
			output1 = output1 + "(";
			list.addAll(solve(open - 1, close, output1));

		}

		if (close > open) {
			String output2 = output;
			output2 = output2 + ")";
			list.addAll(solve(open, close - 1, output2));

		}
		return list;
	}

	public static void main(String[] args) {
		int num = 3;
		int open = num;
		int close = num;
		String output = "";
		ArrayList<String> list = solve(open, close, output);
		System.out.println(list);

	}

}
