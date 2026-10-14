package mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	
	public static int[][] mergeIntervals(int[][] intervals){
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));// sort it wrt starting
		ArrayList<int[]> resList = new ArrayList<>();
		int size = intervals.length;
		
		int start1 = intervals[0][0];
		int end1 = intervals[0][1];
		
		for(int i=1;i<size;i++) {
			int start2 = intervals[i][0];
			int end2 = intervals[i][1];
			
			if(end1>=start2) {
				//it can me merged
				start1 = start1;
				end1 = Math.max(end1, end2);
				continue;
			}
			
			resList.add(new int[] {start1,end1});
			start1 = start2;
			end1 = end2;
			
		}
		
		resList.add(new int[] {start1,end1});
		return resList.stream().toArray(int[][]::new);
		
		
	}

	public static void main(String[] args) {
		int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
		int[][] merge = mergeIntervals(intervals);
		
		for(int[] each: merge) {
			System.out.println(each[0] + "," + each[1]);
		}
		
		

	}

}
