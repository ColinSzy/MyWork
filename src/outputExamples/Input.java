package outputExamples;
import java.util.Scanner;
public class Input {
	
	public static void main(String [] args)
	{
		double height = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of a monkey in inches?");
		height = input.nextDouble();
		System.out.println("The height of a monkey is " + height + " inches");
	}
	}


