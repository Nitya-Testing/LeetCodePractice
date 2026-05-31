package twoPointerPractice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted 
 * in non-decreasing order.
 */
public class SquareOfSortedArray {
	
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		int[] resArr = new int[size1+size2];
		int left = 0;
		int right = 0;
		int count = 0;
		
		while(left<size1 && right < size2) {
			if(arr1[left]<=arr2[right]) {
				resArr[count] = arr1[left];
				left++;
				count++;
			}else {
				resArr[count] = arr2[right];
				right++;
				count++;
			}
		}
		
		while(left<size1) {
			resArr[count] = arr1[left];
			left++;
			count++;
		}
		
		while(right<size2) {
			resArr[count] = arr2[right];
			right++;
			count++;
		}
		return resArr;
		
	}
	
	public static int[] squareOfSortedArray(int[] arr) {
		int size = arr.length;
		ArrayList<Integer> negList = new ArrayList<>();
		ArrayList<Integer> posList = new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			if(arr[i]<0) {
				negList.add(arr[i]);
			}else {
				posList.add(arr[i]);
			}
			
		}
		
		//only pos numbers in arraylist
		if(negList.size() == 0) {
			for(int i=0;i<posList.size();i++) {
				posList.set(i, posList.get(i) * posList.get(i));
			}
			return posList.stream().mapToInt(Integer::intValue).toArray();
		}
		
		//only neg number in arraylist
		if(posList.size() == 0) {
			for(int i =0;i<negList.size();i++) {
				negList.set(i, negList.get(i) * negList.get(i));
			}
			Collections.reverse(negList);
			return negList.stream().mapToInt(Integer::intValue).toArray();
		}
		
		//if both pos and neg numbers in array
		int n1 = posList.size();
		int n2 = negList.size();
		
		for(int i=0;i<n1;i++) {
			posList.set(i, posList.get(i) * posList.get(i));
		}
		
		for(int i =0;i<n2;i++) {
			negList.set(i, negList.get(i) * negList.get(i));
		}
		Collections.reverse(negList);
		
		return mergeTwoSortedArray(posList.stream().mapToInt(Integer::intValue).toArray(), negList.stream().mapToInt(Integer::intValue).toArray());
		
		
	}

	public static void main(String[] args) {
		

	}

}
