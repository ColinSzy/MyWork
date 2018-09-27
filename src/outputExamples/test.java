package outputExamples;
import java.util.Scanner;
public class test {
	
	public static void main(String [] args)
	{
		int month = -999;
		int day = -999;
		int year = -999;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the month?(00)");
		month = input.nextInt();
		if(month<13) System.out.println("What is the day?(00)");
		else System.out.println("NOT VALED ");
		
		
		
		
		
		
		input.close();
	}
	}
