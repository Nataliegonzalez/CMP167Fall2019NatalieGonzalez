/**
 * 
 * @author Natalie
 *
 */

import java.util.Scanner;


public class Unit3P2 {
	public static void main(String[] args) {
		String myWords = "Hello Sara 23";
		Scanner inStream = new Scanner(myWords);
		
		String greeting = inStream.next();
		String name = inStream.next();
		int age = inStream.nextInt();
		
	
	
		System.out.printf("%s, The age of %s is %d",greeting, name, age);
		
		
		


}
}