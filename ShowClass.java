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

//class Parent{ 
//    void show() {
//        System.out.println("I am parent");
//    }
//}
// 
//class Child1 extends Parent{  
//    void display() {
//        System.out.println("hello montreal");
//    }
//    void show() {
//        System.out.println("I am free child one");
//    }
//}
// 
//class Child2 extends Parent{  
//    void do_something() {
//        System.out.println("inside the child class - display method");
//    }
//    void show() {
//        System.out.println("I am free child two");
//        super.show();
//    }
//}
// 
//public class A {
//    public static void main(String[] args) {
//        Child1 c=new Child1();
//        //c.display();
//        c.show();
//        Child2 c2=new Child2();
//        c2.show();
//        }
//}
