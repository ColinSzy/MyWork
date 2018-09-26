package outputExamples;
import java.util.Scanner;
public class AgeMath {
	
	public static void main(String [] args)
	{
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		age = age + 7;
		System.out.println("In seven years you will be " + age + " years old");
		
		
		
		input.close();
	}
	}
