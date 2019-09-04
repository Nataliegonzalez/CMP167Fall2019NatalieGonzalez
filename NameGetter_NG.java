
/** 
 * 
 * @author Natalie 
 * description:
 * created:
 *
 */
import java.util.Scanner; 
public class NameGetter {
	// main method 
	// the program starts at the main method 
public static void main(String[] args) {
	// create scanner object
	Scanner input = new Scanner(System.in);
	//prompt user for an input 
	System.out.println ("Enter Your Full Name: ");
	// waits for user to input 
	// and grabs it, then stores in variable 
	String fname = input.next();
	String lname = input.next();
	//reply to user 
	System.out.println("Thank you, " + fname);
	System.out.println("Oh your last name is " + lname + "!!");
	
	
}
}
