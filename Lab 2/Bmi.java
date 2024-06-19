import java.util.*;
public class Bmi{

    public static void main(String[] args) {
    	double weight,inches,bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        inches = input.nextDouble();

        bmi = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " +bmi);
    }
}
