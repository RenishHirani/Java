import java.util.*;
public class Divisible{

    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N1:- ");
        n1=sc.nextInt();
        System.out.println("Enter N2:- ");
        n2=sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if ((i%2==0) && (i%3!=0)) {
                    System.out.print(" " +i);
                }
            }
        
    }
}
