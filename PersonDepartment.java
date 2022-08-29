package ArrayList;

import java.util.Scanner;

/*
 * Example: create person (name, age, dept_no) and 
 * department (name, dept_no)class with corresponding attributes. 
 * Accept info for some persons and some departments. Then show 
 * the info: person name and age and department name.
 */

class Persons {

	String name;
	int age, dept_no;


	Persons() {

	}
	Persons(String name, int age, int dept_no) {
		this.name = name;
		this.age = age;
		this.dept_no = dept_no;
	}	
}
class Department {

	String name;
	int dept_no;

	Department() {

	}
	Department(String name, int dept_no) {
		this.name = name;
		this.dept_no = dept_no;
	}

}

public class PersonDepartment {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		Persons p[] = new Persons[8];
		Department pd[] = new Department[4];
		int j = 0;
		
		for(int i = 0; i < p.length; i++) {
			System.out.println("Name: ");
			String name = myScanner.next();
			System.out.println("Age: ");
			int age = myScanner.nextInt();
			System.out.println("Department Number: ");
			int dept_no = myScanner.nextInt();
			p[i] = new Persons(name, age, dept_no);
		}
		for(int i = 0; i < p.length; i++) {
			System.out.println("Name: ");
			String name = myScanner.next();
			System.out.println("Department Number: ");
			int dept_no = myScanner.nextInt();
			pd[i] = new Department(name, dept_no);
		}
		for(int i = 0; i < p.length; i++) {
			System.out.println("Name: " + p[i].name);
			System.out.println("Age: " + p[i].age);
			
			for (j = 0; j < pd.length; j++) {
				
				if (p[i].dept_no == pd[j].dept_no)
					break;
			}
			System.out.println("Department Number: " + pd[j].name + "\n");


		}
	}

}
