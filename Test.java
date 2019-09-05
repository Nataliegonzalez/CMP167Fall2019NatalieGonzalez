/**
 * 
 * @author Natalie
 *
 */
import java.util.Random;
public class Test {
	public static void main (String[] args){
		Random randGen;
		int num;
		int num2;
		
		
		randGen = new Random ();
		num = randGen.nextInt(15) + 1; // generates a random number 1-15
		num2 = 14;
		
		System.out.print(" the number of today is ...  ");
		System.out.println(num);
		
		if (num==num2) 
			System.out.println(" its a match!!");
		else 
			System.out.println(" its not a match");
		}
		
		
	}		
				
				
				
				
	

