package outputExamples;
import java.util.Scanner;
public class Vote {
	
	public static void main(String [] args)
	{
		boolean vote = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Did you vote? True or False");
		vote = input.nextBoolean();
		System.out.println("Voted: " + vote);
	}
	}


