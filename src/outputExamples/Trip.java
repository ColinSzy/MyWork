package outputExamples;
import java.util.Scanner;
public class Trip {
	
	public static void main(String [] args)
	{
		double trip = -999;
		double mpg = -999;
		double money = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How long was your trip");
		trip = input.nextDouble();
		System.out.println("Whats the MPG on your car?");
		mpg = input.nextDouble();
		System.out.println("How much did you spend on your trip for gas?");
		money = input.nextDouble();
		System.out.println("Distance traveled: " + trip + " miles");
		System.out.println("Total gallons used: " + (trip/mpg));
		System.out.println("Amount of Money Spent: " + "$" + money);
		System.out.println("Cost per gallon: $" + (money/(trip/mpg)));
		
		
		
		
		
		
		
		input.close();
	}
}
