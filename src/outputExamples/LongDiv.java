package outputExamples;
import java.util.Scanner;
public class LongDiv {
	
	public static void main(String [] args)
	{
		int total = -999;
		int reman = -999;
		Scanner input = new Scanner(System.in);
		total = 13/3;
		reman = 13%3;
		System.out.println(total + "r" + reman);
		input.close();
	}
	}
