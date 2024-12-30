package day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(4);
		set.add(6);
		set.add(7);
		set.add(12);
		set.add(20);
		set.add(25);
		set.add(5);
//		System.out.println(set);
		
		Iterator<Integer> iter = set.iterator();
		//define a list to save all those values that needs be removed
		List<Integer> listRemoved = new ArrayList<Integer>();
		while(iter.hasNext()) {
			
			int value = iter.next();	//find current value
			Iterator<Integer> innerIter = set.iterator();
			
			while(innerIter.hasNext()) {
				int innerValue = innerIter.next();	//find all other value
//				System.out.print(value+"--"+innerValue);
				//if one other value is the multiple of current value
				if(innerValue>value && innerValue % value == 0) {
					//add it into list
					listRemoved.add(innerValue);
				}
//				System.out.println();
			}
		}

		iter = set.iterator();	//get iterator again
		while(iter.hasNext()) {
			if(listRemoved.contains(iter.next())) {	//if list contains the current value
				iter.remove();	//remove current value from iterator
			}
		}
		System.out.println(set);
	}

	
}
