import java.util.Scanner;

class Queue
{
	int[] array = new int[10];
	int front=-1,rear=-1;

    public void enqueue(int n)
	{
		if(rear>=9)
		{
			System.out.println("Queue Overflow");
		}
		else 
		{
			if(front==-1)
			{
				front=0;
			}
			rear++;
			array[rear]=n;
		}
	}

	public void dequeue()   
	{
		if(front==-1)
		{
			System.out.println("Queue underflow");
		}
		else 
		{
			front++;
		}
	}

	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(array[i]);
		}
	}

}



public class Queue_Insert_Delete_Display
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Queue en = new Queue();

		System.out.println("1 for enqueue , 2 for dequeue , 3 for display ");

		while(true)
		{
			System.out.print("Enter your choice:");
			int ch = s.nextInt();

			switch(ch)
			{
				case 1 :
					System.out.print("enter your Value:");
					int n = s.nextInt();

					en.enqueue(n);
					break;

				case 2 :
					en.dequeue();
					break;

				case 3 :
					en.display();
					break;

				default :
					return;

			}
		}	
	}
}
