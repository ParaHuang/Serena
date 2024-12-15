package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LineUp {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		//			   0 1 2 3 4
		String line = "4 6 2 3 1 7 5";
		//1:4
		//2:623
		//3:1
		//4:75
		//新= 4+2+3+1
		int result = parse(line);
		System.out.println(result);
		
		//01
		//326475
		 */
		Scanner scanner = new Scanner(new File("lineup.txt"));
		for(int i=1 ; i<=15 ; i++) {
			String line = scanner.nextLine();
			int result = parse(line);
			System.out.println(i+". "+result);
		}
		
	}

	private static int parse(String line) {
		int result = 0;
		//1.有几个数字，分别存储（ArrayList）
		String[] ary = line.split(" ");
		//{4,6,2,3,1,7,5}
		//ary[0]<->ary[4]
		//ary[1]<->ary[3]
		//ary[2]<->ary[2]
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(String x:ary) {
			list.add(Integer.parseInt(x));
		}
		
		//2.从1到N依次弹出
		for(int i=1 ; i<=ary.length ; i++) {
			//2_1.找到目标数据的位置
			int index = list.indexOf(i);
			if(index!=0) {
				//2_2.求和（分3种情况:1.为0，不管    2.偶数，直接相加    3.奇数：加上index+1）
				result+=index;
				if(index%2!=0) {
					result++;
				}
				//2_3.反转指定范围内的数据
				swap(index,list);
			}
			
			//2_4.弹出/移除第一个数据
			list.remove(0);
		}
		
		return result;
	}

	private static void swap(int index, ArrayList<Integer> list) {
		//index：4					index: 3	
		//首		尾					首		尾
		//0		4					0		3
		//1		3					1		2
		//2		2					
		//i		index-i
		//0  1  2  3  4
		for(int i=0 ; i<=index/2 ; i++) {
			int start = list.get(i);
			int end = list.get(index-i);
			list.set(i, end);
			list.set(index-i, start);
		}
	}

}











