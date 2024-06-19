import java.util.*;
public class Bill{
public static void main(String[] args)
{
	int n;
	double bill=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no.of calls");
		n=sc.nextInt();

	if (n<=100)
	{
		bill=200;
		System.out.println("bill=> "+bill);
	}

	else if (n<=150)
	{
		bill=(n-100)*0.60+(200);
		System.out.println("bill=> "+bill);
	}

	else if(n<=200)
	{
		bill=(n-150)*0.50+(n-150)*0.60+(200);
		System.out.println("bill=> "+bill);
	}

	else
	{
		bill=(n-200)*0.40+(n-200)*0.50+(n-200)*0.60+(200);
		System.out.println("bill=> "+bill);
	}

  }
}