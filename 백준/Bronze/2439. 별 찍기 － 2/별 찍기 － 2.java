import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i, j, k = 1;
		
		for (i=1; i<=num; i++)
		{
			
			for (j=num; j>k; j--)
			{
				System.out.print(" ");
			}
			for (j=1; j<=k; j++)
			{
				System.out.print("*");
			}
			
			k++;
			System.out.println();
		}
	}
}
