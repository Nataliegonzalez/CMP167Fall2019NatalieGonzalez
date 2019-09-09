import java.util.Scanner;

public class ProductOf4Values {
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter 4 Int Values: ");
	
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();
	int product = num1 * num2 * num3 * num4;
	
	System.out.println("The Product is: " + product);
	
	
	
	
	
	
}
}
