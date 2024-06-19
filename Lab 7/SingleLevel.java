public class SingleLevel{
	public static void main(String[] args) {
		B obj=new B();
		obj.methodA();
		obj.methodB();

	}
}

class A{
	void methodA()
	{
		System.out.println(" Base class");
	}
}

class B extends A{
	void methodB()
	{
		System.out.println(" Child class");

	}
}