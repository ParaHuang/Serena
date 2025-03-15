package day29;

import java.util.ArrayList;
import java.util.List;

public class HalfSort {

//	private static void rightHalfSort(int[] ary) {
//		int mid = ary.length/2;
//		
//		//locate the right half
//		for(int i = ary.length-1 ; i >= mid ; i--) {
//			//find the right number for the position i
//			//last position need the smallest number
////													i			last index							second last
//			int minIndex = minIndexLeft(ary,i);		//0~i   	min value out of everything?
//			//swap
//			swap(ary,i,minIndex);
//		}
//	}
//	
	List<List<Integer>> splitEitherWay(int[] array) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> smallList = new ArrayList<Integer>();
		smallList.add(array[0]);
		boolean isAscending = true;
		for(int i=1 ; i<array.length ; i++) {
			if(array[i]>array[i-1]) {
				
			}
		}

		return result;
	}
}
