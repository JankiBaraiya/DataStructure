import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("enter number:");
		int n = s.nextInt();

		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
}
