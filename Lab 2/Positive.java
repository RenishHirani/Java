import java.util.*;
public class Positive{
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of n:- ");
		n=sc.nextInt();
		if(n>=0)
		{
			System.out.print("no. is positive.");
		}
		else
		{
			System.out.print("no. is Negative.");
		}
	}

}