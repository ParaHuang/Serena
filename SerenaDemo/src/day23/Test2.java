package day23;

import java.util.HashSet;
import java.util.Objects;

public class Test2 {

	public static void main(String[] args) {
		Square s1 = new Square(10);
//		System.out.println(s1.toString());	//call toString automatically
		Square s2 = new Square(10);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

//		HashSet<Integer> set1 = new HashSet<Integer>();
//		set1.add(new Integer(11));
//		set1.add(new Integer(22));
//		set1.add(new Integer(66));
//		set1.add(new Integer(11));
//		set1.add(new Integer(22));
//		System.out.println(set1.size());
//		
//
		HashSet<Square> set2 = new HashSet<Square>();
		set2.add(new Square(11));
		set2.add(new Square(22));
		set2.add(new Square(66));
		set2.add(new Square(11));
		set2.add(new Square(22));
		System.out.println(set2.size());
		
	}

}

class Square{
	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}



	//once we override hashcode, that's because we want to conside 2 objects have same values as the same object
	@Override
	public int hashCode() {
		return Objects.hash(side);	//get a hash code of a certain content
	}
	
	//compare 2 object, to see if they have exact same content
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return side == other.side;
	}
	
}

//Student	  id,name,gender
//new Student(1, "Jo", "m");    -> 39010
//new Student(1001, "Jo", "b"); -> 39010
//















