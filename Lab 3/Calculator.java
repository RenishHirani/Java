import java.util.*;
public class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,d;
		System.out.println("enter first value");
		a=sc.nextInt();
		System.out.println("enter first value");
		b=sc.nextInt();

		System.out.println("Enter +for add, -for sub, *for div, /for div");
		d=sc.next().charAt(0);
		switch(d)
		{
			case '+': c=a+b;
			break;
			case '-': c=a-b;
			break;
			case '*': c=a*b;
			break;
			case '/': c=a/b;
			break;
		}
		System.out.println(""+c);

	}

}