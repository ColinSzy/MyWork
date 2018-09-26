package outputExamples;
import java.util.Scanner;
public class Password {
	
	public static void main(String [] args)
	{
		int one = -999;
		int two = -999;
		int three = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit?");
		one = input.nextInt();
		System.out.println("Enter a digit?");
		two = input.nextInt();
		System.out.println("Enter a digit?");
		three = input.nextInt();
		System.out.println("Posible passwords:");
		System.out.println(one +""+ two +""+ three);
		System.out.println(one +""+ three +""+ two);
		System.out.println(two +""+ one +""+ three);
		System.out.println(two +""+ three +""+ one);
		System.out.println(three +""+ two +""+ one);
		System.out.println(three +""+ one +""+two);


		input.close();
	}
	}
