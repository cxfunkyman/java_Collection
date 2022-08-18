package Exams;

import java.util.Scanner;

/*
 * WAP to create 2 interfaces: Organize and Calculate. 
 * Organize interface has an abstract method, “sort”, 
 * accepting a String array as parameter; and returning 
 * a String array as well. Calculate interface has an 
 * abstract method, “calculate”, accepting an integer 
 * array as parameter; and returning just an integer value. 
 * You also need to create 2 classes: Company A and Company B; 
 * both implementing Organize and Calculate interfaces. Both 
 * classes have attributes (all array type) as name, age, 
 * and salary for corresponding employees.

To accept all information, create a driver class and then 
using both interfaces and their methods find out the employee 
with highest salary from Company A and youngest employee from 
Company B. Also show: the sorted list of employees from Company A 
in ascending order based on their name, and: the sorted list of 
employees from Company B in descending order based on their salary.

Sample output:

Info. for Company A
--------------------
paul has the highest salary.
Sorted list in ascending order based on name:
albert 34 years old,bob 23 years old,paul 25 years old,zoya 42 years old,

Info. for Company B
--------------------
alfred is the youngest.
Sorted list in descending order based on salary:
alfred with 6800 salary,david with 4300 salary,george with 3160 salary,queen with 2500 salary
 */

interface Organize {
	String[] sort(String name0, String name1, String name2, String name3);
}
interface Calculate {
	int[] calculate(int numb0, int numb1, int numb2, int numb3);
}

class companyA implements Organize, Calculate{
	String[] sortingA = new String[4];
	int[] calAgeA = new int[4];
	int[] calSalA = new int [4];
	String nameA;

	public String[] sort(String name0, String name1, String name2, String name3) {
		this.sortingA[0] = name0;
		this.sortingA[1] = name1;
		this.sortingA[2] = name2;
		this.sortingA[3] = name3;

		return this.sortingA;
	}
	public int[] calculate(int numb0, int numb1, int numb2, int numb3) {
		this.calAgeA[0] = numb0;
		this.calAgeA[1] = numb1;
		this.calAgeA[2] = numb2;
		this.calAgeA[3] = numb3;

		return this.calAgeA;
	}
	public int[] salary(int numb0, int numb1, int numb2, int numb3) {
		this.calSalA[0] = numb0;
		this.calSalA[1] = numb1;
		this.calSalA[2] = numb2;
		this.calSalA[3] = numb3;

		return this.calSalA;
	}
	
	public void sortA() {
		boolean secretProperty = false;
		
		while (!secretProperty) {
			
			secretProperty = true;
			
			for (int i = 0; i < (sortingA.length - 1); i++) {
				
				if (sortingA[i].compareToIgnoreCase(sortingA[i + 1]) > 0) {
					String temp = sortingA[i];
					int temp2 = calAgeA[i];
					int temp3 = calSalA[i];
					sortingA[i] = sortingA[i + 1];
					calAgeA[i] = calAgeA[i + 1];
					calSalA[i] = calSalA[i + 1];
					sortingA[i + 1] = temp;
					calAgeA[i + 1] = temp2;
					calSalA[i + 1] = temp3;
					secretProperty = false;
				}
			}
		}
	}
	public String salaryA() {

		int maxsalary = 0;

		maxsalary = calSalA[0];

		for (int i = 1; i < calSalA.length; i++) {

			if (maxsalary < calSalA[i]) {
				maxsalary = calSalA[i];
				nameA = sortingA[i];
			}
		}

		return nameA;

	}
	public void displayA() {
		System.out.println("\nInfo. for Company A" + "\n------------------------\n" + nameA 
		+ " has the highest salary. \nSorted list in ascending order based on name: ");

		for (int i = 0; i < sortingA.length; i++) {
			System.out.print(sortingA[i] + " " + calAgeA[i] + " years old, ");			
		}	
		System.out.println();
	}
}
class companyB implements Organize, Calculate {
	String[] sortingB = new String[4];
	int[] calAgeB = new int[4];
	int[] calSalB = new int [4];
	int calculate;
	String nameB;
	int minage;

