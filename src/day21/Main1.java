package day21;

public class Main1 {
	public static void main(String[] args) {
		//the entrance of the program
		//1.initialize
		//ClassName instance = new ClassName();
		Student stu = new Student();
		
		//2.use
		//instance.methodName();
//		stu.id = 5;
		stu.setId(5);
//		stu.name = "Jack";
		stu.setName("Jack");
//		stu.age = 18;
		stu.setAge(-18);
//		stu.gender = "male";
		stu.setGender("male");
		
		
		
		stu.study();
		System.out.println(stu.getId());
		
	}
}
