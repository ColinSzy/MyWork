package outputExamples;
import java.util.Scanner;
public class Grass2 {
	
	public static void main(String [] args)
	{
		double length = -999;
		double width = -999;
		double area = -999;
		double cost = -999;
		double mower = -999;
		double hours = -999;
		double speed = -999;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the yard(feet)?");
		length = input.nextInt();
		System.out.println("What is the width of the yard(feet)?");
		width = input.nextInt();
		System.out.println("What is the width of the mower(feet)?");
		mower = input.nextInt();
		System.out.println("What is the speed of the mower(mph)?");
		speed = input.nextInt();

		
		
		area=(length*width);
		hours= area/(mower*speed);
		cost=hours*12;
	
		
		System.out.println("Area: " + area);
		System.out.println("Hours: " + hours);
		System.out.println("Cost: "+ cost);
		
		
		
		
		input.close();
	}
}