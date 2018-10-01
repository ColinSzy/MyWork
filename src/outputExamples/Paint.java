package outputExamples;
import java.util.Scanner;
public class Paint {
	
	public static void main(String [] args)
	{
		double length = -999;
		double width = -999;
		double height = 8;
		double area = -999;
		double gallons = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall?");
		width = input.nextDouble();
		System.out.println("What is the length of the wall?");
		length = input.nextDouble();
		
		area = ((length*height)*2)+((width*height)*2);
		gallons= area/150;
		
		System.out.println("Dimension of wall: " + length + "*" + width + "*" + height);
		System.out.println("Area: " + area);
		System.out.println("Gallons: " + gallons);
		
		
		
		
		
		
		input.close();
	}
}