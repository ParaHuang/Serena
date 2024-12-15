package day16;

import java.util.ArrayList;

//1.需要存储多个数据
//2.数据会变多或减少
public class Main1_ArrayList {

	public static void main(String[] args) {
		//基础数据类型，引用数据类型
		//		8大基础数据类型（primitive type）		--   	包装类
		//		int											Integer
		//		double										Double
		
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		//1.添加
		//往list末尾添加数据
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		//往list中间插入数据
		list.add(0, 88);//队首
		list.add(4,99);//中间
		list.add(7, 77);//队尾
		//新增数据的位置范围：0～长度
		list.add(22);
		
		System.out.println(list);
		//2.获取
		//单个获取
		int x = list.get(2);
		System.out.println(x);
		//统一操作
		//关心位置
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i+"----"+list.get(i));
		}
		System.out.println();
		//不关心位置
		for(int a:list) {
			System.out.println(a);
		}
		
		//3.删除
		//指定位置删除,返回具体被删除的数据,注意下标越界的问题
		int y = list.remove(3);	
		System.out.println("删除第3个位置上的数据，发现"+y+"没了");
		System.out.println(list);
		
		//指定对象删除，只会删除第一个遇到的数据
		boolean z = list.remove((Integer)55);
		System.out.println(z);
		System.out.println(list);
		
		//4.查找位置
		//获取指定数据第一次出现的位置，不存在就返回-1
		int index = list.indexOf(22);
		System.out.println(index);
		//获取指定数据最后一次出现的位置，不存在就返回-1
		int lastIndex = list.lastIndexOf(22);
		System.out.println(lastIndex);
		
		//5.是否包含具体数据
		boolean f = list.contains(66);
		System.out.println(f);
	}

}












