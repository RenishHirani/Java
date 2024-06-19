import java.util.*;
public class Reverse{  
   public static void main(String args[]){
 	int n,count=0,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n:- ");
    n=sc.nextInt();
    while(n!=0)
   	 {
    	count=n%10;
    	sum=sum*10+count;
    	n/=10;
   	 }
   	System.out.print(""+sum);

   }
 } 