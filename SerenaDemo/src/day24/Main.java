package day24;

public class Main {

	public static void main(String[] args) {
//		Student stu1 = new Student(20);//calling constructor
//		Student stu2 = new Student(10);//calling constructor
//		Student stu3 = new Student(7);//calling constructor
//		Student stu4 = new Student(9);//calling constructor
		
//		POI p = new School("Street", "Test", "Test");
//		p.address = "Blvd";
//		p.display();
		
		
		
		Human h = new Human();	
		
		School school = new School("Street", "Test", "Test");
		h.walkTo(school);
		
		System.out.println();
		
		Restaurant restaurant = new Restaurant("Blvd", "goody goody", 4, 4);
		h.walkTo(restaurant);
		
	}

}
/*
//class Creature{
//	public Creature() {
//		System.out.println("creating a Creature");
//	}
//}

class Human {
	private int age;
	//Human(){}
	Human(int age){
		System.out.println("creating a human"+age);
	}
}

//the order of calling constructor: automatically calling super constructor -> the constructor of itself
class Student extends Human{
	Student(int age){
		//the first thing is calling the constructor of super class by super(value1,value2,value3);
		//super();	//default way to call
		super(age);
		System.out.println("creating a student");
	}
}
*/

class Human{
	/*
	//methods overloading: methods are in the same name but with different parameters
	void walkTo(School s) {
		//pass a place as parameter
		//"I'm walking to a place" -> place.display();
		System.out.println("I'm walking to a place");
		s.display();
	}
	
	void walkTo(Restaurant r) {
		System.out.println("I'm walking to a place");
		r.display();
	}
	*/
	
	void walkTo(POI p) {
		System.out.println("I'm walking to a place");
		p.display();
	}
	
}

class School extends POI{
	   
    String type; // elementary/middle/high
   
    School(String address, String name, String type) {
        super(address,name);//calling the constructor of super class
        this.type = type;
    }
   
    void display() {
        System.out.println(name);
        System.out.println(address);
        System.out.println("School (" + type + ")");
    }
}

class Restaurant extends POI{
   
    int rating; // 1 to 5
    int expensiveness; // 1 to 5
    String[] reviews;
   
    Restaurant(String address, String name,
            int rating, int expensiveness) {
        super(address,name);
        this.rating = rating;
        this.expensiveness = expensiveness;
    }
 
    void display() {
        System.out.println(name);
        System.out.println(address);
        System.out.println("Restaurant Rating: " + rating);
        System.out.println(getDollarSigns(expensiveness));
    }
   
    // return a String with n dollar signs
    String getDollarSigns(int n) {
        String ret = "";
        for(int i = 0; i < n; i++) {
            ret += "$";
        }
        return ret;
    }
}

//1.if a method has no body, then we declare it as abstract method
//2.if there is an abstract method in a class, then we have to declare this class as abstract
//3.if this abstract class has sub class,then subclass has to override that abstract method
//										or also make subclass as abstract
abstract class POI{
    String address;
    String name;
   
    POI(String address, String name){
        this.address = address;
        this.name = name;
    }
    
    abstract void display();
}







