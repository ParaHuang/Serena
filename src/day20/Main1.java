package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main1 {

	public static void main(String[] args) {
		/*
		 Array
		 
		 Collection									Map
		 	|										|
-----------------------------						HashMap
|		 	|				|						LinkedHashMap
Queue  		List			Set							TreeMap
|		 	|				|
LinkedList	ArrayList		HashSet
		 	LinkedList		LinkedHashSet
		 	Vector			TreeSet
		 	Stack	
		 */
		
//		List<Integer> list = new ArrayList<Integer>();
		
		//ArrayList: query faster		list.get(i)
		//LinkedList: insert,delete faster
		
//		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
		//can't remove , can't add new element
		List<Integer> list = Arrays.asList(11,22,33,55,33,88,33,44);
		
		System.out.println(list.contains(22));
		System.out.println(list.indexOf(33));
		System.out.println(list.lastIndexOf(33));
		System.out.println(list.indexOf(33) == list.lastIndexOf(33));
		System.out.println(list);
		List<Integer> subList = list.subList(2, 5);
		System.out.println(subList);
		
		String str = "hello world tomorrow";
		//find the second 'o'
		System.out.println(str.indexOf("o",str.indexOf("o") + 1));
		
		//FILO:  first in , last out
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(22);
		stack.push(44);
		stack.push(55);
		stack.push(66);
		stack.push(33);
		stack.push(11);
		System.out.println(stack);
//		for(int i=0 ; i<stack.size() ; i++) {
//			System.out.println(stack.get(i));
//		}
		//pop
		int v1 = stack.pop();	//pop the top element out, so 11 left the stack
		System.out.println(v1+ " just poped out");
		System.out.println(stack);
		
		int v2 = stack.peek();	//have a look of the top element
		System.out.println(v2+ " is on the top");
		System.out.println(stack);
		
		//FIFO
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(11);
		queue.add(44);
		queue.add(22);
		queue.add(77);
		queue.add(22);
		System.out.println();
		System.out.println(queue);	
		queue.poll();queue.poll();	//poll the first one out of queue
		System.out.println(queue);
		
		
		
		
		
		
		
	}

}







