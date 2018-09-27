package outputExamples;
import java.util.Scanner;
public class Circle {
	
	public static void main(String [] args)
	{
		double radius = -999;
		double area = -999;
		double pi = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();
		area = radius*radius*pi;
		System.out.println("The area of the circle is " + area + " square feet");
		input.close();
	}
	}
