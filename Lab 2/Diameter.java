import java.util.*;
public class Diameter{
	public static void main(String[] args){
	double diameter,area;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter area of circle: ");
    area=sc.nextDouble();

    diameter = 2 * Math.sqrt(area/3.14);

    System.out.println("Diameter of circle = "+diameter);
    }
}