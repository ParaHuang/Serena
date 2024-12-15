package day17;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		a.add("Hello");
		a.add("xyz");
		a.add("abc");

		b.add("abc");
		b.add("abc");
		b.add("hola");
		b.add("你好");
		b.add("xyz");
		b.add("Hello");
		
		System.out.println(isSubset(a,b));
		//a.contains(b)//to see if list a contains some element
		System.out.println(b.containsAll(a));
	}
	
	
	public static boolean isSubset(ArrayList<String> a, ArrayList<String> b) {
//	    for(String s : a) {
//	        if(!b.contains(s)) {
//	            return false;
//	        }
//	    }
//	    return true;
		return b.containsAll(a);
	}

}













