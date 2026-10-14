package mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {
	
	public static int[][] mergeInterval(int[][] intervals){
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0])); //sort wrt to start
		ArrayList<int[]> resList = new ArrayList<>();
		int size = intervals.length;
		if(intervals.length == 0) {
			return new int[0][];
		}
		int start1 = intervals[0][0];
		int end1 = intervals[0][1];
		
		for(int i=1;i<size;i++) {
			int start2 = intervals[i][0];
			int end2 = intervals[i][1];
			
			if(end1>=start2) {
				//merge is possible
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
	
	public static int[][] insertInterval(int[][] intervals, int[] interval){
		ArrayList<int[]> list = new ArrayList<>();
		int intervalsSize = intervals.length;
		boolean insert = false;
		for(int i=0;i<intervalsSize;i++) {
			int start = intervals[i][0];
			
			if(insert == false && start>=interval[0]) {
				list.add(interval);
				insert = true;
			}
			list.add(intervals[i]);
		}
		if(insert == false) {
			list.add(interval);
		}
		return list.stream().toArray(int[][]::new);
	}

	public static void main(String[] args) {
		
		int[][] intervals = new int[][] {{1,3},{6,9}};
		int[] interval = new int[] {2,5};
		
		int[][] insertedInterval = insertInterval(intervals, interval);
		int[][] mergedInterval = mergeInterval(insertedInterval);
		
		for(int[] each:mergedInterval) {
			System.out.println(each[0] + "," + each[1]);
		}

	}

}
