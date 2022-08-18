package ArrayList;


import java.util.Scanner;
class Person{
	String name;
	int age;
	public Person() {}
	public Person(String name, int age) {
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

public class OlderPerson {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		Person p[] = new Person[3];
		int maxVal = 0, j = 0;
		
		for(int i = 0; i < p.length; i++) {
			System.out.println("Name: ");
			String name = myScanner.next();
			System.out.println("Age");
			int age = myScanner.nextInt();
			p[i] = new Person(name, age);
		}
		for(int i = 0; i < p.length; i++) {
			
			if (p[i].age > maxVal) {
				maxVal=p[i].age;
			j=i;
			}
		}
		      
		System.out.println("Older person is: " + p[j].name);
	}
}

