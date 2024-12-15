package day20;

import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		String str = "hello world, Sunday, sunny day";
		//how many different letters in this sentence?
		Set<Character> set = new HashSet<>();//save letters   set.add(letter)
//		for(int i=0 ; i<str.length() ; i++) {
//			char c = str.charAt(i);
//			set.add(c);
//		}
		
		char[] cs = str.toCharArray();		//['h','e','l','l','o'.....]
//		for(int i=0 ; i<cs.length ; i++) {
//			set.add(cs[i]);
//		}
		for(char c:cs) {
			set.add(c);
		}
		
		
		System.out.println(str.length());
		System.out.println(set.size() + " different letters in this sentence");
	}

}







