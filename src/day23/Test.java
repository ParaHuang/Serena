package day23;

//the entrance of program
public class Test{
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.eat();
		h1.sleep();
		System.out.println();
		
		Student s1 = new Student();
		s1.eat();
		s1.sleep();
		s1.study();
		System.out.println();
		
		UniversityStudent u1 = new UniversityStudent();
		u1.eat();
		u1.sleep();
		u1.study();	//study in dorm
		u1.dating();
		
	}
}

//OOP:Object Oriented Programming
//every class is the SubClass of Object, we don't need to declare that
class Human {
	public void eat() {
		System.out.println("eat.....");
	}
	
	public void sleep() {
		System.out.println("sleep.....");
//		this.eat();
	}
}
//inheritance:Subclass would inherit all the public member from SuperClass
//class SubClass extends SuperClass{}
class Student extends Human{  
	public void study() {
		System.out.println("study....");
	}
}

class UniversityStudent extends Student{
	//method Override:Subclass overwrite the method from SuperClass
	@Override
	public void study() {
		//want to use the study from super class
		//super:in Subclass, when we use super, it refers the object of super class
		super.study();
		System.out.println("univerity student study in dorm");//own solution
	}
	
	public void dating() {
		System.out.println("dating.....");
	}
	
}



























