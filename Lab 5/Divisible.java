import java.util.*;
public class Divisible{
	public static void main(String[] args){
	int i,sum=0;
	Scanner sc=new Scanner(System.in);
   	System.out.print("enter the array size: ");
   	int n=sc.nextInt();

   	int a[]= new int[n];

   	for(i=0;i<n;i++){
   		a[i]= sc.nextInt();
    }
    for(i=0;i<n;i++){
    	if(a[i]%3==0 || a[i]%5==0){
    		sum=sum+a[i];
    	}
    }
    System.out.println("Display Sum: "+sum);
   }
}