import java.util.Scanner;
import java.util.regex.Pattern;
public class PW {
	public static final int PASSWORD_LENGTH = 7;
	  

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Your password must contain at least 1 uppercase letter, 1 lower case letter, have a minimum of 7, a maxiumin of 12 characters, and end in !.");
	
	final int min = 7;

	final int max = 12;
	final int MIN_Uppercase=1;
	final int MIN_Lowercase=1;	
	final int NUM_Digits=1;
	int uppercaseCounter=0;
	int lowercaseCounter=0;
	int digitCounter=0;	
	String s = input.nextLine();

    if (is_Valid_Password(s)) {
        System.out.println("Password is valid: " + s);
    } else {
        System.out.println("Error " + s);
    }
    private static boolean is_Valid_Password(String s
        	if (password.length() < PASSWORD_LENGTH) return false;
    }


    
	
	
	 
	
						
						
				

	


	) {
		// TODO Auto-generated method stub
		return false;
	}
}

	