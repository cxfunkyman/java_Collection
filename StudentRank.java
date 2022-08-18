package ArrayList;

import java.util.Scanner;

/*
 * Example: WAP to create the class Student. This class has 
 * attributes as name and average mark. Create another class 
 * to instantiate the Student (make 5 objects of this kind) 
 * and show the students’ rank.
 */



class student {
	
	String name;
	int mark;
	
	public student() {
		// TODO Auto-generated constructor stub
	}
	public student (String name, int mark) {
		this.name = name;
		this.mark = mark;
	}
}


public class StudentRank {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		student st[] = new student[4];
		int j = 0;
		String maxVal = "";
		boolean flag = false;
		double average = 0;

		for(int i = 0; i < st.length; i++) {
			System.out.println("Name: ");
			String name = myScanner.next();
			System.out.println("Mark: ");
			int age = myScanner.nextInt();
			st[i] = new student(name, age);
		}

		
		while (!flag) {
			
			flag = true;
			
			for (int i = 0; i < (st.length - 1); i++) {
				
				if (st[i].mark < st[i + 1].mark) {
					int temp = st[i].mark;
					String temp1 = st[i].name;
					st[i].mark = st[i + 1].mark;
					st[i].name = st[i + 1].name;
					st[i+ 1].mark = temp;
					st[i+ 1].name = temp1;
					flag = false;
					
				}
			}
		}
		for (int i = 0; i < st.length; i++) {
			average = average + st[i].mark;			
		}
		System.out.println("Class Average: " + (average/st.length));
		
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i].name + " " + st[i].mark);
		}
	}
}