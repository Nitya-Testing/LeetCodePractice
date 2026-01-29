package practice;

import java.util.ArrayList;

public class GenerateValidParenthysish {
	
	 public static ArrayList<String> solve(int open, int close, String output, ArrayList<String> list){
		 
		
		
		if(open == 0 && close == 0) {
			list.add(output);
			return list;
		}
		
		if(open != 0) {
			String output1 = output;
			output1 = output1+"(";
			solve(open-1, close, output1,list);
		}
		
		if(open<close) {
			String output2 = output;
			output2 = output2+")";
			solve(open, close-1, output2,list);
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = solve(3, 3, "",list);
		System.out.println(list1);

	}

}
