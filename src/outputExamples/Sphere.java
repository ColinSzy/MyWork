package outputExamples;
import java.util.Scanner;
public class Sphere {
	
	public static void main(String [] args)
	{
		double radius = -999;
		double area = -999;
		double pi = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the Sphere?");
		radius = input.nextDouble();
		area = 4.00/3.00*pi*(radius*radius*radius);
		System.out.println("The area of the sphere is " + area + " square feet");
		input.close();
	}
	}
