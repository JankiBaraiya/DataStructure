import java.util.Scanner;

class CirQueue
{
	int[] Q = new int[10];
	int front=-1,rear=-1;

	void CQInsert(int n)
	{
		if(rear==9)
			rear=0;
		else 
			rear++;

		if(front==rear)
		{
			System.out.println("Queue overflow");
			rear--;
		}
		else
		{
			Q[rear]=n;
		
			if(front==-1)
			front=0;
		}
	}

	int CQDelete()
	{
		if(front<0)
		{
			System.out.println("Queue underflow");
			return 0;
		}

		int y=Q[front];

		if(front==rear)
			front=rear=-1;
		else if(front==9)
			front=0;
		else 
			front++;

		return y;
	}

	void CQDisplay()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else if(front<rear)
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(Q[i]);
			}
		}
		else if(front>rear)
		{
			for(int i=front;i<10;i++)
			{
				System.out.println(Q[i]);
			}
			for(int j=0;j<=rear;j++)
			{
				System.out.println(Q[j]);
			}
		}
	}
}

public class Circular_Queue_Insert_Delete_Display
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		CirQueue obj = new CirQueue();

		System.out.println("1 for CQInsert , 2 for CQDelete , 3 for CQDisplay ");

		while(true)
		{
			System.out.print("Enter your choice:");
			int ch = s.nextInt();

			switch(ch)
			{
				case 1 :
					System.out.print("enter your Value:");
					int n = s.nextInt();

					obj.CQInsert(n);
					break;

				case 2 :
					obj.CQDelete();
					break;

				case 3 :
					obj.CQDisplay();
					break;

				default :
					return;

			}
		}	
	}
}