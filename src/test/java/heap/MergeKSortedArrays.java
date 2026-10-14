package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
	
	
	public static ArrayList<Integer> mergeSortedArrays(int[][] mat){
		int n = mat.length; //row count
		int m = mat[0].length; //col count
		ArrayList<Integer> resList = new ArrayList<>();
		
		PriorityQueue<Triplets> minHeap = new PriorityQueue<>(
				(a,b)-> a.value - b.value
	    );
		
		for(int i=0;i<n;i++) {
			minHeap.add(new Triplets(mat[i][0],i,0));
		}
		
		while(!minHeap.isEmpty()) {
			Triplets t = minHeap.peek();
			minHeap.poll();
			
			int value = t.value;
			int rowCount = t.row;
			int colCount = t.col;
			
			resList.add(value);
			
			if(colCount<m-1) {
				minHeap.add(new Triplets(mat[rowCount][colCount+1],rowCount,colCount+1));
			}
		}
		return resList;
	}

	public static void main(String[] args) {
		
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayList<Integer> resList = mergeSortedArrays(mat);
		System.out.println(resList);

	}

}
