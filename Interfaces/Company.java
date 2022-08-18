import java.util.Scanner;

/*
 * Seky Perez Moya 219-5412
 * 
 * Create 3 interfaces for a personnel, and in each one make an abstract method. 
 * First interface for his personal info having its abstract method to accept 3 
 * parameters: name, age, location, and returning these info through an string 
 * array. Second interface for his educational info having its abstract method 
 * to accept 3 parameters: last degree, field of study, graduation year, and 
 * returning these info through an string array. Third interface for his employment
 *  info having its abstract method to accept 2 parameters: position, salary and 
 *  returning these info through an string array.

Create a class employee that implements all 3 interfaces; and has a method, 
promotion, to check if personnel is eligible for promotion or not. Create another 
class family having 2 attributes: number of family members, and whether family is 
low-income or not; this class has its own constructor and also a method show() to 
display family information. Class employee has its own constructor and extends the 
class family as well.

Promotion criteria: (age>45 and family members>=2 and position is manager) or 
(age>50 and degree=Ph.D. and salary<5000)
Create your client class to test all above-mentioned interfaces and classes.

 */

interface personalinfo {

	void personal(String name, String age, String location);
}
interface educationalinfo {	

	void education(String degree, String field, String graduation);
}
interface employmentinfo {	

	void employment(String position, String salary);
}

class employee extends family implements personalinfo, educationalinfo, employmentinfo {
	int numbFamily;
	String income, name, age, location, degree, field, graduation, position, salary, yesNoString;
	String[] infoPerson = new String[3];
	String[] infoEdu = new String[3];
	String[] infoEmploy = new String[2];

	employee(int numbFamily, String income) {
		super(numbFamily, income);
		this.income = income;
		this.numbFamily = numbFamily;
	}

	public void personal(String name, String age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
		String[] infoPerson = {name, age, location};
		this.infoPerson = infoPerson;
	}

	public void education(String degree, String field, String graduation) {	
		this.degree = degree;
		this.field = field;
		this.graduation = graduation;
		String[] infoEdu = {degree, field, graduation};
		this.infoEdu = infoEdu;
	}

	public void employment(String position, String salary) {
		this.position = position;
		this.salary = salary;
		String[] infoEmploy = {position, salary};
		this.infoEmploy = infoEmploy;
	}
	String promotion(String age, int numbFamily, String position, String degree, String salary) {
		int ageInteger = Integer.parseInt(age);
		int salaryInteger = Integer.parseInt(salary);

		if((ageInteger > 45 && numbFamily >= 2 && position.equalsIgnoreCase("Manager")) || 
				(ageInteger > 50 && degree.equalsIgnoreCase("Ph.D.") && salaryInteger < 5000)) {
			this.yesNoString = "Yes";
			return this.yesNoString;
		}
		else {
			this.yesNoString = "No";
			return this.yesNoString;	
		}
	}
	void display() {
		String[] info = {"Name of the employee: ", "Age: ", "Location: ", "Degree: ", "Field: ", "Graduation Year: ",
				"Position in the company: ", "Salary: "};

		for(int i = 0, j = 0; j < this.infoPerson.length; i++, j++) {
			
			System.out.println(info[i] + this.infoPerson[j]);
		}
		for(int i = 3, j = 0; j < this.infoEdu.length; i++, j++) {
			System.out.println(info[i] + this.infoEdu[j]);
		}
		for(int i = 6, j = 0; j < this.infoEmploy.length; i++, j++) {
			System.out.println(info[i] + this.infoEmploy[j]);
		}
		show();
		System.out.println("Promotion option: " + this.yesNoString);			
	}
}
class family {
	int numbFamily;
	String income;

	family(int numbFamily, String income) {
		this.numbFamily = numbFamily;
		this.income = income;		
	}
	void show() {
		System.out.println("Number of family members: " + this.numbFamily
				+ "\nLevel of income: " + this.income);
	}
}
class validateinputs {
	Scanner myScanner = new Scanner(System.in);
	int flagNumbInput;
	String flagString;

	void validateinteger(int minVal, int maxVal) {

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

public class Company {

	String[] menu = {"Enter the name of the employee: ", "Enter the age: ", "Enter the location: ", "Enter the degree: ", 
			"Enter the fiel of study: ", "Enter the graduation year of studies: ",
			"Enter the position: ", "Enter the salary: ", "Enter the number of family members: ", 
	"Enter the level of income (Low, Medium, High): "};

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Company m = new Company();
		validateinputs validate = new validateinputs();
		String name = "", age = "", location = "", degree = "", field = "", 
				graduation = "", position = "", salary = "", income = "";
		int numbfamily = 0;

		while(true) {

			for(int i = 0; i < m.menu.length; i++) {

				switch (i) {
				case 0: {
					System.out.print(m.menu[i]);
					name = myScanner.next();
				}
				break;
				case 1: {
					System.out.print(m.menu[i]);
					age = myScanner.next();
				}
				break;
				case 2: {
					System.out.print(m.menu[i]);
					location = myScanner.next();
				}
				break;
				case 3: {
					System.out.print(m.menu[i]);
					degree = myScanner.next(); 
				}
				break;
				case 4: {
					System.out.print(m.menu[i]);
					field = myScanner.next();
				}
				break;
				case 5: {
					System.out.print(m.menu[i]);
					graduation = myScanner.next();
				}
				break;
				case 6: {
					System.out.print(m.menu[i]);
					position = myScanner.next();
				}
				break;
				case 7: {
					System.out.print(m.menu[i]);
					salary = myScanner.next();
				}
				break;
				case 8: {
					System.out.print(m.menu[i]);
					numbfamily = myScanner.nextInt();
				}
				break;
				case 9: {
					System.out.print(m.menu[i]);
					income = myScanner.next();
				}
				break;
				default:
					break;
				}
			}
			employee worker = new employee(numbfamily, income);
			worker.personal(name, age, location);
			worker.education(degree, field, graduation);
			worker.employment(position, salary);
			worker.promotion(age, numbfamily, position, degree, salary);
			worker.display();

			System.out.print("\n1- Do you want to start over. 2- Exit. \nYour option: ");			
			validate.validateinteger(1, 2);			
			
			if(validate.flagNumbInput == 2) {
				myScanner.close();
				System.exit(0);
			}			
		}
	}
}
