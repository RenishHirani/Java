import java.util.*;
public class Temperature{
	public static void main(String[] args){
		double c,f;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Fehrenheit:- ");
		f=sc.nextDouble();

		c=(f-32)*(5)/9;

		System.out.print("Celsius=> "+c);
	}
}