	public String[] sort(String name0, String name1, String name2, String name3) {
		this.sortingB[0] = name0;
		this.sortingB[1] = name1;
		this.sortingB[2] = name2;
		this.sortingB[3] = name3;

		return this.sortingB;
	}
	public int[] calculate(int numb0, int numb1, int numb2, int numb3) {
		this.calAgeB[0] = numb0;
		this.calAgeB[1] = numb1;
		this.calAgeB[2] = numb2;
		this.calAgeB[3] = numb3;

		return this.calAgeB;
	}
	public int[] salary(int numb0, int numb1, int numb2, int numb3) {
		this.calSalB[0] = numb0;
		this.calSalB[1] = numb1;
		this.calSalB[2] = numb2;
		this.calSalB[3] = numb3;

		return this.calSalB;
	}
	public void sortB() {
		boolean secretProperty = false;
		
		while (!secretProperty) {
			
			secretProperty = true;
			
			for (int i = 0; i < (sortingB.length - 1); i++) {
				
				if (calSalB[i] < calSalB[i + 1]) {
					String temp = sortingB[i];
					int temp2 = calAgeB[i];
					int temp3 = calSalB[i];
					sortingB[i] = sortingB[i + 1];
					calSalB[i] = calAgeB[i + 1];
					calSalB[i] = calSalB[i + 1];
					sortingB[i + 1] = temp;
					calAgeB[i + 1] = temp2;
					calSalB[i + 1] = temp3;
					secretProperty = false;
				}
			}
		}		
	}
	public String age() {
		int minAge = calAgeB[0];
		nameB = sortingB[0];
		int i;

		for (i = 1; i < calAgeB.length; i++) {

			if (minAge > calAgeB[i]) {
				minAge = calAgeB[i];
				nameB = sortingB[i];
			}
		}
		this.minage = minAge;

		return nameB;
	}
	public void displayB() {
		System.out.println("\nInfo. for Company B" + "\n------------------------\n"+ nameB + " is the youngest."
				+ "\nSorted list in descending order based on salary:");
		for (int i = 0; i < sortingB.length; i++) {
			System.out.print(sortingB[i] + " with " + calSalB[i] + " salary, ");
		}
		System.out.println();
	}
}

class validateinputs11 {
	Scanner myScanner = new Scanner(System.in);
	int flagNumbInput;
	String flagString;

	void validateinteger11(int minVal, int maxVal) {

		boolean flagBoolean = true;

		while(flagBoolean) {
			this.flagNumbInput = myScanner.nextInt();
			if (this.flagNumbInput < minVal || this.flagNumbInput > maxVal ) {
				System.out.println("Wrong input try again");
				System.out.print("Your option: ");
			}
			else {
				flagBoolean = false;				
			}
		}
	}
}

public class CompanyExam {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		companyA a = new companyA();
		companyB b = new companyB();
		validateinputs11 v = new validateinputs11();
		String[] name = new String[4];
		int[] age = new int[4];
		int[] salary = new int[4];

		while (true){

			System.out.print("Welcome, Please select from the folowing options. (type only numbers between 1 and 3) "
					+ "\n1- Company A. \n2- Company B. \n3- Exit. \nYour option: ");
			v.validateinteger11(1, 3);
			if (v.flagNumbInput == 1) {
				System.out.println("Please enter the name, age and salary of 4 employee:");
				for (int i = 0; i < name.length; i++) {
					System.out.print( (i + 1) + "- name: ");
					name[i] = myScanner.next();
					System.out.print( (i + 1) + "- age: ");
					age[i] = myScanner.nextInt();
					System.out.print( (i + 1) + "- salary: ");
					salary[i] = myScanner.nextInt();
				}
				a.sort(name[0], name[1], name[2], name[3]);
				a.calculate(age[0], age[1], age[2], age[3]);
				a.salary(salary[0], salary[1], salary[2], salary[3]);
				a.salaryA();
				a.sortA();
				a.displayA();
				System.out.println();
			}
			else if (v.flagNumbInput == 2) {
				System.out.println("Please enter the name, age and salary of 4 employee:");
				for (int i = 0; i < name.length; i++) {
					System.out.print( (i + 1) + "- name: ");
					name[i] = myScanner.next();
					System.out.print( (i + 1) + "- age: ");
					age[i] = myScanner.nextInt();
					System.out.print( (i + 1) + "- salary: ");
					salary[i] = myScanner.nextInt();
				}
				b.sort(name[0], name[1], name[2], name[3]);
				b.calculate(age[0], age[1], age[2], age[3]);
				b.salary(salary[0], salary[1], salary[2], salary[3]);
				b.age();
				b.sortB();

				b.displayB();
				System.out.println();
			}
			else {
				myScanner.close();
				System.exit(0);
			}
		}
	}
}
