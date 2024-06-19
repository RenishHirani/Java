import java.util.*;
public class Max{
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a=> ");
		a=sc.nextInt();
		System.out.println("enter the b=> ");
		b=sc.nextInt();
		double ans=max(a,b);
		System.out.println("ans=> "+ans);
	}
	public static int max(int a,int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
}