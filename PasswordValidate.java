package Exams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Create a class PassCheck that receives the username, and password 
 * entered by the user. Program checks for the validity of entered 
 * password through making a user defined exception to be thrown if 
 * the user is not entering a valid password. The criteria for a valid 
 * password are:
 * 
•	Password should not contain the username.
•	Password should consist of at least 8 characters.
•	Password should consist of at least 1 capital letter.
•	Password should consist of at least 2 digits.
•	Password should consist of at least 1 special character.
•	Password should consist of small or capital letters, digits 0 to 9, 
    and special characters as !@#$%&*_-~

Sample output for valid password
Enter the user name: 
william
Enter the password: 
#born96Wil

PASSWORD IS VALID.
PassCheck [user=william, pass=#born96Wil]

Sample output for invalid password
Enter the user name: 
james
Enter the password: 
j2009@abc
java.lang.Exception: 
Invalid Password!!!

 */

interface passcheck1 {	

	abstract void passckeck(String name, String pass);	
}

class validepass1 implements passcheck{
	String name;
	String pass;
	Pattern digit = Pattern.compile("^(?=.*[0-9]).+$");
	Pattern upper = Pattern.compile("^(?=.*[A-Z]).+$");
	Pattern lower = Pattern.compile("^(?=.*[a-z]).+$");
	Pattern special = Pattern.compile ("^(?=.*[!@#$%&*_-~]).+$");
	Pattern regex = Pattern.compile("^(?=.*(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[-+_!@{}#\\[\\]$\\(\\)%^'&*\\=.,\"\\;?])).+$");
	
	// "^(?=.*(?=.*[-+_!@{}#\\[\\]$\\(\\)%^'&*\\=.,\"\\;?0-9a-zA-Z])).+$"

	public void passckeck(String name, String pass) {

		this.name = name;
		this.pass = pass;

	}
	public void passwordcheck() {

		Matcher hasUpper = upper.matcher(this.pass);
		Matcher hasLower = lower.matcher(this.pass);
		Matcher hasSpecial = special.matcher(this.pass);
		Matcher hasRegex = regex.matcher(this.pass);
		int numbCount = 0;

		try {
			for (int i = 0, j = 0, k = 1; i < this.pass.length(); i++, j++, k++) {  

				hasRegex = digit.matcher(this.pass.substring(j, k));

				if (hasRegex.matches()) {  
					numbCount++;						
				}						
			}
			if (numbCount <= 1)
				throw new PasswordException1();

			else if(this.pass.contains(this.name))
				throw new PasswordException1();

			else if (this.pass.length() < 8)
				throw new PasswordException1();

			else if(!(hasRegex.matches()))
				throw new PasswordException1();

			else if(!(hasRegex.matches()))
				throw new PasswordException1();

			else if(!(hasRegex.matches()))
				throw new PasswordException1();
			
			else {
				System.out.println("PASSWORD IS VALID. \nPassCheck [user = " 
						+ this.name + ", password = " + this.pass + "]\n");
			}

		} catch (PasswordException1 e) {
			System.out.println(e);
		}
	}
}

class PasswordException1 extends Exception { 

	private static final long serialVersionUID = 1L;

	public String toString() {
		return ("PasswordException. \nInvalid Password!!!\n");
	} 
}

public class PasswordValidate {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		String name;
		String pass;
		validepass1 validate = new validepass1();
		int cont = 0;

		while (true){

			System.out.println("Welcome. \nTo continue press 1, for exit press 2.");
			cont = myScanner.nextInt();

			if (cont == 1) {

				System.out.println("Please enter user name:");
				name = myScanner.next();
				System.out.println("Please enter the password:");
				pass = myScanner.next();
				validate.passckeck(name, pass);
				validate.passwordcheck();
			}
			else {
				myScanner.close();
				System.exit(0);
			}
		}
	}
}
