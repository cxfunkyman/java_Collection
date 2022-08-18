package Exams;

import java.util.Scanner;


/*
 * WAP to create the class Employee. This class has attributes as 
 * name, monthly salary, and monthly working hours. Create another 
 * class to instantiate the Employee (make 8 objects of this kind) 
 * and accept the mentioned information. Then, in this class, create
 * a menu to ask user about his desirable criteria for ranking the 
 * employee list. Based on the user’s selected option show the sorted
 * employee list in ascending order.
 */
class employee {
	
	String name;
	int salary;
	int hours;
	
	public employee() {
		// TODO Auto-generated constructor stub
	}
	public employee(String name, int salary, int hours) {
		this.name = name;
		this.salary = salary;
		this.hours = hours;
	}

}

public class ArrayListSort {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		employee e[] = new employee[4];
		
		int j = 0;
		boolean flag = false, flag1 = false, flag2 = false;

		
		for(int i = 0; i < e.length; i++) {
			System.out.print("Enter the employee's name: ");
			String name = myScanner.next();
			System.out.print("Enter the monthly salary: ");
			int salary = myScanner.nextInt();
			System.out.print("Enter the monthly working hours: ");
			int hours = myScanner.nextInt();
			e[i] = new employee(name, salary, hours);
		}
		while(true) {
			
		System.out.println("\nChoose the ranking criteria (enter 1,2, or 3):\n"
				+ "1- Based on monthly salary 2- Based on monthly working hours 3- Alphabeticall 4- Exit" );
		int input = myScanner.nextInt();
		if (input == 1) {
			while (!flag) {
				
				flag = true;
				
				for (int i = 0; i < (e.length - 1); i++) {
					
					if (e[i].salary > e[i + 1].salary) {
						String temp = e[i].name;
						int temp1 = e[i].salary;
						int temp2 = e[i].hours;
						
						e[i].name = e[i + 1].name;
						e[i].salary = e[i + 1].salary;
						e[i].hours = e[i + 1].hours;
						e[i+ 1].name = temp;
						e[i+ 1].salary = temp1;
						e[i+ 1].hours = temp2;
						
						flag = false;
						
					}
				}
			}
			System.out.println("Ranking, based on monthly salary order:");
			for (int i = 0; i < e.length; i++) {
				System.out.println((i + 1) + "- " +  e[i].name + " with the monthly monthly salary " + e[i].salary);
			}			
		}
		else if (input == 2) {
			while (!flag1) {
				
				flag1 = true;
				
				for (int i = 0; i < (e.length - 1); i++) {
					
					if (e[i].hours > e[i + 1].hours) {
						String temp = e[i].name;
						int temp1 = e[i].salary;
						int temp2 = e[i].hours;
						
						e[i].name = e[i + 1].name;
						e[i].salary = e[i + 1].salary;
						e[i].hours = e[i + 1].hours;
						e[i+ 1].name = temp;
						e[i+ 1].salary = temp1;
						e[i+ 1].hours = temp2;
						
						flag1 = false;
						
					}
				}
			}
			System.out.println("\nRanking, based on monthly working hours:");
			for (int i = 0; i < e.length; i++) {
				System.out.println((i + 1) + "- " +  e[i].name + " with the monthly working hours " + e[i].hours);
			}
		}
		else {
			while (!flag2) {
				
				flag2 = true;
				
				for (int i = 0; i < (e.length - 1); i++) {
					
					if (e[i].name.compareToIgnoreCase(e[i + 1].name) > 0) {
						String temp = e[i].name;
						int temp1 = e[i].salary;
						int temp2 = e[i].hours;
						
						e[i].name = e[i + 1].name;
						e[i].salary = e[i + 1].salary;
						e[i].hours = e[i + 1].hours;
						e[i+ 1].name = temp;
						e[i+ 1].salary = temp1;
						e[i+ 1].hours = temp2;
						
						flag2 = false;
						
					}
				}
			}
			System.out.println("Ranking, based on alphabetical order:");
			for (int i = 0; i < e.length; i++) {
				System.out.println((i + 1) + "- " +  e[i].name);
			}
		}
		System.out.println("\nDo you want to choose another criteria? (1 for yes 2 - no and exit)");
		input = myScanner.nextInt();
		if(input == 2)
			break;
	}		
	}
}
