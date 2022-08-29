package Exception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Create a class Student with attributes roll no, name, 
 * age, and course. Initialize values through a parameterized 
 * constructor. If the age of the student is not between 15 
 * and 21 then generate user-defined exception 
 * "AgeNotWithinRangeException". If a name contains numbers 
 * or special symbols raise the exception "NameNotValidException". 
 * You may define the two exception classes.
 */
class student {
	int rollNo;
	String name;
	int age;
	String course;

	student() {		
	}

	void students(int rollNo, String name, int age, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;

		System.out.println("\nStudent information. \nRoll No.: " + this.rollNo + " \nName: " + this.name
				+ "\nAge: " + this.age + "\nCourse: " + this.course + "\n");
	}	
}

class validateage {

	validateage() {
	}

	boolean validateages(int age) {

		if (age < 15 || age > 21)
			return true;
		else
			return false;
	}
}
class validatename {
	Pattern digit = Pattern.compile("^(?=.*[0-9]).+$");
	Pattern special = Pattern.compile ("^(?=.*(?=.*[-+_!@{}#\\[\\]$\\(\\)%^'&*\\=.,\"\\;?])).+$");

	validatename() {
	}

	int validatenames(String name) {

		Matcher hasDigit = digit.matcher(name);
		Matcher hasSpecial = special.matcher(name);

		if(hasDigit.matches())
			return 1;

		else if (hasSpecial.matches())
			return 2;
		else
			return 0;

	}
}

class NameNotValidException extends Exception { 

	private static final long serialVersionUID = -7286705055762432823L;

	NameNotValidException(String errorMessage) {
		super(errorMessage);
	}
}

class AgeNotWithinRangeException extends Exception { 

	private static final long serialVersionUID = -2369739687921238600L;

	AgeNotWithinRangeException(String errorMessage) {
		super(errorMessage);
	}
}

public class AgeNameException {

	public static void main(String[] args) throws NameNotValidException, AgeNotWithinRangeException {
		Scanner myScanner = new Scanner(System.in);
		
		int rollNo;
		String name = "";
		int age = 0;
		String course;
		boolean loop = true;
		
		validatename valname = new validatename();
		validateage valage = new validateage();
		student s = new student();

		while(true) {
			System.out.println("Please enter the following information for the student.");

			System.out.print("Student roll number: ");
			rollNo = myScanner.nextInt();

			while(loop) {
				
				try {				
				System.out.print("Student name: ");

					name = myScanner.next();

					if (valname.validatenames(name) == 1)
						throw new NameNotValidException ("Can't have digits within the name. Try again");

					else if (valname.validatenames(name) == 2)
						throw new NameNotValidException ("Can't have special character within the name. Try again");
					else
						loop = false;
				}catch (Exception e) {
					System.out.println(e);
				}
			}
			loop = true;
			while(loop) {
				
				try {
				System.out.print("Student age: ");

					age = myScanner.nextInt();

					if (valage.validateages(age))
						throw new AgeNotWithinRangeException("Age must be between 15 and 21. Try again");
					else
						loop = false;
					
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			loop = true;
			System.out.print("Student course: ");
			course = myScanner.next();
			
			s.students(rollNo, name, age, course);
		}
	}
}
