import java.util.Scanner;

class Evaluate
{
	int top=-1;
	int value=0;
	char temp;
	int[] stack = new int[20];

	void PUSH(int x)
	{
		if (top >= 20)
		{
			System.out.println("Stack Overflow");
			return;
		}		
		top++;
		stack[top]=x;
	}

	int POP()
	{
		if(top < -1)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		top--;
		return stack[top+1];
	}

	int operation(int a,int b,char temp)
	{
		if(temp == '+')
			return a+b;
		else if(temp == '-')
			return a-b;
		else if(temp == '*')
			return a*b;
		else if(temp == '/')
			return a/b;
		else if(temp == '^')
		{
			double j = Math.pow(a,b);
			int j1 = (int) j;
			return j1;
		}
		else
			return 0;	
	}

	void perform_operation(String st)
	{
		for(int i=st.length();i>0;i--)
		{
			temp = st.charAt(i-1);
			if(Character.isDigit(temp))
				PUSH(Integer.parseInt(""+temp));
			else 
			{
				int operand1 = POP();
		 		int operand2 = POP();
		
		 		value = operation(operand1,operand2,temp);
				PUSH(value);
			}
		}
	}
}

public class EvaluatePrefix
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		Evaluate e = new Evaluate();

		System.out.print("enter string:");
		String st = s.next();

		e.perform_operation(st);

		int ans = e.POP();
		System.out.println(ans);
	}
}