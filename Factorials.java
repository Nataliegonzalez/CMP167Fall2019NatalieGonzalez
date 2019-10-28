import java.util.Scanner;

public class Factorials {
public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Choose a number:");
	int num = input.nextInt();
	int start = 1;
	
	for(int i = 1; i <=num; i++) {
	
		start = start*i;
		System.out.println(start);
	}
}
}
