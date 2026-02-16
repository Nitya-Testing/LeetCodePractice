package recursionPractice16thFeb;

import java.util.ArrayList;

public class JosephusProblem {
	
	public static int solve(int k, int index, ArrayList<Integer> list) {
		
		if(list.size() == 1) {
			return list.get(0);
		}
		
		index = (index+k-1)% list.size();
		
		list.remove(index);
		
		return solve( k, index, list);
	}

	public static void main(String[] args) {
		
		int n = 5;
		int k = 2;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		int pos = solve(k, 0, list);
		System.out.println(pos);
		
	}

}
