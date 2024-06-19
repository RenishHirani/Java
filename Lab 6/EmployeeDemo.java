import java.util.*;
public class EmployeeDemo {
    public static void main(String arg[]){
    Employee e1=new Employee();
    e1.GetEmployeeDetails();
    e1.DisplayEmpolyeeDetails();
    }
}

class Employee{
    int EmployeeId;
    String Employee_Name;
    String Designation;
    int Age;
    int Salary;

    Employee(){
        EmployeeId=0;
        Employee_Name=null;
        Designation="Developer";
        Age=22;
        Salary=35000;
    }
    Employee(int id,String n,String d,int a,int s){
        EmployeeId=id;
        Employee_Name=n;
        Designation=d;
        Age=a;
        Salary=s;
    }

    public void GetEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id:");
        EmployeeId=sc.nextInt();
        System.out.print("Enter Name:");
        sc.nextLine();
        Employee_Name=sc.nextLine();
        System.out.print("Enter Designation:");
        Designation=sc.nextLine();
        System.out.print("Enter Age:");
        Age=sc.nextInt();
        System.out.print("Enter Salary:");
        Salary=sc.nextInt();
    }
    public void DisplayEmpolyeeDetails(){
        System.out.println("=========================");
        System.out.println("Id="+this.EmployeeId);
        System.out.println("Name="+this.Employee_Name);
        System.out.println("Designation="+this.Designation);
        System.out.println("Age="+this.Age);
        System.out.println("Salary="+this.Salary);
        
    }

    }

