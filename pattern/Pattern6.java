import java.util.Scanner;
public class Pattern6{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please provide number of rows to print... ");
	int my_input = scanner.nextInt();

	for (int i=1; i<=my_input; i++){
		for (int j=my_input; j>i; j--){
			System.out.print(" ");
		}
		for (int k=1; k<=(i * 2) -1; k++){
			System.out.print("*");
		}
	System.out.println();
}
	for (int i=my_input-1; i>=1; i--){
		for (int j=my_input-1; j>=i; j--){
			System.out.print(" ");
		}
		for (int k=1; k<=(i*2)-1; k++){
			System.out.print("*");
		}
	System.out.println();
}
}
}