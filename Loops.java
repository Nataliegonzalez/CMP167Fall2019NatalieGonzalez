/**
 * 
 * @author Natalie G
 *
 */
import java.util.Scanner; 

public class Loops {
	public static void main (String []args ) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter 2 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		System.out.print("Enter a number 'n': ");
		 int n = input.nextInt();
		 int a = 1;
		 
		 for (a = 1; a < n+1; a++)
		 {
			 System.out.println(a);
			 
		 }
		 
		 System.out.println("The squares are: ");
		
		 for (a = 1; a < n+1; a++)
		 {
			 System.out.println(a*a);
			 
		 }
		 int num3 = 1;
		 for (num3 = 1; num3 <=100; num3++ ) {
			 if (num3% 2 == 1)
				 continue;
			 System.out.println(num3++ + "is even");
			
		 }
				
	}
	

}
