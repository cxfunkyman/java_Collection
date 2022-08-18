import java.util.Scanner;
public class School {
    //-----------------------------------------------
    // Declare instance variables

        private String program ;
        private String university;
        private double tuition;

    //-----------------------------------------------
    // Implement default constructor
        public School() {
            String program = null;
            String university = null;
            double tuition = 0.0;
        }

    //-----------------------------------------------
    // Implement constructor with 3 parameters
        public School(String program, String university, double tuition)
        {
            this.program = program; 
            this.university = university;
            this.tuition = tuition;
        }
    //-----------------------------------------------
    // Implement Get/Set methods

        //Accessor methods
        public String getProgram() {
    		return String.format(program.toUpperCase());
    	}

    	public String getUniversity() {
    		return String.format(university.toUpperCase());
    	}

    	public double getTuition() {	

    	   	return tuition;
    	}

//-----------------------------------------------
    //Mutator methods

    	public void setProgram(String program) {
    		this.program = program;
    	}

    	public void setUniversity(String university) {
    		this.university = university;
    	}

    	public void setTuition(double tuition) {
    		this.tuition = tuition;
    	}

    //-----------------------------------------------
    // Implement toString method
        public String toString()
        {
            return "University name: " + getUniversity() + "\nProgram: " + getProgram() + "\nTuition: $" + getTuition();
        }

    //-----------------------------------------------
    // Implement equals method

        public boolean equals(School other) {
            if (tuition == other.tuition && university.contentEquals(other.university) && program.contentEquals(other.program)) {
                return true;
            }
            else{
                return false;
            }
        }
    //-----------------------------------------------
    // Implement isCheaper method
        public boolean isCheaper(School other) {
            return tuition > other.tuition;
        }
    //-----------------------------------------------
    

/* ================================================================================================== */
/* =====*****-----+++++!!!!! DO NOT ALTER, CHANGE, OR MODIFY THE CODE BELOW !!!!!+++++-----*****===== */
/* ================================================================================================== */

	public static void main(String[] args) {
		School school1 = new School();
		School school2 = new School();
		Scanner keyIn = new Scanner(System.in);
		String temp; 
		
		System.out.println("Enter info for your 1st choice:");
		System.out.print("Enter university name: ");
		school1.setUniversity(keyIn.nextLine());
		System.out.print("Enter program: ");
		school1.setProgram(keyIn.nextLine());
		System.out.print("Enter tuition: $");
		school1.setTuition(keyIn.nextDouble());
		
		System.out.println("\nHere is what you entered as your 1st choice:");
		System.out.println("University name: " + school1.getUniversity());
		System.out.println("Program: " + school1.getProgram());
		System.out.println("Tuition: $" + school1.getTuition());
		
		System.out.println("\nEnter info for your 2nd choice: ");
		temp = keyIn.nextLine();
		System.out.print("Enter university name: ");
		school2.setUniversity(keyIn.nextLine());
		System.out.print("Enter program: ");
		school2.setProgram(keyIn.nextLine());
		System.out.print("Enter tuition: $");
		school2.setTuition(keyIn.nextDouble());
		
		System.out.println("\nHere is what you entered as your 2nd choice:");
		System.out.println(school2);
		
		if (school1.equals(school2))
		System.out.println("?!?! --- Do you realize your 2 choices are identical --- ?!?!");
		System.out.println();
		if (school1.isCheaper(school2))
			System.out.println("Mom & Dad .. see my 1st choice is cheaper than my second choice");
		else if (school2.isCheaper(school1))
			System.out.println("Mom & Dad, my 1st choice is more expensive, but please I really want to go to "+ school1.getUniversity());
		else
			System.out.println("Mom & Dad, seeeee ... they are the same price!");
		
		System.out.println("\nYour Java program says \"Hope you get your 1st choice!\"");
		keyIn.close();
	}
}