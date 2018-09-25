package outputExamples;
import java.util.Scanner;
public class Fortune {
	
	public static void main(String [] args)
	{
		int age = -999;
		double weight = -999;
		int number = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your weight?");
		weight = input.nextDouble();
		System.out.println("What is your lucky number?");
		number = input.nextInt();
		System.out.println("In the future");
		System.out.println("I see...");
		System.out.println(weight + " Years from now");
		System.out.println("You will be resident number " + age + number);
		
		
		input.close();
	}
	}
