import java.util.*;
public class Si{
	public static void main(String[] args) {
		int p,n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the p=> ");
		p=sc.nextInt();
		System.out.println("enter the n=> ");
		n=sc.nextInt();
		System.out.println("enter the r=> ");
		r=sc.nextInt();
		double ans=si(p,n,r);
		System.out.println("ans=> "+ans);
	}
	public static int si(int p,int n,int r){
		return (p*n*r)/100;
	}
}