import java.util.Scanner;

public class AverageOfNumbers {
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number 'n' ");
	int n = input.nextInt();
	int start = 1;
	int average = 0;
	for (int i = 1; i<= n; i ++) {
		start = start +i;
		average = start / n;
	}
	
	System.out.println(average);
}
}
