package outputExamples;
import java.util.Scanner;
public class CanYouVote {
	
	public static void main(String [] args)
	{
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		if(age > 17) System.out.println("You can vote!"); 
		else  System.out.println("You can vote in " + (age = 18-age) + " years");
		
		
		
		
		input.close();
	}
	}
