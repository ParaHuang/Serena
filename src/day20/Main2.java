package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		//Set: 1.can't save duplicate element
		//2.no index
		
//		Set<Integer> set = new HashSet<>();	//has no order
//		Set<Integer> set = new LinkedHashSet<>();//use the add order
		Set<Integer> set = new TreeSet<>();//use the natural order
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(11);
		set.add(88);
		set.add(55);
		
		System.out.println(set.size());
		System.out.println(set);
		//check element 1 by 1
		for(int x:set) {
			System.out.println(x);
		}
		
	}

}







