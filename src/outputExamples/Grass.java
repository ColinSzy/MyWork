package outputExamples;
import java.util.Scanner;
public class Grass {
	
	public static void main(String [] args)
	{
		double length = -999;
		double width = -999;
		double radius = -999;
		double cost = -999;
		double area = -999;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the yard(feet)?");
		length = input.nextInt();
		System.out.println("What is the width of the yard(feet)?");
		width = input.nextInt();
		System.out.println("What is the radius of the fountain(feet)?");
		radius = input.nextInt();
		
		area=(length*width)-(Math.PI*radius*radius);
		cost=(area/100)*1.25;
		
		System.out.println(area + "square feet");
		System.out.println("$ " + cost);
	
		
		
		
		
		
		
		input.close();
	}
}