package outputExamples;
import java.util.Scanner;
public class Lcoker {
	
	public static void main(String [] args)
	{
		int one = -999;
		int two = -999;
		int three = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first numer of combo?");
		one = input.nextInt();
		System.out.println("What is your second number of combo?");
		two = input.nextInt();
		System.out.println("What is your third number of combo?");
		three = input.nextInt();
		System.out.println("Your locker combo is " + one + " - " + two + " - " + three);
		
		
		input.close();
	}
	}
