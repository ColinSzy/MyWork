package outputExamples;
import java.util.Scanner;
public class Coins {
	
	public static void main(String [] args)
	{
		int doller = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		int amount = -999;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much do I owe you?");
		amount = input.nextInt();
		
		doller = amount/100;
		quarter = (amount%100)/25;
		dime = ((amount%100)%25)/10;
		nickel = (((amount%100)%25)%10)/5;
		nickel = ((((amount%100)%25)%10)%5)/1;
		
		
		System.out.println(doller);
		System.out.println(quarter);
		System.out.println(dime);
		System.out.println(nickel);
		System.out.println(penny);
		
		
		
		
		
		
		
		input.close();
	}
}