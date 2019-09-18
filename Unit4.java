/**
 * 
 * @author Natalie
 *
 */
import java.util.Scanner; 
public class Unit4 {
	public static void main (String[] args) {
		//write a program that will ask the user for their age7 display a greeting that is appropriate
		Scanner in = new Scanner(System.in);
		
		int age;
		String name;
		
		
		System.out.println("Enter your Name: ");
		name = in.nextLine();
		System.out.printf("OK %s enter your age: ", name);
		age = in.nextInt();
		
		if (age<=18 )  // curly brackets with more than one statement 
			System.out.println("Whats up!");
		else if (age<35); 
			System.out.println("Greetings");
	}

}
