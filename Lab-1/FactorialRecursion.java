import java.util.Scanner;

public class FactorialRecursion
{

	public int fact(int n)
		{
			if(n==1)
				return 1;
			else 
				return(n*fact(n-1));
		}


	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);

		System.out.print("enter number:");
		int n = s.nextInt();

		FactorialRecursion obj = new FactorialRecursion();

		int ans=obj.fact(n);
		System.out.println("Factorial of " + n + " : " + ans);

	}
}