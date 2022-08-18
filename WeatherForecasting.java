/*
 *  Create a class “weather_forecast” assuming that it has the following 
 *  attributes: the temperature and the sky conditions, which could be sunny, 
 *  snowy, cloudy, or rainy. Include a constructor, the set and get methods. 
 *  Temperature, in Fahrenheit, should be between –50 and +150; the default 
 *  value is 70, if needed. The default sky condition is sunny. Include a method 
 *  that converts Fahrenheit to Celsius. 
 *  Celsius temperature = (Fahrenheit temperature – 32) * 5 / 9. 
 *  Also include a method that checks whether the weather attributes are consistent 
 *  (there are two cases where they are not consistent: when the temperature is above 
 *  32 and it is snowy, and when the temperature is below 32 and it is rainy). Consider 
 *  validations. 
 *  SHOW THE LAST UPDATE
 *  USER UPDATE THE TEMPERATURE
 */

import java.util.Scanner;

class WeatherCasting {

	private int tempValue;
	private String skyCondition;
	private boolean flag;
	private double celcius;

	public WeatherCasting() {

		this.tempValue = 70;
		this.skyCondition = "Sunny";
		this.flag = true;
		
	}
	public int getTempValue() {
		return tempValue;
	}


	public String getSkyCondition() {
		return skyCondition;
	}


	public void setTempValue(int tempValue) {
		this.tempValue = tempValue;
	}


	public void setSkyCondition(String skyCondition) {
		this.skyCondition = skyCondition;
	}

	public double Tempconvertion() {
		double temp = (double) this.tempValue;

		this.flag = false;
		return celcius = ((5.0 / 9) * (temp - 32));
	}

	@Override
	public String toString() {
		if (flag)
			return "Current temperature: " + tempValue + " in Fahrenheit." + "\nCurrent sky condition: " + skyCondition + "!";
		else
			flag = true;
		return String.format("Current temperature: %.2f", celcius) + " in Celsius." + "\nCurrent sky condition: " + skyCondition + "!";
	}
	
	public void Consistency() {
		if((tempValue < 32 && skyCondition.equalsIgnoreCase("Rainy"))||
				(tempValue > 32 && skyCondition.equalsIgnoreCase("Snowy")))
				System.out.println("Be careful. The weather is not consistent!");		
	}
}

public class WeatherForecasting {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		WeatherCasting wf = new WeatherCasting();

		boolean loop0 = true, loop1 = true, loop2 = true;
		int option, valueTemp, valueSky;

		while(loop0) {

			System.out.print("The Menu.\n" + "1- Show the last update in Fahrenheit.\n"
					+ "2- Show the last update in Celsius.\n"
					+ "3- Update.\n"
					+ "4- Exit." + "\nEnter your choice: ");

			option = myScanner.nextInt();

			switch (option) {

			case 1:
				System.out.println(wf);
				wf.Consistency();
				break;

			case 2:
				wf.Tempconvertion();
				System.out.println(wf);
				wf.Consistency();
				break;

			case 3:
				loop1 = true;
				while(loop1) {
					System.out.print("\nEnter a value between –50 and 150."
							+ "\nEnter the updated temperature in Fahrenheit:");

					valueTemp = myScanner.nextInt();
					if (valueTemp < -50 || valueTemp > 150) 
						System.out.println("Incorrect value for temperature.");
					else {
						wf.setTempValue(valueTemp);
						loop1 = false;
					}					
				}
				while (loop2) {
					System.out.println("Enter the updated sky condition: 1- Sunny, 2- Snowy, 3- Cloudy, 4- Rainy");
					
					valueSky = myScanner.nextInt();
					if (valueSky < 1 || valueSky > 4)
						System.out.println("Incorrect value for sky condition.");
					else if (valueSky == 1) {
						wf.setSkyCondition("Sunny");
						loop2 = false;
					}
					else if (valueSky == 2) {
						wf.setSkyCondition("Snowy");
						loop2 = false;
					}
					else if (valueSky == 3) {
						wf.setSkyCondition("Cloudy");
						loop2 = false;
					}
					else {
						wf.setSkyCondition("Rainy");
						loop2 = false;
					}
				}
				break;

			case 4:
				loop0 = false;
				System.out.println("Bye-Bye");
				break;

			default:
				System.out.println("Incorrect Input.");
			}
			System.out.println();
		}
		myScanner.close();
	}
}

