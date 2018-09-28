package outputExamples;
import java.util.Scanner;
public class Speedingticket {
	
	public static void main(String [] args)
	{
		int speedLimit = -999;
		int speed = -999;
		double fine = -999;
		int speeding = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the speed limit?");
		speedLimit = input.nextInt();
		System.out.println("What was your speed?");
		speed = input.nextInt();
		if(speed<speedLimit+1) System.out.println("No Fine!");
		else System.out.println("You were speeding");
		speeding=(speed-speedLimit);
		System.out.println("MPH over: " + speeding); 
		fine=55+45*(speeding-1);
		System.out.println("Fine: " + fine);
		
		input.close();
	}
}
