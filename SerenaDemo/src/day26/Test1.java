package day26;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(99);
		list.add(77);
		list.add(88);
		System.out.println(list);
		reverse(list);
		System.out.println(list);
	}
	
	
	public static <T> void reverse(ArrayList<T> list) {
		// 0  1  2  3  4							size			size/2
		//{11,22,33,77,88}							5				2
		//11<->88     22<->77
		// 0  1  2  3  4  5
		//{11,22,33,99,77,88}						6				3
		//11<->88     22<->77   33<->99
		
		for(int i=0 ; i<list.size()/2 ; i++) {
			// i <-> size-1-i        start + end = 5 = size-1   end = size-1-start
			T value1 = list.get(i);
			T value2 = list.get(list.size()-1-i);
			list.set(i, value2);
			list.set(list.size()-1-i, value1);
		}
		
		
	}

}


class A{
	//instance variables
	
	
	//constructors  (overloading)
	
	
	//methods(getters and setters,override methods: hashCode,equals,toString, normal methods)
	
	
}

