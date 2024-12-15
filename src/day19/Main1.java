package day19;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//1.add(value)	append the value in the end of the ist
		//  add(index,value)	insert the value at a specific index
		list.add("hello");
		list.add("Jack");
		list.add("Mike");
		list.add("Jo");
		list.add("Lily");
		list.add(5,"Jack");			//index we can use here:0~origianl size
		
		
		//2.get
//		String value = list.get(0);	//index: 0~size-1
//		System.out.println(value);
		System.out.println("---------normal loop:from front");
		for(int i=0 ; i<list.size() ; i++) {	//i:index     element/value:list.get(i)
			if(i%2==0)
				System.out.println(list.get(i));
		}
		
		System.out.println("---------normal loop:from backwards");
		for(int i=list.size()-1; i>=0 ; i--) {		//5 4 3 2 1 0
			System.out.println(list.get(i));
		}
		
		System.out.println("---------foreach loop:");
		for(String x:list) {
			System.out.println(x);
		}
		
		
		//3.size()
		System.out.println(list);
		System.out.println(list.size());		
		
		//4.set
		list.set(1, "Alex");
		System.out.println(list);
			
		//5.remove
		String removed = list.remove(1);
		System.out.println("element 【"+removed +"】 is gone, now the list is:");
		System.out.println(list);
		
		boolean isRemoved = list.remove("Lily");
		System.out.println(isRemoved?"removed successfully":"failed");
		System.out.println(list);
		
		
		//====================
		//6.
	}

}











