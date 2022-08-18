

public class PiNumber {

	public static void main(String[] args)
	{
		double sum = 0;
		boolean positive = true;
		
		for (int i = 1; i <= 20000; i++) {
			
			if (i % 2 == 1) {
				
				if(positive)
					sum += 1.0 / i; 
				
				else
					sum -= 1.0 / i; 
				positive = !positive;
			}
		}
		System.out.println(4 * sum);
	}




}

// π = 3.1415926535897932384626433832795
// π / 4 = 0.78539816339744830961566084581988