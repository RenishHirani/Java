import java.util.*;
public class Position{
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the array size: ");
   int n=sc.nextInt();
   System.out.print("enter the num ");
   
   int n1=-1,i=0;
   int a[]= new int[n];
   for(i=0;i<n;i++) {
   a[i]=sc.nextInt();
   }
   System.out.print("enter the serch num: ");
   int b=sc.nextInt();
   for(i=0;i<n;i++)
   {
    if(a[i]==b) 
    {
     n1=i;
    }
    
   }
   if(n1==-1) {
    System.out.print("num is NOT avalible");
    
   }
   else
   {
    System.out.print("index no: "+ n1);
   }
  }
}