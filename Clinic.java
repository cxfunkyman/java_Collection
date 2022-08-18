package qeu;

import java.util.Scanner;

/*
 * Using Queue, accept the name of some patients referred to a 
 * medical clinic. Whenever a patient likes, he may enter his 
 * name and program will prompt how many people are before him 
 * in queue.
Sample output:
Menu: 1-Enqueue 2-Dequeue 3-Size 4-Show 5-Beofre me? 6-Exit
Enter your choice: 2
Queue is empty. Can't dequeue.
Enter your choice: 4
No data to show, Queue is empty.
Enter your choice: 1
Enter the name to enqueue: aaa
Enter your choice: 1
Enter the name to enqueue: bbb
Enter your choice: 1
Enter the name to enqueue: ccc
Enter your choice: 3
Size is 3. Available space: 1
Enter your choice: 5
Enter your name: bbb
1 clients are before you.
Enter your choice: 5
Enter your name: ccc
2 clients are before you.
Enter your choice: 5
Enter your name: aaa
0 clients are before you.
Enter your choice: 5
Enter your name: hgfr
Entered name not found.
Enter your choice: 1
Enter the name to enqueue: ddd
Enter your choice: 4
aaa bbb ccc ddd Enter your choice: 2
Enter your choice: 2
Enter your choice: 4
ccc ddd Enter your choice: 5
Enter your name: ddd
1 clients are before you.
Enter your choice: 1
Enter the name to enqueue: hhh
Enter your choice: 1
Enter the name to enqueue: uuu
Enter your choice: 4
ccc ddd hhh uuu Enter your choice: 5
Enter your name: uuu
3 clients are before you.
Enter your choice: 6

 */

class ClinicQueue{
	int qsize = 5;
	String q[] = new String[qsize];
	int rear = 0, front = 0, currentSize = 0;
	String y;

	void enqueue(String in) {
		if(isfull()) {
			System.out.println("Queue is full. Can't Enqueue.");
		}
		else {
			rear = rear % qsize;
			q[rear] = in;
			currentSize++;
			rear++;
		}
	}
	void dequeue() {
		if(isempty()) {
			System.out.println("Queue is empty. Can't dequeue.");
		}
		else {
			y = q[front];
			front = ++front % qsize;			
			currentSize--;
		}		
	}
	void queueSize() {
		System.out.println("Size is " + currentSize + ". Available space: " 
				+ (qsize - currentSize));
	}
	void show() {
		if(!isempty()) {
			for(int i = 0; i < currentSize; i++) {
				System.out.print(q[(i + front) % qsize] + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("No data to show, Queue is empty.");
		}
	}
	void beforeMe(String data) {
		int count = 0, flag = 0;
		if(isempty())
			System.out.println("The queue is empty.");
		else {
			for(int i = front; count < currentSize; i++) {
				if(i == qsize)
					i = 0;
				if(q[i].compareToIgnoreCase(data) == 0) {
					flag = 1;
					break;
				}
				count++;
			}
			if(flag == 0) 
				System.out.println("Entered name not found.");
			else 
				System.out.println(count + " clients are before you.");
		}
	}
	boolean isfull(){
		if(currentSize == qsize)
			return true;
		else
			return false;
	}
	boolean isempty() {
		if(currentSize == 0)
			return true;
		else
			return false;
	}
}

public class Clinic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		

		ClinicQueue cq = new ClinicQueue();
		boolean exit = true;

		System.out.print("Menu: 1-Enqueue 2-Dequeue 3-Size 4-Show 5-Before me? 6-Menu 7-Exit\n");

		do {
			System.out.print("Enter your choice: ");
			int choice = in.nextInt();

			switch(choice) {

			case 1:
				System.out.print("Enter your name to enqueue: ");
				cq.enqueue(in.next());
				break;
			case 2:
				cq.dequeue();
				break;
			case 3:
				cq.queueSize();
				break;
			case 4:
				cq.show();
				break;
			case 5:
				System.out.print("Enter your name: ");
				cq.beforeMe(in.next());
				break;
			case 6:
				System.out.print("Menu: 1-Enqueue 2-Dequeue 3-Size 4-Show 5-Before me? 6-Menu 7-Exit\n");
				break;
			case 7:
				exit =! exit;
				break;
			default:
				System.err.println("Incorrect input only numbers from 1 to 7!!!!!");
			}
		} while(exit);
		in.close();
	}
}
