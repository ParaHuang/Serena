package day16;

import java.util.ArrayList;

public class Main2_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hola");
		list.add("你好");
		list.add("hola");
		list.add("你好");
		
		System.out.println(list);
		list.remove("hola");//
		System.out.println(list);
		
	}

}












