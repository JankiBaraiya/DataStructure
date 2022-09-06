//Read n numbers in an array then read two different numbers, replace 1st number with 2nd number in an array and print its index and final array

import java.util.Scanner;

public class ReplaceInArray
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Array Size:");
		int n = s.nextInt();

		int[] array = new int[n];

		for(int i=0;i<array.length;i++)
		{
			System.out.print("Enter Array Element:");
			array[i] = s.nextInt();
		}

		System.out.print("Enter 1st Number:");
		int x=s.nextInt();

		System.out.print("Enter 2nd Number:");
		int y=s.nextInt();

		for(int i=0;i<array.length;i++)
		{
			if(array[i]==x)
			{
				System.out.println("Index : " +i);
				array[i]=y;
			}
		}

		System.out.println("Final Array:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i] + " ");
		}
	}
}