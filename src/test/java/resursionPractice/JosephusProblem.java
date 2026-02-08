package resursionPractice;

import java.util.ArrayList;

public class JosephusProblem {

	public static int solve(int k, int index, ArrayList<Integer> list) {

		if (list.size() == 1) {
			return list.get(0);
		}

		index = (index + k - 1) % list.size();
		list.remove(index);

		return solve(k, index, list);

	}

	public static int solution(int n, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		return solve(k, 0, list);
	}

	public static void main(String[] args) {

		int pos = solution(5, 2);
		System.out.println(pos);
	}

}
