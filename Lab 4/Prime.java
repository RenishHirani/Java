import java.util.*;
public class Prime{
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n;
   System.out.println("enter the value=> ");
   n=sc.nextInt();
   prime(n);
  
   }
  public static void prime(int n) {
   int i=1,count=0;
  while(i<=n) {
   if(n%i==0) {
    count++;
   }
   i++;
  }
  if(count==2) {
   System.out.print("1");
  }
  else {
   System.out.print("0");
  }
 }
}
