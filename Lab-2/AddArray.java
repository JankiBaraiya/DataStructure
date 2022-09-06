//Read two 2x2 matrices and perform addition of matrices into third matrix and print it.

import java.util.Scanner;

public class AddArray
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int[][] array1 = new int[2][2];
		int[][] array2 = new int[2][2];
		int[][] additionArray = new int[2][2];

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("Enter Array1 Element");
				array1[i][j] = s.nextInt();
			}
		}

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("Enter Array2 Element");
				array2[i][j] = s.nextInt();
			}
		}

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				additionArray[i][j] = array1[i][j] + array2[i][j];
			}
		}

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(additionArray[i][j]);
			}
		}
	}
}
