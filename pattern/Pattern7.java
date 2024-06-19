import java.util.Scanner;
public class Pattern7{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Please provide number of rows to print... ");
	int my_input = sc.nextInt();

	for (int i = 1; i <= my_input; i++){
			for (int j = 1; j < i; j++){
					System.out.print(" ");
				}
			for (int k = i; k <= my_input; k++){
					System.out.print("* ");
				}
	System.out.println();
}
	for (int i = my_input-1; i >= 1; i--){
			for (int j = 1; j < i; j++){
					System.out.print(" ");
				}
			for (int k = i; k <= my_input; k++){
					System.out.print("* ");
				}
	System.out.println();
}
}
}