package Exams;

import java.util.Scanner;
/*
 * WAP ask user to input a number and convert to binary
 */
class BinaryExam {
	int capacity = 2, currentSize = 0;
	int queue[] = new int[capacity];
	int front = 0, rear = -1, y; 	
	int count = 0;
	int stackArray[] = new int[20];

	void enqueue(int data) {
		if (isfull()) {
			int temp[] = new int[capacity * 2];
			for(int i = 0; i < capacity; i++)
				temp[i] = queue[i];
			capacity *= 2;
			queue = temp;			
		}
		rear = (rear + 1) % capacity;
		queue[rear] = data;
		currentSize++;		
	}
	void dequeue() {
		if (isempty()) {

			if(rear < (capacity / 4))
				capacity /= 2;
			int temp[] = new int[capacity];
			for(int i = 0; i < capacity; i++)
				temp[i] = queue[i];
			queue = temp;
		} 
		y = queue[front]; 
		front = (front + 1) % capacity;
		currentSize--;
	}
	void show() {
		if (!isempty()) {
			dequeue();
			System.out.print("The binary equivalent for " + y + " is ");			
			stack();
			System.out.println();
		}
		else
			System.out.println("No data to show, Queue is empty.");
	}
	void stack() { 
		convert(y);
		for(int i = count - 1; i >= 0; i--, count--)
			System.out.print(stackArray[i]);
	}
	void convert(int y) { 
		if (y != 0) {     
			stackArray[count++] = y % 2;
			convert(y /= 2);
		}
	}
	boolean isfull() {
		if (currentSize == capacity)
			return true;
		return false;
	}
	boolean isempty() {
		if (currentSize == 0)
			return true;
		return false;
	}
}
public class BinaryStackExample {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		BinaryExam b = new BinaryExam();

		System.out.println("Welcome. \nMenu: 1-Enqueue 2-Show 3-Exit");
		do {
			System.out.print("Enter your choice: ");

			switch (myScanner.nextInt()) {
			case 1:
				System.out.print("Enter the number: ");
				b.enqueue(myScanner.nextInt());
				break;
			case 2:
				b.show();
				break;
			case 3:
				myScanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Incorrect Input. \nMenu: 1-Enqueue 2-Show 3-Exit");
				break;
			}
		} while(true);
	}
}
