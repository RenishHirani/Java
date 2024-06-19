import java.util.*;
public class Meters{
  public static void main(String[] args) {
  	double meter,feet;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Value in Meters :");
    meter=sc.nextDouble();
    feet = meter * 3.28084;
    System.out.print("Result=> "+feet);
  }
}