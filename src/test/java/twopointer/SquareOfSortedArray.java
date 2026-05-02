package twopointer;

import java.util.ArrayList;
import java.util.Collections;

public class SquareOfSortedArray {
	
	public static int[] mergeTwoSortedArrays(int[]arr1,int[]arr2) {
		int m = arr1.length;
		int n = arr2.length;
		
		int i= 0;
		int j = 0;
		int k = 0;
		
		int[] res = new int[m+n];
		
		while(i < m && j < n) {  //O(n)
			if(arr1[i] <= arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i < m) {
			res[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j < n) {
			res[k] = arr2[j];
			k++;
			j++;
		}
		return res;
		
	}
	
	public static int[] sortedSquare(int[] arr) {
		
		ArrayList<Integer> posList = new ArrayList<>();
		ArrayList<Integer> negList = new ArrayList<>();
		
		for(int eachInt: arr) {
			if(eachInt < 0) {
				negList.add(eachInt);
			}else {
				posList.add(eachInt);
			}
		}
		
		//No negetive
		if(negList.size() == 0) {
			
			for(int i=0;i<posList.size();i++) {
				posList.set(i, posList.get(i)*posList.get(i));
			}
			return posList.stream().mapToInt(Integer::intValue).toArray();
		}
		
		//No Positive
		if(posList.size() == 0) {
			for(int i=0;i<negList.size();i++) {
				negList.set(i, negList.get(i)*negList.get(i));
			}
			Collections.reverse(negList);
			return negList.stream().mapToInt(Integer::intValue).toArray();
		}
		
		
		// Both Positive and Negetive
		int n1 = negList.size();
		int p1 = posList.size();
		
		for(int i=0;i<n1;i++) {
			negList.set(i, negList.get(i)* negList.get(i));
		}
		Collections.reverse(negList);
		
		for(int i=0;i<p1;i++) {
			posList.set(i, posList.get(i)*posList.get(i));
		}
		
		return mergeTwoSortedArrays(negList.stream().mapToInt(Integer::intValue).toArray(), posList.stream().mapToInt(Integer::intValue).toArray());
		
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {-3,-2,-1,0,1,2,3,4,5};
		
		int[] sortedSquare = sortedSquare(arr);
		
		for(int i=0;i<sortedSquare.length;i++) {
			System.out.print(sortedSquare[i]);
			System.out.print("  ");
		}

	}

}
