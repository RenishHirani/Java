import java.util.*;
public class Pattern9{ 
	public static void main(String[] args){
 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt(); 
 
for(int i=1;i<=n;i++){
 		for(int j=1;j<=n-i;j++){
			System.out.print(" ");
		}
	if(i==1 || i==n)
		for(int j=1;j<=i*2-1;j++){
			System.out.print("*");
		}
	else{
		for(int j=1;j<=i*2-1;j++){ 
	if(j==1 || j==i*2-1)
		System.out.print("*");
	else
 		System.out.print(" ");
		}
	}
		System.out.println();
 
		} 
	}
}