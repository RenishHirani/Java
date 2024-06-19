import java.util.*;
public class Letter {
  public static void main(String[] args) {
    char ch;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Character : ");
    ch = input.next().charAt(0);
    switch (ch){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
      System.out.print(ch + " is vowel");
      break;
    default:
      System.out.print(ch + " is consonants");
    }
  }
}