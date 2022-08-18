import java.util.Scanner;

/*
 * Write a program to:

• Create an interface called RegularPolygon with two abstract methods: 
  getNumSides and getSideLength.

• Create a class EquilateralTriangle that implements the interface; it 
  has getNumSides return 3 and getSideLength return an instance variable 
  that is set by the constructor. 

• Create a class Square that implements the interface; it has getNumSides 
  return 4 and getSideLength return an instance variable that is set by 
  the constructor. 

Then add two methods:

• getPerimeter (n * length, where n is the number of sides)
• getInteriorAngle ( (n-2)π/n in radians) or ((n - 2) * 180 / n in degree)

 */

interface RegularPolygon {

	void getNumSides();
	void getSideLength(double getSideLength);
}
class EquilateralTriangle implements RegularPolygon {

	double trianglePerimeter;
	double triangleAngle;
	int triangleSide;
	double triangleSideLength;
	final double pi = 3.1416;

	public void getNumSides() {

		this.triangleSide = 3;
	}

	public void getSideLength(double getSideLength) {
		this.triangleSideLength = getSideLength;
	}

	double getPerimeter() { //(n * length, where n is the number of sides)

		return this.trianglePerimeter = this.triangleSideLength * this.triangleSide;

	}
	double getInteriorAngleRadian() {	//( (n-2)π/n in radians) or ((n - 2) * 180 / n in degree)

		return this.triangleAngle = ((this.triangleSide - 2) * pi) / this.triangleSide;
	}
	double getInteriorAngleDegree() {	

		return this.triangleAngle = ((this.triangleSide - 2) * 180 / this.triangleSide);
	}

}
class Square implements RegularPolygon {
	double squarePerimeter;
	double squareAngle;
	int squareSide;
	double sideLength;
	final double pi = 3.1416;

	public void getNumSides() {

		this.squareSide = 4;
	}

	public void getSideLength(double getSideLength) {
		this.sideLength = getSideLength;
	}

	double getPerimeter() { //(n * length, where n is the number of sides)

		return this.squarePerimeter = this.sideLength * this.squareSide;

	}
	double getInteriorAngleRadian() {	//( (n-2)π/n in radians) or ((n - 2) * 180 / n in degree)

		return this.squareAngle = ((this.squareSide - 2) * pi) / this.squareSide;
	}
	double getInteriorAngleDegree() {	

		return this.squareAngle = ((this.squareSide - 2) * 180 / this.squareSide);
	}
}
class validateinputs1 {
	Scanner myScanner = new Scanner(System.in);
	int flagNumbInput;
	String flagString;

	void validateInteger(int minVal, int maxVal) {

		boolean flagBoolean = true;

		while(flagBoolean) {
			this.flagNumbInput = myScanner.nextInt();
			if (this.flagNumbInput < minVal || this.flagNumbInput > maxVal ) {
				System.out.println("Wrong input try again");
				System.out.print("Your option: ");
			}
			else {
				flagBoolean = false;				
			}
		}
	}
}
public class Polygon {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		validateinputs1 validate = new validateinputs1();
		EquilateralTriangle triangle = new EquilateralTriangle();
		Square square = new Square();
		double length;

		while (true) {	

			System.out.println("Welcome. \nThis program is to calculate the Perimeter "
					+ "and angle of two regular polygon. \nPlease choose from the following options."
					+ "\n1- Equilateral Triangle 2- Square 3- Exit");
			System.out.print("Your option: ");

			validate.validateInteger(1, 3);

			if(validate.flagNumbInput == 1) {
				triangle.getNumSides();
				System.out.print("Please enter the length of the sides :");
				triangle.getSideLength(length = myScanner.nextDouble());
				System.out.println("The perimeter of the equilateral triangle is : " + triangle.getPerimeter() 
				+ "\nThe angle in radian is: " + triangle.getInteriorAngleRadian() + "\nThe angle in degree is: "
				+ triangle.getInteriorAngleDegree());
				System.out.println();
			}
			else if(validate.flagNumbInput == 2) {
				square.getNumSides();
				System.out.print("Please enter the length of the sides :");
				square.getSideLength(length = myScanner.nextDouble());
				System.out.println("The perimeter of the square is : " + square.getPerimeter() 
				+ "\nThe angle in radian is: " + square.getInteriorAngleRadian() + "\nThe angle in degree is: "
				+ square.getInteriorAngleDegree());
				System.out.println();
			}
			else {	
				myScanner.close();
				System.exit(0);			
			}
		}
	}

}

