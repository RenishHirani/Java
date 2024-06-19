import java.util.*;
public class Area{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter 1 for Circle -- 2 for Triangle -- 3 for Square"); 
    int n=sc.nextInt();

    area(n);
  }
  public static void area(int n){
    Scanner sc=new Scanner(System.in);
    double Area;

    switch(n){
          case 1:
             System.out.println("Area for Circle");

              System.out.print(" Enter Radius of Circle:");
              int r=sc.nextInt();

              Area=3.14*r*r;
              System.out.println("Area="+Area+ "square unit");
          break;
          case 2:
               System.out.print("Area of Triangle");

                System.out.print(" Enter Height and  base of Triangle=");
                int h=sc.nextInt();
                int b=sc.nextInt();

                Area=(h*b)/2;
                System.out.println("Area="+Area+"square unit");
          break;
          case 3:
                System.out.println("Area for Square");

                System.out.print(" Enter side of square :");
                int s=sc.nextInt();

                Area=s*s;
                System.out.println("Area="+Area+"square unit");
          break;
    }
  }
}