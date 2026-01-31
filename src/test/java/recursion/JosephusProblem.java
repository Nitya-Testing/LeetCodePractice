package recursion;

import java.util.ArrayList;

public class JosephusProblem {

	public static int solve(ArrayList<Integer> peopleList, int k, int index) {

		if (peopleList.size() == 1) {
			return peopleList.get(0);
		}

		index = (index + k - 1) % peopleList.size();
		peopleList.remove(index);

		return solve(peopleList, k, index);

	}

	public static int josephus(int n, int k) {
		ArrayList<Integer> people = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			people.add(i);
		}
		return solve(people, k, 0);
	}

	public static void main(String[] args) {

		int pos = josephus(5, 2);
		System.out.println(pos);

	}

}
