package ArrayList;

import java.util.Scanner;

class Person1{
	String name;
	int age;
	public Person1() {}
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class LargestName {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		Person1 p[] = new Person1[3];
		int j = 0;
		String maxVal = "";

		for(int i = 0; i < p.length; i++) {
			System.out.println("Name: ");
			String name = myScanner.next();
			System.out.println("Age");
			int age = myScanner.nextInt();
			p[i] = new Person1(name, age);
		}
		for(int i = 0; i < p.length; i++) {

			if (p[i].name.length() > maxVal.length()) {
				maxVal=p[i].name;
				j=i;
			}
		}		      
		System.out.println("Largest name is: " + p[j].name);
	}
}


