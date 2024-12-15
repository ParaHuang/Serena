package day18;

public class Main1 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		System.out.println(t1.a+" "+t1.b+" "+t1.c);

		Triangle t2 = new Triangle(3,4,5);
		System.out.println(t2.a+" "+t2.b+" "+t2.c);
		System.out.println(t2.getPerimeter());
		System.out.println(t2.isTriangle());
		
	}

}

class Triangle {
    int a, b, c;
    //to initialize those instance variables
    //overloading
    Triangle() {
    }
    
    Triangle(int aa, int bb, int cc) {
            a = aa;
            b = bb;
            c = cc;
    }
    boolean isTriangle(){
    	return a+b>c  &&   b+c>a && a+c>b;
    }
    boolean isEquilateral() {
            return a == b && b == c;
    }
    
    int getPerimeter() {
            return a + b + c;
    }
    
    int smallestSide() {
    	if(a<b && a<c) return a;
    	if(b<c) return b;
    	return c;
    }
    
    
    //overloading:methods in the same name but with different parameters
    public void a() {
    	System.out.println("hi");
    }
    
    public void a(int x) {
    	System.out.println("hello");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}