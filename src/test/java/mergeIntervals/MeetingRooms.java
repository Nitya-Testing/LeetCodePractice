package mergeIntervals;

import java.util.Arrays;

public class MeetingRooms {
	
	public static int minimumRooms(int[] start, int[] end) {
		int size = start.length;
		Arrays.sort(start);
		Arrays.sort(end);
		
		int rooms = 0;
		int res = 0;
		int i = 0;
		int j = 0;
		
		while(i<size && j<size) {
			if(start[i]<end[j]) {
				rooms++;
				res = Math.max(res, rooms);
				i++;
			}else {
				rooms--;
				j++;
			}
		}
		
		return res;
		
		
	}

	public static void main(String[] args) {
		
		int[] start = {2, 9, 6};
		int[] end = {4, 12, 10};
		
		int minRoomRequired = minimumRooms(start, end);
		System.out.println(minRoomRequired);

	}

}
