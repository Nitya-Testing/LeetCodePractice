package practice;

import java.util.ArrayList;

public class JosephusProblem {
	
	public static int solve(ArrayList<Integer> armyList,int k, int index) {
		
		if(armyList.size() == 1) {
			return armyList.get(0);
		}
		
		index = (index+k-1)%armyList.size();
		armyList.remove(index);
		
		return solve(armyList, k, index);
		
	}
	
	public static int josephusProblem(int n, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		return solve(list, k,0);
		
	}

	public static void main(String[] args) {
		
		int pos = josephusProblem(5, 2);
		System.out.println(pos);
		

	}

}
