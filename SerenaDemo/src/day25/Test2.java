package day25;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Jack", "teacher");
		map.put("Tom", "teacher");
		map.put("Lucy", "Lucy");
		map.put("Jo", "teacher");
		map.put("Alex", "teacher");
		map.put("Jane", "Jane");
		
		System.out.println(map);
		
		
		
		removeEqualEntries(map, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// define a comparing rule
				return o1.compareTo(o2);//o1>o2 , position
			}
		});
		
		System.out.println(map);
	}

	public static void removeEqualEntries(Map<String, String> map,
		                        Comparator<String> equalsChecker) {
	    Iterator<String> keyIter = map.keySet().iterator();
	   
	    //what I wrote:
	    while(keyIter.hasNext()){//check if it has a next value
	    	String key = keyIter.next();//get the next value
	    	String value = map.get(key);
		    if(equalsChecker.compare(key, value) == 0) {
		    	keyIter.remove();//remove the current key
		    }
	    }
	    
	   
	}
}
