package day21;

//encapsulation:1.make fields private, make methods public 2.accessing private fields by public methods(getters and setter)
public class Student {
	//fields/attributes/instance variable/member variable
	//for fields, they have default value;int-0  double-0.0 boolean-false String-null
	private int id;
	private String name;
	private int age;
	private String gender;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<120) {
			this.age = age;
		}else {
			System.out.println(age+" is a invalid age for student");
		}
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//methods/functions/member methods
	public void study() {
		System.out.println(name+" is studying,this student is "+age+" years old");
	}
	
}
