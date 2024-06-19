import java.util.*;
public class Pattern1{
   public static void main(String[] args){
      int i, j, my_input;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the length of a side : ");
      my_input=sc.nextInt();
      System.out.println("The pattern : ");
      for(i = 1; i <= my_input; i++){
         for(j = 1; j <= my_input; j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}