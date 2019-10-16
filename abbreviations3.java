package review;
import java.util.Scanner;

public class abbreviations3 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println ("Enter The SMS Abbreviation: ");
	String abbreviation = input.nextLine();
	String translation = "";
	abbreviation = abbreviation.toUpperCase();
	if (abbreviation.equals("AAS")) {
		translation = "Alive And Smiling";
	}else
		if (abbreviation.equals("AYK")){
			translation = "As You Know";
		}else
			if (abbreviation.equals("BAU")){
				translation = "Business  As Usual";
			}else {
				translation = "Unknown Abbreviation";
			}
	System.out.println(abbreviation + " means " + translation);
	return;
}
}
