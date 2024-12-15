package day21;

//OOP:object oriented programming

//encapsulation
//inheritance
//polymorphism

//abstraction
public class Main2 {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.breath();
//		a.eat();
//		System.out.println("----------");

		Fish f = new Fish();
		f.breath();
		f.eat();
		f.swim();
		System.out.println("----------");

		Bird b = new Bird();
		b.breath();
		b.eat();
		System.out.println("----------");

		Shark s = new Shark();
		s.breath();
		s.eat();
		s.swim();

	}
}

//inheritance : sub class will inherit members from super class
//class SubClass extends SuperClass{}
abstract class Animal {// SuperClass,ParentClass
	public void breath() {
		System.out.println("Animal is breathing");
	}
	//1.if there is a method,what the body looks like doesn't matter
	// since it never has chance to be used, then we can delete the body
	//2.if a method has no body, then we make it abstract
	//3.if we defined abstract method inside of a class
	// the this class is also abstract
	//4. all the subclass will be forced to override those abstract methods from super class
	public abstract void eat();
}

class Fish extends Animal {// SubClass,ChildClass
	public void swim() {
		System.out.println("Fish can swim");
	}

	// override: Subclass redefine a method which inherit from superclass
	@Override
	public void eat() {
		System.out.println("Fish eat under water");
	}
}

class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("Bird stop flying, then eat on the tree");
	}
}

//class A extends Animal{
//
//	@Override
//	public void eat() {
//		
//	}
//	
//}

class Shark extends Fish {

}

/*
 * //1.the direction of inheritance is 1 way //2.every class can only have 1
 * super class class B extends A{} class C extends A{}
 * 
 * class D extends B{}
 * 
 * D->B->A C->A
 * 
 * 
 */
