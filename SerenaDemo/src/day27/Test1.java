package day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
//		List<Integer> immutableList = List.of(44,33,88,11,99,22,33);
//		List<Integer> mutableList = new ArrayList<Integer>();
//		List<String> immutableList = List.of("hello","hey","mike","Mike","20","alex","Alex");
//		List<String> mutableList = new ArrayList<String>();
		
		

		List<Student> immutableList = List.of(
				new Student("Alex","Wang",98),
				new Student("Julia","Smith",87),
				new Student("Nox","Jackson",67),
				new Student("Noa","Jackson",67),
				new Student("James","Lex",89),
				new Student("Lucy","Lee",89)
				);
		List<Student> mutableList = new ArrayList<Student>();
		
		mutableList.addAll(immutableList);
		
		System.out.println(mutableList);
		Collections.sort(mutableList);
		System.out.println(mutableList);
		
		
//		System.out.println(new Student(null, null, 0));
		
		String[] words = {"hello","hey","power","hola","Mike","Jhon","whatever","Lucy","chair","hi","Jo"};
		System.out.println(wordsByLength(words));
		
	}
	
	public static Map<Integer, List<String>> wordsByLength(String[] words) {
		//words: 			hello,hey,power,hola,Mike,Jhon,whatever,Lucy,chair,hi,Jo
		
		//map:		key				value
		//			2				hi,Jo
		//			3				hey
		//			4				hola,Mike,Jhon,Lucy
		//			5				hello,power,chair
		//			8				whatever
		Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>();
		for(String e:words) {
			int len = e.length();
			List<String> values =  map.get(len);
			if(values == null) {
				values = new ArrayList<String>();
			}
			values.add(e);
			map.put(len, values);
		}
		
		return map;
	}
	

}

class Student implements Comparable<Student>{
    String firstname;
    String lastname;
    int grade;
    
	public Student(String firstname, String lastname, int grade) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.grade = grade;
	}



	@Override
	public int compareTo(Student o) {
		// define the rule of comparing
		// do the operation between this and o , then it's ascending , between o and this->descending
//		this -- o  
//		return this.grade - o.grade;  //ascending
//		return o.grade - this.grade;  //descending
		int reuslt1 = o.grade - this.grade;
		if(reuslt1 == 0) {
//			then compare last name , return the result of the comparation between last names
//			return this.lastname.compareTo(o.lastname);
			int result2 = this.lastname.compareTo(o.lastname);
			if(result2 == 0) {
				//compare first name
				return this.firstname.compareTo(o.firstname);
			}else {
				return result2;
			}
		}else {
			return reuslt1;
		}
	}
	
	@Override
	public String toString() {
		return grade+"--"+lastname+"--"+firstname;
	}
}












