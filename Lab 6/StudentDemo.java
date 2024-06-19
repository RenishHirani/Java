public class TestStudent{
    public static void main(String arg[]){
        Student s1=new Student(430,"kishan",'M',80);
        s1.display();
        Student s2=new Student();
        s2.display();
        }
}

class Student{
    long envNo;
    String name;    
    char gender;
    int mark;
    static int count=0;
    
    Student() {
         envNo = 0;
         name = null;
         gender ='M';
         mark = 0;
         count++;
    }
    Student(int e,String n,char g,int m){
        name=n;
        envNo=e;
        gender=g;
        mark=m;
        count++;
    }

    public void display(){
        System.out.println("========================="+"\n"+envNo+" "+name+" "+gender+" "+mark+" "+count);
    }
}