import java.util.*;
public class Perecentage{
	public static void main(String[] args){
		double sub1,sub2,sub3,sub4,sub5,per,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sub1 marks:- ");
		sub1=sc.nextDouble();
		System.out.println("enter the sub2 marks:- ");
		sub2=sc.nextDouble();
		System.out.println("enter the sub3 marks:- ");
		sub3=sc.nextDouble();
		System.out.println("enter the sub4 marks:- ");
		sub4=sc.nextDouble();
		System.out.println("enter the sub5 marks:- ");
		sub5=sc.nextDouble();
		total=sub1+sub2+sub3+sub4+sub5;
		per=(total/500)*100;
		System.out.println("Perecentage=> "+per);
		if(per<=35)
		{
			System.out.println("Fail");
		}
		else if(per<=45)
		{
			System.out.println("Pass Class");
		}
		else if(per<=60)
		{
			System.out.println("Second Class");
		}
		else if(per<=70)
		{
			System.out.println("First Class");
		}
		else
		{
			System.out.println("Distinction Class");
		}


	}
}