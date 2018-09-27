package outputExamples;
import java.util.Scanner;
public class Wall {
	
	public static void main(String [] args)
	{
		int height = 8;
		double width = -999;
		double length = -999;
		double area = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall?");
		width = input.nextDouble();
		System.out.println("What is the length of the wall?");
		length = input.nextDouble();
		area = width*height*length;
		System.out.println("The area of the wall is " + area + " square feet");
		input.close();
	}
	}
