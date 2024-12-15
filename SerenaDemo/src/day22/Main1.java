package day22;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food1 = new Food(100);
		Food food2 = new Food();

		System.out.println(food1.calories);
		System.out.println(food2.calories);
		
		String[] sides = {"3","4","5"};
		Triangle triangle = toTriangle(sides);
		System.out.println(triangle);
	}
	
	public Student getStudent(Object n,Object a,Object g) {
		if(n instanceof String && a instanceof Integer && g instanceof double[]) {
			Student stu = new Student((String)n, (Integer)a, (double[])g);
			return stu;
		}else {
			return null;
		}
	}
	
	public static Triangle toTriangle(String[] args) {
		//args is null
		if(args == null)return null;
		//args doesn't have 3 content
		if(args.length != 3)return null;
		//args has 3 content but some of they are not "number"
		Triangle triangle = new Triangle();
		try {
			for(int i=0 ; i<args.length ; i++) {
				triangle.lengths[i] = Integer.parseInt(args[i]);//might have exception
			}	
			return triangle;
		}catch (NumberFormatException e) {
			return null;
		}
		
	}

}

class Student{
	String name;
	int age;
	double[] grades;
	
	Student(String n,int a,double[] g){
		name = n;
		age = a;
		grades = g;
	}
}


class Triangle{
	int[] lengths;
	public Triangle() {
		lengths = new int[3];
	}
	public Triangle(int a,int b,int c) {
		lengths = new int[3];
		lengths[0] = a;
		lengths[1] = b;
		lengths[2] = c;
	}
}


class Food {
	int calories;	//field, instance variable, attribute
	
	//1.it has no concept about return type
	//2.it's in the same name as class
	//3.the process we have to go through when we create an instance by new
	//4.every class has a default constructor,it has no arguments and no code
	//public Food(){}
	//5.when you start to write your own constructor, then default one disappear
	public Food(){
		System.out.println("no argument");
	}
	
	public Food(int calories){
		System.out.println("1 argument");
		this.calories = calories;
	}
	
	//method overload
	//normal method
	public void cook() {
		
	}
}







