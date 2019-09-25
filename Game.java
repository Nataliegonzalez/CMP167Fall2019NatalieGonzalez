/**
 * 
 * 
 * @author Natalie
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Game {
	
public static void main(String[]args) {
	
	double budget = 99.99;
	double ticketCost = 1.45;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("LottoGame is a cool game for you to play");
	System.out.printf("You have a budget if $%.2f to spend\n", budget );
	
	System.out.println("Will you like to play?");
	String answer = in.next();
	while(answer.equalsIgnoreCase("yes")) {
		if (budget >= ticketCost) {
			budget = budget - ticketCost;
			
			if (play()) {
				System.out.printf("You WON $%.2f%n", ticketCost*2);
				budget += ticketCost*2;
			}else {
				System.out.println("You lost");
			}
			
			System.out.printf("You have$%.2f to spend\n", budget);
		}
		else {
			System.out.println("Not Enough Money, Come Back At Another Time");
			break;
		}
		System.out.println("Awsome would you like to play again? Yes/No");
		answer = in.next();
	}
	System.out.println("OK, Come Back Soon!");
}

public static boolean play() {
	Random rGen = new Random();
	int num = rGen.nextInt(2);
	
	return (num>0)?true:false;

	
	
	
	
}
}
