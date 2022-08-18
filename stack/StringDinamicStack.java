package stack;

import java.util.Scanner;

/*
 * WAP to fully implement a dynamic stack, storing and 
 * manipulating values of string type.
 */

class DinamicStringStack {
	int aLength = 2;
	String stringArray[] = new String[aLength];
	int lastIndex = 0;

	void push(String val) {
		if(arrayFull()) {
			String stringTemp[] = new String[aLength * 2];
			for(int i = 0; i < aLength; i++) 
				stringTemp[i] = stringArray[i];

			aLength *= 2;
			stringArray = stringTemp;
		}
		stringArray[lastIndex] = val;
		lastIndex++;
	}
	void pop() {
		if(!arrayEmpty()) {
			lastIndex--;
			stringArray[lastIndex] = "";
		}
		else System.out.println("Stack is empty.");

		if(lastIndex < aLength / 4) {
			aLength /= 2;
			String temp[] = new String[aLength];
			for(int i = 0; i < aLength; i++) 
				temp[i] = stringArray[i];
			stringArray = temp;
		}
	}
	void peek() {
		if(!arrayEmpty()) 
			System.out.println(stringArray[lastIndex - 1]);
		else 
			System.out.println("Stack is empty.");
	}
	void show() {
		if(!arrayEmpty()) 
			for(int i = 0; i < lastIndex; i++) {
				if (i < lastIndex - 1)
					System.out.print(stringArray[i] + ", ");
				else 
					System.out.print(stringArray[i] + ".\n");				
			}		
		else 
			System.out.println("Stack is empty.");
	}
	boolean arrayFull(){
		if(lastIndex == aLength)
			return true;
		else 
			return false;
	}
	boolean arrayEmpty(){
		if(lastIndex <= 0)
			return true;
		else 
			return false;
	}
}
class validateinputs {
	Scanner myScanner = new Scanner(System.in);
	int flagNumbInput;
	String flagString;

	void validateinteger(int minVal, int maxVal) {

		boolean flagBoolean = true;
		System.out.print("Enter your choice: "); 

		while(flagBoolean) {
			this.flagNumbInput = myScanner.nextInt();
			if (this.flagNumbInput < minVal || this.flagNumbInput > maxVal ) {
				System.out.println("Wrong input try again");
				System.out.print("\nEnter your choice: ");
			}
			else 
				flagBoolean = false;
		}
	}
}
public class StringDinamicStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DinamicStringStack stack = new DinamicStringStack();
		validateinputs validate = new validateinputs();

		System.out.println("Welcome. Please select one of the following options: "
				+ "\nMenu: 0- Menu 1- Push 2- Pop 3- Peek 4- Show 5- Exit\n");

		while(true) {
			validate.validateinteger(0, 5);

			if(validate.flagNumbInput == 0) {
				System.out.println("Menu: 0- Menu 1- Push 2- Pop 3- Peek 4- Show 5- Exit");
			}
			else if (validate.flagNumbInput == 1) {
				System.out.print("Enter the word to push: ");
				stack.push(input.next());
			}
			else if (validate.flagNumbInput == 2) {
				stack.pop();
			}
			else if (validate.flagNumbInput == 3) {
				stack.peek();
			}
			else if (validate.flagNumbInput == 4) {
				stack.show();
			}
			else {
				input.close();
				System.exit(0);
			}		
		}		
	}
}
