package resursionPractice21Feb;

import java.util.ArrayList;

public class JosephusProblem {

	public static int solve(int k, int removedElement, ArrayList<Integer> list) {
		// Base case
		if (list.size() == 1) {
			return list.get(0);
		}

		removedElement = (removedElement + k - 1) % list.size();
		list.remove(removedElement);

		return solve(k, removedElement, list);

	}
	
	public static int josephusProblem(int n, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =1;i<=n;i++) {
			list.add(i);
		}
		
		return solve(k, n, list);
	}

	public static void main(String[] args) {
		int n = 5;
		int k =2;
		
		int pos = josephusProblem(n, k);
		System.out.println(pos);
	}

}
