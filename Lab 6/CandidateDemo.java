import java.util.*;
public class CandidateDemo{
    public static void main(String[] args){
    Candidate c1=new Candidate();
    c1.getCandidateDetails();
    c1.displayCandidateDetails();
  }
}

class Candidate{
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    double Candidate_Weight;
    double Candidate_Height;

    Candidate(){
        Candidate_ID=0;
        Candidate_Name=null;
        Candidate_Age=0;
        Candidate_Weight=0.0;
        Candidate_Height=0.0;
    }
    Candidate(int id,String n,int a,float w,float h){
        Candidate_ID=id;
        Candidate_Name=n;
        Candidate_Age=a;
        Candidate_Weight=w;
        Candidate_Height=h; 

    }
    void getCandidateDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id:");
        Candidate_ID=sc.nextInt();
        System.out.print("Enter name:");
        sc.nextLine();
        Candidate_Name=sc.nextLine();
        System.out.print("Enter age:");
        Candidate_Age =sc.nextInt();
        System.out.print("Enter Weight:");
        Candidate_Weight=sc.nextDouble();
        System.out.print("Enter Height:");
        Candidate_Height=sc.nextDouble();
    }
    void displayCandidateDetails(){
        System.out.print("========================="+"\n"+"ID: "+Candidate_ID+"\n"+"name: "+Candidate_Name+"\n"+"Age: "+Candidate_Age+"\n"+"Weight: "+Candidate_Weight+"\n"+"Height: "+Candidate_Height);
    }


 } 
 