import java.util.Scanner;

class Implementation
{
	int x;
	int[] s = new int[25];
	int top = -1;

	void PUSH(int x)
	{
		if (top >= 25)
		{
			System.out.println("Stack Overflow");
			return;
		}		
		top++;
		s[top]=x;
	}

	void POP()
	{
		if(top <= -1)
		{
			System.out.println("Stack Underflow");
			return;
		}
		top--;
		System.out.println("Poped Element:"+s[top+1]);
	}

	void PEEP(int i)
	{
		if((top-i+1)<=0)
		{
			System.out.println("Underflow");
			return;
		}
		System.out.println("Peep Element:"+s[top-i+1]);
	}

	void change(int i, int x)
	{
		if((top-i+1)<=0)
		{
			System.out.println("Underflow");
			return;
		}
		s[top-i+1]=x;
		System.out.println("Change Element:"+s[top-i+1]);
	}

	void display()
	{
		if(top <= -1)
		{
			System.out.println("Stack Empty");
			return;
		}
		int temp = top;

		while(temp >= 0)
		{
			System.out.println(s[temp]);
			temp--;
		}
	}
}

public class Push_Pop_Peep_Change_Display
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		Implementation op = new Implementation();

		System.out.println("1 for PUSH \n 2 for POP \n 3 for PEEP \n 4 for CHANGE \n 5 for DISPLAY \n 6 for Exit");
		

		while(true)
		{
			System.out.print("Enter your Choice:");
			switch (s.nextInt())
			{
				case 1:
					System.out.print("enter element");
					op.PUSH(s.nextInt());
					break;

				case 2:
					op.POP();
					System.out.print("remove top element");
					break;

				case 3:
					System.out.print("enter index:");
					op.PEEP(s.nextInt());
					break;

				case 4:
					System.out.print("enter the index that you want to change:");
					int i = s.nextInt();
					System.out.print("enter value:");
					int x = s.nextInt();
					op.change(i,x);
					break;

				case 5:
					op.display();
					break;

				case 6:
					return;
				default:
					System.out.println("enter valid Operation");
			}
		}
	}
}