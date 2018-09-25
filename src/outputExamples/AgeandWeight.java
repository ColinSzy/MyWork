package outputExamples;
import java.util.Scanner;
public class AgeandWeight {
	
	public static void main(String [] args)
	{
		int age = -999;
		double weight = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your weight?");
		weight = input.nextDouble();
		System.out.println("You are " + age + " years old and are " + weight + " lbs");
		input.close();
	}
	}
