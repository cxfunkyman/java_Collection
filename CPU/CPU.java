public class CPU { // Declaration of the variables to be used for the class CPU

	private int intelCPUGeneration;
	private String intelCPUSeries;
	private double intelCPUPrice;
	private double intelCPUSpeed;
	private String intelCPULaunchDate;
	private boolean intelCPUSGXSupport;

	public CPU() { // First constructor set variables to default value.

		intelCPUGeneration = 1;
		intelCPUSeries = "i3";
		intelCPUPrice = 117;
		intelCPUSpeed = 2.93;
		intelCPULaunchDate = "Q1'10";
		intelCPUSGXSupport = false;

	}
	// Second constructor to set the default values to a different values with the new input
	public CPU(int intelCPUGeneration, String intelCPUSeries, double intelCPUPrice, double intelCPUSpeed, String intelCPULaunchDate, boolean intelCPUSGXSupport) {

		if ((intelCPUGeneration <= 0 || intelCPUGeneration >= 13) || !(intelCPUSeries == "i3" || intelCPUSeries == "i5" || intelCPUSeries == "i7" || intelCPUSeries == "i9")
				|| intelCPUPrice <= 0 || intelCPUSpeed <= 0) {

			throw new IllegalArgumentException("Incorrect data and/or missing data"); // Show error message if the input is incorrect.
		}

		else {

			this.intelCPUGeneration = intelCPUGeneration;
			this.intelCPUSeries = intelCPUSeries;
			this.intelCPUPrice = intelCPUPrice;
			this.intelCPUSpeed = intelCPUSpeed;
			this.intelCPULaunchDate = intelCPULaunchDate;
			this.intelCPUSGXSupport = intelCPUSGXSupport;
		}

	}
	// Getters for the CPU variables
	public int getIntelCPUGeneration() {
		return intelCPUGeneration;
	}

	public String getIntelCPUSeries() {
		return intelCPUSeries;
	}

	public double getIntelCPUPrice() {
		return intelCPUPrice;
	}

	public double getIntelCPUSpeed() {
		return intelCPUSpeed;
	}

	public String getIntelCPULaunchDate() {
		return intelCPULaunchDate;
	}

	public boolean getIntelCPUSGXSupport() {
		return intelCPUSGXSupport;
	}

	public void setIntelCPUPrice(double intelCPUPrice) { // Setter for the price CPU value
		this.intelCPUPrice = intelCPUPrice;
	}

	private int compareYearQuarter(String firstCPUDate, String secondCPUDate) {  // Comparison of the year in which the CPUs were released

		int firstCPUYear = Integer.parseInt(firstCPUDate.substring(3, 5));
		int secondCPUYear = Integer.parseInt(secondCPUDate.substring(3, 5));

		if (firstCPUYear > secondCPUYear) {
			return 1;
		}

		else if (firstCPUYear < secondCPUYear) {
			return -1;
		}

		else {

			if (firstCPUDate.charAt(1) > secondCPUDate.charAt(1)) {
				return 1;
			}

			else if (firstCPUDate.charAt(1) < secondCPUDate.charAt(1)) {
				return -1;
			}

			else {
				return 0;
			}
		}
	}

	//	Returns the estimated price of the
	//	CPU based on the supplied sQuarterYear variable. In each quarter after launch, the suggested
	//	price is reduced by 2%. The returned price cannot be under 0.0USD. If the supplied quarter/year
	//	in sQuarterYear is before the launch date of the CPU, there is no depreciation and the suggested
	//	price is returned.


	public double priceNow(String sQuarterYear) { 

		int yearQuarter = compareYearQuarter(intelCPULaunchDate, sQuarterYear);

		if (yearQuarter >= 0) {
			return intelCPUPrice;
		}
		else {			    			    
			int firstCPUYear = Integer.parseInt(intelCPULaunchDate.substring(3, 5));
			int secondCPUYear = Integer.parseInt(sQuarterYear.substring(3, 5));           

			int quarter1 = Integer.parseInt(intelCPULaunchDate.substring(1, 2));
			int quarter2 = Integer.parseInt(sQuarterYear.substring(1, 2));	           

			int sumQuarterPerYear = (4 * (Math.abs(secondCPUYear - firstCPUYear))) + (Math.abs(quarter2 - quarter1));

			double newPriceDropObtained = intelCPUPrice - (intelCPUPrice * 0.02 * sumQuarterPerYear);

			if (newPriceDropObtained <= 0) {

				throw new IllegalArgumentException("Price cannot be zero or negative"); // Show error message if the price is zero or less
			}
			else {

				return newPriceDropObtained; // New price obtained after the process of calculate which  percent has been decreased from the date released to the date marked
			}

		}
	}

	public String toString() { // Returns all the values of a CPU object in the correct format, it's only for numbers  from 1 - 9

		String[] ordinalNumber = {"st", "nd", "rd", "th"}; // String array to set the proper ordinal number state
		String ordinalString = "";

		if (intelCPUGeneration == 11 || intelCPUGeneration == 12 || intelCPUGeneration == 13) {
			ordinalString = ordinalNumber[3];  // this ordinal numbers are exceptions they goes with TH like 11th, 12th and 13th
		}

		else {

			if (intelCPUGeneration % 10 == 1) { // if the number is one set ST like 1st
				ordinalString = ordinalNumber[0];
			}

			else if (intelCPUGeneration % 10 == 2) { // if the number is two set ND like 2nd
				ordinalString = ordinalNumber[1];
			}

			else if (intelCPUGeneration % 10 == 3) { // if the number is three set RD like 3rd
				ordinalString = ordinalNumber[2];
			}

			else { // if the number is any other than 1, 2 or 3 set TH like 4th, 7th, 9th
				ordinalString = ordinalNumber[3];
			}
		}
		
		if (intelCPUSGXSupport) // Returns the print value for the first two lines of the program

			return "CPU 2: This CPU is " + intelCPUGeneration + ordinalString + " generation " + intelCPUSeries + " (" + intelCPUSpeed + "GHz), launched: "
			+ intelCPULaunchDate + String.format(" with price: %.2f", intelCPUPrice) + " USD. SGX is supported.";
		else

			return "CPU 1: This CPU is " + intelCPUGeneration + ordinalString + " generation " + intelCPUSeries + " (" + intelCPUSpeed + "GHz), launched: "
			+ intelCPULaunchDate + String.format(" with price: %.2f", intelCPUPrice) + " USD. SGX is not supported.";
	}    

	public boolean equals(Object equalsCPUObjects) { // Check if the CPUs are equal

		if (equalsCPUObjects == null) {
			return false;
		}

		if (this == equalsCPUObjects) {
			return true;
		}

		if (this.getClass() != equalsCPUObjects.getClass()) {
			return false;
		}

		CPU newEqualCPU = (CPU) equalsCPUObjects; // return the print value for the comparison of equal CPU

		return intelCPUGeneration == newEqualCPU.intelCPUGeneration && intelCPUSeries.toLowerCase().equals(newEqualCPU.intelCPUSeries.toLowerCase())
				&& intelCPUSGXSupport == newEqualCPU.intelCPUSGXSupport;
	}

	public boolean isHigherGeneration(CPU higherGenerationCPU) { // Check if the one of the CPU is higher generation than the other

		return intelCPUGeneration > higherGenerationCPU.intelCPUGeneration;
	}

}
