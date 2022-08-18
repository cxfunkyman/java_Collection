import java.util.Scanner;

/* 
 * WAP to create an interface Volume having an abstract method 
 * designed for calculating and returning the volume of proposed 
 * 3D shape. This method takes one parameter as shape’s name and 
 * 2 other parameters as shape dimensions. Create the class Type 
 * that implements Volume. Also create the driver class that provides 
 * the user with a menu to choose his desired shape and after inputting 
 * the required info get the actual volume. Repeat to show the menu 
 * as long as user wishes. 

Sample output: 

Find the volume of: 1- Sphere 2- Cylinder 3- Cube or 4- Exit. Enter 1,2,3, or 4
1
Enter the radius:
3
Volume of Sphere is 113.04
Find the volume of: 1- Sphere 2- Cylinder 3- Cube or 4- Exit. Enter 1,2,3, or 4
2
Enter the radius:
3
Enter the height:
6
Volume of Cylinder is 169.56

Find the volume of: 1- Sphere 2- Cylinder 3- Cube or 4- Exit. Enter 1,2,3, or 4
3
Enter the side:
5
Volume of Cube is 125.0

Find the volume of: 1- Sphere 2- Cylinder 3- Cube or 4- Exit. Enter 1,2,3, or 4
4
 */

interface Volume {

	static final double pi = 3.1416;

	double shapeValue(String name, double Length, double radio);
}
//* WAP to create an interface Volume having an abstract method 
//* designed for calculating and returning the volume of proposed 
//* 3D shape. This method takes one parameter as shape’s name and 
//* 2 other parameters as shape dimensions.

class VolShape implements Volume {

	public VolShape() {		
	}


	public double shapeValue(String name, double Length, double radio) {

		if (name.equalsIgnoreCase("sphere")) {
			return (4.0/3) * pi * Math.pow(radio, 3); //volume = (4/3) · π · r3
		}
		else if (name.equalsIgnoreCase("cylinder")) {
			return pi * Math.pow(radio, 2) * Length; //cylinder = πr2h
		}
		else {
			return Math.pow(Length, 3); //Volume of Cube = a3
		}
	}

}
class validateinputs0 {
	Scanner myScanner = new Scanner(System.in);
	int flagNumbInput;
	String flagString;

	void validateInteger(int minVal, int maxVal) {

		boolean flagBoolean = true;

		while(flagBoolean) {
			this.flagNumbInput = myScanner.nextInt();
			if (this.flagNumbInput < minVal || this.flagNumbInput > maxVal) {
				System.out.println("Wrong input try again");
				System.out.print("Your option: ");
			}
			else {
				flagBoolean = false;				
			}
		}
	}
}

public class VolumeShape {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		VolShape volume = new VolShape();	
		validateinputs0 validate = new validateinputs0();


		while(true) {
			double radius = 0, length = 0;
			
			System.out.println("Welcome to 3D shape volume.");
			System.out.println("Find the volume of: 1- Sphere 2- Cylinder 3- Cube or 4- Exit. Enter 1, 2, 3, or 4");
			System.out.print("Your option: ");
			validate.validateInteger(1, 4);

			if (validate.flagNumbInput == 1) {
				System.out.print("For the sphere enter the radius: ");
				radius = myScanner.nextDouble();
				System.out.println("Volume of sphere is : " + volume.shapeValue("sphere", length, radius));
			}
			else if (validate.flagNumbInput == 2) {
				System.out.print("For the cylinder enter the radius: ");
				radius = myScanner.nextDouble();
				System.out.print("Enter the height: ");
				length = myScanner.nextDouble();
				System.out.println("Volume of sphere is: " + volume.shapeValue("cylinder", length, radius));
			}
			else if (validate.flagNumbInput == 3) {
				System.out.print("For the cube enter the length: ");
				length = myScanner.nextDouble();
				System.out.println("Volume of sphere is : " + volume.shapeValue("cube", length, radius));
			}
			else {
				myScanner.close();
				System.exit(0);
			}
		}

	}
}
