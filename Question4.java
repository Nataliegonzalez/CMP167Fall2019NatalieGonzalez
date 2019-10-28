import java.util.Scanner;
public class Question4 {
public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("What is your name?");
	String Name = input.next();
	
	System.out.println("What is your pets name?");
	String PetName = input.next();
	int NameLength = PetName.length();
	
	System.out.println(Name +", "+ PetName + " has " +NameLength+ " characters.");
}
}
