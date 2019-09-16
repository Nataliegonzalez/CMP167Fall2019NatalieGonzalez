/**
 * 
 * @author Natalie
 *
 */
import java.util.Random;

public class ExampleRandom {
	public static void main(String[]args) {
		Random randGen = new Random();
		int ranNum = randGen.nextInt(10);
		
		double num1 = Math.sqrt(9.0); // 3.0
		double division = 8.0/4.0;
		//System.out.println (Math.PI);
		
		// other way to get random number without importing random
		int randNum2 = (int)(Math.random()*10); // number from 0-9 not including 10
		System.out.println(randNum2);
		
		
		double num3 = 5/(double)2;
		System.out.println(num3);
	}

}
