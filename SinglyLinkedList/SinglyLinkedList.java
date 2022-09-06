import java.util.*;
class Node{
	int info;
	Node link;
}

class SinglyLinkedList{
	static Scanner sc = new Scanner(System.in);
	static Node FIRST = null;
	public static void main(String args[]){
		System.out.println("Enter Your Choice : \n1. Insert at First\n2. Insert at End\n3. Display\n4.Delete\n5.countNode\n6. Exit");
		int	ch = sc.nextInt();
		while(true){
			switch(ch){
			case 1:
				System.out.print("Enter info of Node : ");
				FIRST = insert(sc.nextInt(),FIRST);
				break;
			case 2:
				System.out.print("Enter info of Node : ");
				FIRST = insertEnd(sc.nextInt(),FIRST);
				break;
			case 3:
				display(FIRST);
				break;
			case 4:
				System.out.print("Enter Node Which you want to delete : ");
				delete(sc.nextInt(),FIRST);
				break;
			case 5:
				System.out.println("Number of Node = " + countNode(FIRST));
				break;
			case 6:
				System.exit(0);
				break;
			default :
				System.out.println("Enter Valid Choice");
		}
			System.out.println("Enter Your Choice : \n1. Insert at First\n2. Insert at End\n3. Display\n4.Delete\n5.countNode\n6. Exit");
			ch = sc.nextInt();
		}
		
		
	}

	public static Node insert(int x, Node FIRST){
		Node newNode = new Node(); 
		if(newNode == null){
			System.out.println("Stack Underflow");
			return FIRST;
		}
		newNode.info = x;
		newNode.link = FIRST;
		return newNode;
	}

	public static Node insertEnd(int x, Node FIRST){
		Node newNode = new Node(); 
		if(newNode == null){
			System.out.println("Stack Underflow");
			return FIRST;
		}
		newNode.info = x;
		newNode.link = null;

		if(FIRST == null){
			return newNode;
		}
		Node SAVE = FIRST;
		while(SAVE.link != null){
			SAVE = SAVE.link;
		}
		SAVE.link = newNode;
		return FIRST;
	}

	public static void display(Node FIRST){
		Node SAVE = FIRST;
		while(SAVE.link != null){
			System.out.println(SAVE.info+"\t"+SAVE.link);
			SAVE = SAVE.link;
		}
		System.out.println(SAVE.info+"\t"+SAVE.link);
	}

	public static void delete(int x,Node FIRST){
		
		if(FIRST==null)
		{
			System.out.println("Underflow");
			return;
		}
		Node SAVE = FIRST;
		Node PRED = SAVE;
		while(SAVE.info != x && SAVE.link != null)
		{
			PRED = SAVE;
			SAVE = SAVE.link;
		}
		if(SAVE.info != x)
		{
			System.out.println("Node not Found");
			return;
		}

		if(x == FIRST.info)
		{
			FIRST = FIRST.link;
		}
		else
		{
			PRED.link = SAVE.link;
		}
	}

	public static int countNode(Node FIRST)
	{
		int COUNT = 0 ;
		if(FIRST==null)
			return COUNT;

		Node SAVE = FIRST;

		while(SAVE.link != null )
		{
			SAVE = SAVE.link;
			COUNT++;
		}
		return COUNT;
	}
}