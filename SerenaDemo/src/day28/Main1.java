package day28;

import java.util.Arrays;

public class Main1 {

	//keep separating them
	public static void mergeSort(int[] array, int left, int right,int[] temp) {
		if(left<right) {
	//																first time(0,7)		second time(0,3)   third time(0,1)
			int mid = (left+right)/2;	//middle position			3					1						0
//			System.out.println(mid);
			//left~mid	
			mergeSort(array, left, mid,temp);   //						array,0,3			array,0,1			array,0,0
			
			//mid+1~right
			mergeSort(array, mid+1, right,temp);//																
			
//			merge(array,left,mid,right);
			int len1 = mid-left+1;	//the length of leftCopy
			int len2 = right - mid;
			
			int[] leftCopy = new int[len1];
			int[] rightCopy = new int[len2];
			
			//copy old values into leftCopy array
			for(int i=0 ; i<len1 ; i++) {
				leftCopy[i] = array[left+i];	//from left to mid
			}

			//copy old values into rightCopy array
			for(int i=0 ; i<len2 ; i++) {
				rightCopy[i] = array[i+mid+1];  //from mid+1 to right
			}
			
			//sorting
			int i=0,j=0;	//i->index of leftCopy, j->index of rightCopy
			int k = left;
			while(i<len1 && j<len2) {
				if(leftCopy[i]<= rightCopy[j]) {
					array[k] = leftCopy[i];
					i++;
					k++;
				}else {
					array[k] = rightCopy[j];
					j++;
					k++;
				}
			}
			
			//unfinished values
			while(i<len1) {
				array[k] = leftCopy[i];
				i++;
				k++;
			}
			
			while(j<len2) {
				array[k] = rightCopy[j];
				j++;
				k++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		//22 88            11 66
		//11 22 66  ?
		// TODO Auto-generated method stub
		int[] ary = {88,22,66,11,55,33,77,44};
		int[] temp = new int[ary.length];
		System.out.println(Arrays.toString(ary));
		mergeSort(ary,0,ary.length-1,temp);
		System.out.println(Arrays.toString(ary));
	}

}
