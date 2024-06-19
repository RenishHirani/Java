import java.util.*;
public class Gcd{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter value of x=");
    int x=sc.nextInt();
    System.out.print("Enter value of y=");
    int y=sc.nextInt();

    gcd(x,y);
  }
  public static void gcd(int x,int y){
    int gcd=1;
    for (int i=1;i<=x && i<=y;i++)
    {
      if(x%i==0 && y%i==0)
      {
        gcd=i;
      }
    }
    System.out.println("GCD="+gcd);
  }
}
