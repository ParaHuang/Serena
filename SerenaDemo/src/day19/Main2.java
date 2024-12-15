package day19;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(33);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(99);
		
		//具体整数->int
//		list.remove(3);	//按index移除
		list.remove((Integer)66);//直接移除具体的对象，如果范型指定的是Integer，那么移除对象时具体的整数要做转型
		System.out.println(list);
	}

}
