package day30;

import java.util.Arrays;

public class Main1 {

	//keep separating them
	public static void mergeSort(int[] array, int leftInd, int rightInd,int[] temp) {
		if(leftInd<rightInd) {
			int mid = (leftInd+rightInd)/2;	
			mergeSort(array, leftInd, mid,temp);   
			mergeSort(array, mid+1, rightInd,temp);
			
			//i: control the index left part
			//j: control the index right part
			//k: control the index of temp
			int i=leftInd,j=mid+1,k=0;
			
			while(i<=mid && j<=rightInd) {
				if(array[i]<=array[j]) {
//					temp[k] = array[i];
//					k++;
//					i++;
					temp[k++] = array[i++];
				}else {
//					temp[k] = array[j];
//					k++;
//					j++;
					temp[k++] = array[j++];
				}
			}
			
			while(i<=mid) {
				temp[k++] = array[i++];
			}
			
			while(j<=rightInd) {
				temp[k++] = array[j++];
			}
			//==========temp will be sorted with 2 parts
			
			//replace a certain of positions of the original array with temp
			for(int m = 0 ; m<k ; m++) {
				array[leftInd+m] = temp[m];
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
