import java.util.*;
public class Pattern10{
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N : ");
    n=sc.nextInt(); 
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 - 1; k++) {
        if (k == 0 || k == 2 * i - 2) {
          System.out.print("*");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = (n - i) * 2 - 1; k >= 1; k--) {
        if (k == 1 || k == (n - i) * 2 - 1) {
          System.out.print("*");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}