package mergeIntervals;

import java.util.ArrayList;

public class IntervalIntersections {
	
	public static int[][] intervalIntersection(int[][] firstList , int[][] secondList ){
		ArrayList<int[]> list = new ArrayList<>();
		int firstListSize = firstList.length;
		int secondListSize = secondList.length;
		
		int i = 0;
		int j = 0;
		
		while(i<firstListSize && j<secondListSize) {
			int start1 = firstList[i][0];
			int end1 = firstList[i][1];
			
			int start2 = secondList[j][0];
			int end2 = secondList[j][1];
			
			if(start1<=start2) { //sorted wrt start
				if(end1>=start2) {
					//intersection is possible
					int s = Math.max(start1, start2);
					int e = Math.min(end1, end2);
					list.add(new int[] {s,e});
					
				}
			}else {
				if(end2>=start1) {
					//intersection is possible
					int s = Math.max(start1, start2);
					int e = Math.min(end1, end2);
					list.add(new int[] {s,e});
				}
			}
			
			if(end1<=end2) {
				i++;
			}else {
				j++;
			}
			
		}
		if(list.size() == 0) {
			System.out.println("No overlapping possible");
		}
		return list.stream().toArray(int[][]::new);
	}

	public static void main(String[] args) {
		int[][] firstList = new int[][] {{1,2},{3,4}};
		int[][] secondList = new int[][] {{2,4},{7,8}};
		
		int[][] intervalIntersection = intervalIntersection(firstList, secondList);
        
		for(int[] each:intervalIntersection) {
			System.out.println(each[0] + "," + each[1]);
		}
	}

}
