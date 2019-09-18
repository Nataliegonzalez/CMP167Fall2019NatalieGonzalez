/**
 * 
 * @author Natalie
 *@description This program checks remainders 
 */
import java.util.Scanner; 

public class Unit4Part2 {
	public static void main (String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program checks if a is divisable by b");
		System.out.print("Enter a:");
		a = in.nextInt();
		System.out.print("Enter b:");
		b = in.nextInt();
		
		
		if (a%b == 0) {
			System.out.printf("%d is divisable by %d", a, b);
		
		}else {
			System.out.printf("%d is NOT divisable by %d", a, b);
		}
	}

}
