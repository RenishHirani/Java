import java.util.Scanner;
public class StudentDemo2{
    public static void main(String arg[]) {
       StudentD s1 = new StudentD();
       s1.GetStudentDetails();
       s1.DisplayStudentDetails();
    }
}

class StudentD{
   long  EnrollMent_No;
   String Name;
   int Semester;
   float CPI;
   float SPI;

   StudentD(){
    EnrollMent_No=101;
    Name=null;
    Semester=1;
    CPI=0;
    SPI=0;
   }
   StudentD(long e,String n,int s,float cpi,float spi){
    EnrollMent_No=e;
    Name=n;
    Semester=s;
    CPI=cpi;
    SPI=spi;
   }
   Scanner sc=new Scanner(System.in);
   public void GetStudentDetails(){
    System.out.print("Enter Enrollment Number:");
    EnrollMent_No=sc.nextLong();
    System.out.print("Enter Name:");
    sc.nextLine();
    Name=sc.nextLine();
    System.out.print("Enter Semester:");
    Semester=sc.nextInt();
    System.out.print("Enter CPI:");
    CPI=sc.nextFloat();
    System.out.print("Enter SPI:");
    SPI=sc.nextFloat();
   }


   public void DisplayStudentDetails(){
    System.out.println("=================================");
    System.out.println("Enrollment Number="+EnrollMent_No);
    System.out.println("Name="+Name);
    System.out.println("Semester="+Semester);
    System.out.println("CPI="+CPI);
    System.out.println("SPI="+SPI);
   }


}