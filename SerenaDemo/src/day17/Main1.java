package day17;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		String str = "catiiiicatoooocatxxxxdogmmmdogmmmmm";
		
		String[] ary1 = str.split("cat");		//when the thing you split by in the begining, you'll get an empty string
		String[] ary2 = str.split("dog");		//when the thing you split by in the end, you wont get an empty ending string

		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary2));

		System.out.println(ary1.length);
		System.out.println(ary2.length);
		//as long as it's not in the end
		//then real count = length - 1
		int cat = ary1.length;
		int dog = ary2.length;
		if(!str.endsWith("cat")){
			//to see if str is end with something
			cat--;
		}

		if(!str.endsWith("dog")){
			//to see if str is end with something
			dog--;
		}
		
		
		int diff = cat-dog;
		System.out.println("difference:"+diff);
		
		
		
		
	}

}
