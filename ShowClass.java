/*
 * WAP to create a class having a method to prompt a message showing the class name. 
 * This class has 2 children. On child class also we have a method to show the class 
 * name, but not the parent name. Code this program and show how you can manage the 
 * classes to show their own name.
 */

class parents {
	
	void show() {
		System.out.println("this is the parent class.");
	}
}

class child1 extends parents{
	
	void show() {
		System.out.println("\nthis is the child1 class.");
		
	}	
}
class child2 extends parents{
	
	void show() {
		System.out.println("\nthis is the child2 class.");
		super.show();
	}
}

public class ShowClass {

	public static void main(String[] args) {
		
		child2 c = new child2();
		
		c.show();

	}

}
