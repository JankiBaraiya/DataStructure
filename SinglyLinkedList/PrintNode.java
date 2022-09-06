import java.util.Scanner;

class PrintNode
{
  public static void main(String[] args)
  {
    Node FIRST = null;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter info of Node:");
    FIRST = displayNode(s.nextInt(),FIRST);
  }
    
    public static Node displayNode(int x, Node FIRST)
    {
      Node newNode = new Node();
      System.out.println(x + "\t" + FIRST);
      return newNode;
    }
}  
