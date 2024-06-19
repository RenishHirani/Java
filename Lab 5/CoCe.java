import java.util.*;
public class CoCe{
  public static void main(String[] args) {
   int n,i;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the array element: ");
   n=sc.nextInt();
   int a[]=new int[n];
   
   int even=0,odd=0;
      for(i=0;i<n;i++) 
        {
           a[i]= sc.nextInt();
        } 
      for(i=0;i<n;i++)
         {
    if(a[i]%2==0){
     even++;
    }
    else{
     odd++;
    }
   }
   System.out.println("number of even:"+even);
   System.out.print("number of odd:"+odd);
 } 
}