package stack;

import java.util.Scanner;

/* 
 * With respect to the dynamic stack implementation, accept an integer 
 * value from the user to search for it in your created stack.
To find out if this value is existing in the stack, you have to pop the 
elements one by one (LIFO). If the value is found, you are supposed to 
replace that with its doubled value and push it again, and otherwise 
push the original value as it is.
Sample output:
Menu: 1-Push 2-Pop 3-Peek 4-Show 5-Search 6-Exit
Enter your choice: 1
Enter the number to push: 11
Enter your choice: 1
Enter the number to push: 22
Enter your choice: 1
Enter the number to push: 33
Enter your choice: 1
Enter the number to push: 44
Enter your choice: 1
Enter the number to push: 55
Enter your choice: 4
11 22 33 44 55 0 0 0 Enter your choice: 5
Enter the number to search for: 33
Enter your choice: 4
11 22 66 44 55 0 0 0 Enter your choice: 5
Enter the number to search for: 77
Value not found.
Enter your choice: 1
Enter the number to push: 88
Enter your choice: 5
Enter the number to search for: 66
Enter your choice: 4
11 22 132 44 55 88 0 0 Enter your choice: 6
 */

class ReplaceDoubleStack {
	int aLength = 2;
	int intArray[] = new int[aLength];
	int lastIndex = 0;

	void push(int val) {
		if(arrayFull()) {
			int intTemp[] = new int[aLength * 2];
			for(int i = 0; i < aLength; i++) 
				intTemp[i] = intArray[i];

			aLength *= 2;
			intArray = intTemp;
		}
		intArray[lastIndex] = val;
		lastIndex++;
	}
	void pop() {
		if(!arrayEmpty()) {
			lastIndex--;
		}
		else System.out.println("Stack is empty.");

		if(lastIndex < aLength / 4) {
			aLength /= 2;
			int temp[] = new int[aLength];
			for(int i = 0; i < aLength; i++) 
				temp[i] = intArray[i];
			intArray = temp;
		}
	}
	void search(int val) { //SEARCH HERE
		int tempIndex = lastIndex;
		if(arrayEmpty())
			System.out.println("Stack is empty.");
		else {
			for(int i = lastIndex - 1; i >= 0; i--) {
				if (intArray[i] == val) {
					intArray[i] = intArray[i] * 2;
					break;
				}
				else
					lastIndex--;
				
				if(lastIndex == 0 && i == 0)
					System.out.println("Value not found.");
			}

			lastIndex = tempIndex;
		}
	}//ENDS HERE
	void peek() {
		if(!arrayEmpty()) 
			System.out.println(intArray[lastIndex - 1]);
		else 
			System.out.println("Stack is empty.");
	}
	void show() {
		if(!arrayEmpty()) 
			for(int i = 0; i < lastIndex; i++) {
				if (i < lastIndex - 1)
					System.out.print(intArray[i] + ", ");
				else 
					System.out.print(intArray[i] + ".\n");				
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
class validateinput {
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
public class IntdoubleReplaceStack {

	public static void main(String[] args) {

		ReplaceDoubleStack stack = new ReplaceDoubleStack();
		validateinput validate = new validateinput();

		System.out.println("Welcome. Please select one of the following options: "
				+ "\nMenu: 0- Menu 1- Push 2- Pop 3- Peek 4- Show 5- Search 6- Exit\n");

		while(true) {
			Scanner input = new Scanner(System.in);
			validate.validateinteger(0, 6);

			if(validate.flagNumbInput == 0) {
				System.out.println("Menu: 0- Menu 1- Push 2- Pop 3- Peek 4- Show 5- Search 6- Exit");
			}
			else if (validate.flagNumbInput == 1) {	
						System.out.print("Enter the number to push: ");
						stack.push(input.nextInt());
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
			else if (validate.flagNumbInput == 5) {
				System.out.print("Enter the number to search: ");
				stack.search(input.nextInt());	
			}
			else {
				input.close();
				System.exit(0);
			}		
		}
	}
}
