import java.math.*;
import java.util.Scanner;

public class QuadraticFormula {
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	double x = input.nextInt();
	double y = input.nextInt();
	double z = input.nextInt();
	double numerator = -1 * y + Math.sqrt(Math.pow(y, 3)-4*x*z);
	double denominator = 2*x;
	double result = numerator/ denominator;
}
}
