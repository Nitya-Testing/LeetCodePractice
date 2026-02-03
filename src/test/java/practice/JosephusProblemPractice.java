package practice;

import java.util.ArrayList;

public class JosephusProblemPractice {
	
	public static int solve(ArrayList<Integer> list, int k,int index) {
		//base condition
		if(list.size() == 1) {
			return list.get(0);
		}
		
		index = (index+k-1)%list.size();
		System.out.println("Index is " + index);
		list.remove(index);
		return solve(list, k, index);
		
	}
	
	public static int solveProblem(int n, int k ) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		return solve(list, k, 0);
	}

	public static void main(String[] args) {
		
		int pos = solveProblem(5, 2);
		System.out.println("Safe Place is " + pos);

	}

}
