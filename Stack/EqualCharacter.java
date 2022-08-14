import java.util.Scanner;

class ValidString
{
	int top=-1;
	int a=0;
	int b=0;
	char[] array = new char[100];

	void PUSH(char x)
	{
		if (top >= 100)
		{
			System.out.println("Stack Overflow");
			return;
		}		
		top++;
		array[top]=x;
	}

	char POP()
	{
		if(top <= -1)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		char s = array[top];
		top--;
		return s;
	}

	public void equal(int l)
	{
		for(int i=0;i<l;i++)
		{
			char s = POP();
			if(s=='a')
				a++;
			if(s=='b')
				b++;
		}

		if(a==b)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}

public class EqualCharacter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ValidString vs = new ValidString();

		System.out.print("ENter String : ");
		String st = sc.next();

		int l = st.length();

		for(int i=0;i<l;i++)
		{
			vs.PUSH(st.charAt(i));
		}
		vs.equal(l);
	}
}