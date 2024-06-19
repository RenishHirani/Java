public class MultiLevel{
	public static void main(String[] args) {
		C obj=new C();
		obj.methodA();
		obj.methodB();
		obj.methodC();

	}
}
class A{
	void methodA()
	{
		System.out.println("class A Method");
	}
}
class B extends A{
	void methodB()
	{
		System.out.println("Class B Method");
	}
}
class C extends B{
	void methodC()
	{
		System.out.println("Class C Method");
	}
}