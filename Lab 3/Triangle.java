import java.util.*;
public class Triangle{
public static void main(String[] args)
{
	int x,y,z;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first side");
		x=sc.nextInt();
	System.out.println("enter Second side");
		y=sc.nextInt();
	System.out.println("enter Third side");
		z=sc.nextInt();

	if (x == y && y == z )
	{
		System.out.println("Equilateral Triangle");
	}

	else if (x == y || y == z || z == x )
	{
		System.out.println("Isosceles Triangle");
	}

	else if((x*x+y*y==z*z) || (y*y+z*z==x*x) || (z*z+x*x==y*y))
	{
		System.out.println("Right-Angle Triangle");
	}

	else
	{
		System.out.println("Scalene Triangle");
	}

  }
}