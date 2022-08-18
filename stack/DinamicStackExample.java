package stack;

import java.util.Scanner;

class DinamicStack {//creating dynamic array
	int capacity = 2;
	int s[] = new int[capacity];
	int top = 0;
	
	void push(int val) {//to add to top position
		if(isfull()) {//expanding stack
			int temp[] = new int[capacity * 2];
			for(int i = 0; i < capacity; i++) 
				temp[i] = s[i];//copying elements
			
			capacity *= 2;
			s = temp;
		}
		s[top] = val;
		top++;
	}
	void pop() {//to remove from top position
		if(!isempty()) {
			top--;
			s[top] = 0;
		}
		else System.out.println("Can't pop, Stack is empty.");
		
		if(top < capacity / 4) {//shrinking stack
			capacity /= 2;
			int temp[] = new int[capacity];
			for(int i = 0; i < capacity; i++) 
				temp[i] = s[i];
			s = temp;
		}
	}
	void peek() {//to display last value
		if(!isempty()) 
			System.out.println(s[top - 1]);
		else 
			System.out.println("No data to show, Stack is empty.");
	}
	void show() {
		if(!isempty()) 
			for(int i:s)
				System.out.print(i + " ");
		else 
			System.out.println("No data to show, Stack is empty.");
	}
	boolean isfull(){
		if(top == capacity)
			return true;
		else 
			return false;
	}
	boolean isempty(){
		if(top <= 0)
			return true;
		else 
			return false;
	}
}

public class DinamicStackExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DinamicStack st = new DinamicStack();
		boolean exit = true;
		
		System.out.print("Menu: 1-Push 2-Pop 3-Peek 4-Show 5-Exit\n");
		
		do {
			System.out.print("Enter your choice: ");
			int choice=in.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.print("Enter the number to push: ");
				st.push(in.nextInt());
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.peek();
				break;
			case 4:
				st.show();
				break;
			default:
				exit =! exit;
			}
		}while(exit);
		in.close();
	}

}
