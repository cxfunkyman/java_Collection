
public class IntelCPU {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the simple class example!\n");
		
        CPU firstCPUAdded = new CPU(); // Create an object of the first constructor with the default values
        CPU secondCPUAdded = new CPU(10, "i9", 449.00, 3.1, "Q2'19", true); // Create an object of the second constructor with the new values 
        
        String stringYearQuarter = "Q3'19"; // Set the new year/quarter date for reference to make the process of priceNow
        
        System.out.println(firstCPUAdded);        
        System.out.println(secondCPUAdded);
        
        System.out.println(String.format("CPU 1 Series: %s", firstCPUAdded.getIntelCPUSeries()));        
        System.out.println(String.format("CPU 1 suggested price: %.2f USD", firstCPUAdded.getIntelCPUPrice()));
        
        firstCPUAdded.setIntelCPUPrice(110.0); // Call the mutator to suggest a new price
        
        System.out.println(String.format("CPU 1 suggested price (after mutator call): %.2f USD", firstCPUAdded.getIntelCPUPrice())); // Print the default values by calling the first constructor    
        System.out.println(String.format("Are CPU 1 and CPU 2 equal? %s", firstCPUAdded.equals(secondCPUAdded) ? "YES": "NO"));        // Check for equals CPU and print the result
        System.out.println(String.format("Is CPU 1 higher generation than CPU 2? %s", firstCPUAdded.isHigherGeneration(secondCPUAdded) ? "YES": "NO")); // Check if the first CPU is higher than the second    
        System.out.println(String.format("CPU 1 Price at " + stringYearQuarter + ": %.2f USD", firstCPUAdded.priceNow(stringYearQuarter)));  // Check the priceNow for the first CPU with the stringYearQuarter string as a point of reference      
        System.out.println(String.format("CPU 2 Price at " + stringYearQuarter + ": %.2f USD", secondCPUAdded.priceNow(stringYearQuarter))); // Check the priceNow for the second CPU with the stringYearQuarter string as a point of reference
        
        System.out.println("\nThank you for testing the simple class example!");

	}

}
