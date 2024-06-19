import java.util.*;
public class Pattern3{
   public static void main(String[] args){
      int i, j, k, my_input;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the length of a side : ");
      my_input=sc.nextInt();
      System.out.println("The pattern : ");
      for(i = 1; i <= my_input; i++){
         for(k=1; k<=i; k++)
         {
             System.out.print(" ");
         }
         for(j = 1; j <=my_input-i+1; j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}
