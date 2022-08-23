import java.util.Scanner;

public class Prime
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n = s.nextInt();

		int flag=0;

		if(n==0 || n==1)
		{
			flag=2;
		}

		else
		{
				for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}

			if(flag==2)
			{
				System.out.println( n + " is special Number");
			}
			else if(flag==1)
			{
				System.out.println(n + " is not prime");
			}
			else
			{
				System.out.println(n + " is prime");
			}
		}
	}
}