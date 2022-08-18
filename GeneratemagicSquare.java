// One way to generate a magic square of size n, when n 
// is odd is to assign the integers 1 to n^2 in ascending 
// order, starting at the bottom, middle cell. Repeatedly 
// assign the next integer to the cell adjacent diagonally 
// to the right and down. If this cell has already been
// assigned another integer, instead use the cell adjacently 
// above. If the new column is outside the square start back 
// at the first column. If the new row is outside the square, 
// start back at the beginning of the row. 
// Write a Java program to generate a magic square of a given
// odd size. For example, if the user enters 3, you should 
// generate:
// Enter an odd integer: 3
// 4 9 2 
// 3 5 7 
// 8 1 6
// 
// if the user enters 5, you should generate:
//
// Enter an odd integer: 5
// 11 18 25  2  9 
// 10 12 19 21  3 
//  4  6 13 20 22 
// 23  5  7 14 16 
// 17 24  1  8 15	 

// One possible solution:
	
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GeneratemagicSquare {
	public static void main(String[] args) 	{ 
		
		do {
		System.out.print("Enter an odd integer: ");
		Scanner keyboard = new Scanner(System.in); 
		int n = keyboard.nextInt();
		if (n % 2 == 0)
		{
			System.out.print("n must be odd");
			System.exit(0);
		}
		int[][] magic = new int[n][n];
		// set up first value at the bottom row in the middle 
		int row = n-1;
		int col = n/2; 
		magic[row][col] = 1;// set up all other integers from 2 to n*n
		for (int i = 2; i <= n*n; i++) {
			// try to go down one row (wrap around if needed)
			// and try to go right (wrap around if needed)
			// if cell has not been assigned yet
			if (magic[(row + 1) % n][(col + 1) % n] == 0) 
			{
				row = (row + 1) % n; // go down one row (wrap around if needed)
				col = (col + 1) % n; // go right (wrap around if needed)
			}
			// if cell has already been assigned, go up 1 row 
			else 
			{
				row = (row - 1 + n) % n;
				// don't change col
			}
			magic[row][col] = i;
		}
		// print results
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if (magic[i][j] < 10)
					System.out.print(" "); // for alignment
				if (magic[i][j] < 100) System.out.print(" "); // for alignment
				System.out.print(magic[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//keyboard.close();
		} while(true);
	}
}

