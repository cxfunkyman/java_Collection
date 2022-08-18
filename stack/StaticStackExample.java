package stack;

import java.util.Scanner;

class StaticStack {
    int s[]=new int[5];
    int top=0;
    void push(int val) {//to add to top position
        if(!isfull()) {
            s[top]=val;
            top++;
        }
        else System.out.println("Can't push, Stack is full.");
    }
    void pop() {//to remove from top position
        if(!isempty()) {
            top--;
            s[top]=0;//optional
        }
        else System.out.println("Can't pop, Stack is empty.");
    }
    void peek() {//to display last value
        if(!isempty()) System.out.println(s[top-1]);
        else System.out.println("No data to show, Stack is empty.");
    }
    void show() {
        if(!isempty()) {
            int h=0;
            while(h<top) System.out.print(s[h++] + " ");
            System.out.println();
        }
        else System.out.println("No data to show, Stack is empty.");
    }
    boolean isfull(){
        if(top==5)return true;
        else return false;
    }
    boolean isempty(){
        if(top<=0)return true;
        else return false;
    }
}

public class StaticStackExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StaticStack st = new StaticStack();
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
