package day30;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static List<List<Integer>> splitEitherWay(int[] array){
		List<List<Integer>> result = new ArrayList<>();
		
		if(array==null || array.length==0) {
			return result;
		}
		
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(array[0]);
		
		for(int i=1 ; i<array.length ; i++) {
			if(temp.size()>1) {
				//the situation we need to add temp as sublist into result
				//the last value and second last value of temp
				int last = temp.get(temp.size()-1);
				int secondLast = temp.get(temp.size() - 2);
				if((last>secondLast && array[i]<last) || (last<secondLast && array[i]>last)) {
					result.add(new ArrayList<Integer>(temp)); //temp:[2,4,4,7]
					temp.clear();	//temp:[]
				}
			}
			
			//no matter what, we need to add value into temp
			temp.add(array[i]);
		}
		if(!temp.isEmpty()) {
			result.add(temp);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,4,7,5,9,1,0,4};
		System.out.println(splitEitherWay(array));
	}

}












