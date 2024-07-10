
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String num2 = sc.next();
		int a = Integer.parseInt(num2.substring(0,1));
		int b = Integer.parseInt(num2.substring(1,2));
		int c = Integer.parseInt(num2.substring(2,3));
		
		System.out.println(num1*c);
		System.out.println(num1*b);
		System.out.println(num1*a);
		System.out.println(num1*Integer.parseInt(num2));

	}
}
