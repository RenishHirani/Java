import java.util.*;
public class Febonacci{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n=> ");
		n=sc.nextInt();
		febo(n);
		sc.close();
	}
	public static void febo(int n){
		int n1=0,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		for(i=2;i<n;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}