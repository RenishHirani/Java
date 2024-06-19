import java.util.*;
public class Prime{
	public static void main(String[] args){
		int n,count=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of n:- ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print("no. is prime.");
		}
		else
		{
			System.out.print("no. is not prime.");
		}
	}

}