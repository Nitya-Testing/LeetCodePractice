package recursion;

import java.util.ArrayList;

public class PrintNbitBinaryNumber {
	
	static ArrayList<String> list = new ArrayList<>();
	
	public static ArrayList<String> solve(int num,int zeros, int ones,String output){
		
		if(num == 0) {
			list.add(output);
			return list;
		}
		
		String output1 = output;
		output1 = output+"1";
		solve(num-1, zeros, ones+1, output1);
		
		if(ones>zeros) {
			String output2 = output;
			output2 = output+"0";
			solve(num-1, zeros+1, ones, output2);
		}
		return list;
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<String> list = solve(3, 0, 0, "");
		System.out.println(list);

	}

}
