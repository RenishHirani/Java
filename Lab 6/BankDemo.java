import java.util.*;
public class BankDemo{
    public static void main(String arg[]){
        Bank_Account b1=new Bank_Account();
        b1.GetAccountDetails();
        b1.DisplayAccountDetails();
    }
}
class Bank_Account{
    int Account_No;
    String User_Name;
    String Email;
    String Account_Type;
    double Account_Balance;

    Bank_Account(){
        Account_No=0;
        User_Name=null;
        Email=null;
        Account_Type="seving";
        Account_Balance=0.0;
    }
    Bank_Account(int b,String n,String e,String at,double ab){
        Account_No=b;
        User_Name=n;
        Email=e;
        Account_Type=at;
        Account_Balance=ab;
    }
    public void GetAccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number:");
        Account_No=sc.nextInt();
        System.out.print("Enter User Name:");
        sc.nextLine();
        User_Name=sc.nextLine();
        System.out.print("Enter Email:");
        Email=sc.nextLine();
        System.out.print("Enter Account Type:");
        Account_Type=sc.nextLine();
        System.out.print("Enter Account Balance:");
        Account_Balance=sc.nextDouble();
    }
    public void DisplayAccountDetails(){
        System.out.println("=========================");
        System.out.println("Account Number:"+Account_No);
        System.out.println("User Name:"+User_Name);
        System.out.println("Email:"+Email);
        System.out.println("Account Type:"+Account_Type);
        System.out.println("Account Balance:"+Account_Balance);
    }

 }

