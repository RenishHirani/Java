import java.util.*;
class time{
	private int hh;
	private int mm;

	time(int h,int m){
		hh=h;
		mm=m;
	}
	time(){
		hh=0;
		mm=0;
	}
	public int addtime(time t1){
		time temp=0;
		temp.mm = mm + t1.mm;
        temp.hh = hh + t1.hh;
	}
	public void display(){
	System.out.println(hh+""+mm);
	}
}
class AddTime{
	public static void main(String[] args){
		time t1=new time(1,20);
		time t2=new time(1,20);
        
        time t3 = t1.addtime(t2);
		t3.display();
	}
}