public class Inheritance{
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.MethodA();
		Triangle t1=new Triangle();
		t1.MethodB();
		Square s1=new Square();
		s1.MethodC();
		
	}
}
class Shape{
	int r=10;
	int l=10;
	int b=10;
	
}
class Circle extends Shape{
	void MethodA(){
		System.out.println("circle area= "+3.4*r*r);
	}
}
class Triangle extends Shape{
	void MethodB(){
		System.out.println("triangle area= "+0.5*l*b);
	}
}
class Square extends Shape{
	void MethodC(){
		System.out.println("squre area= "+l*l);
	}
}