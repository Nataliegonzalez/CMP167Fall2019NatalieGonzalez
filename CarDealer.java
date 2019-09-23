/**
 * 
 * @author Natalie
 * 
 * 
 *
 */

import java.util.Scanner;

public class CarDealer {
	public static void main(String[]args) {
		
		
		String answer;
		int creditScore , age;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello I am a Car Dealer,\nDo you want to buy a car?");
		
		answer = input.next();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("OK, let me show you what I have!");
			System.out.println("Wait, What is your age?");
			age = input.nextInt();
			if (age>= 25 ) { 
				System.out.println("OK, Great!");
				System.out.print("What Model Do You Want?");
				String answer1 = input.next();
				checkModel(answer1);
				
			}else 
				System.out.println("Sorry, I cannot sell you a car.");
			
		}else {
			System.out.println("OK, You Can Come Back At Another Time");
			
		}
	}
	
	
	public static void checkModel(String model) {
		switch(model) {
		case "Ferrari_488_GTB":
			System.out.println(" Thats $262,647.00");
			break;
			
		case "2018_Ferrari_California":
			System.out.println("$202,723.00");
			break;
			
		case "Lambo_Urus":
			System.out.println("$200,000.00");
		
		default:
			System.out.println("Please Come Back Later, They're Out Of Stock");
		
		
	}
}
}

