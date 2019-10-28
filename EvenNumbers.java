import java.util.Scanner;

public class EvenNumbers {
public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	
	
	System.out.print("Enter a number:");
	int n = input.nextInt();
	
	for (int i = 0; i <= n; i++) {
		if (i % 2==0) {
			int sum = 0;
			sum += i;
			System.out.println(sum);
		}
	}
	
	
}
}
