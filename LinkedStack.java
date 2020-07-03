//Linked List implementation of Stack.
import java.util.*;
class LinkedStack
{
  private Node top=null;
  private class Node
  {
    int data;
    Node next;
  }
public boolean isEmpty()
{
  return top==null;
}

  public void push(int val)
  {
    Node prev=top;
    top=new Node();
    top.data=val;
    top.next=prev;
  }

  public int pop()
  {
    int n=top.data;
    top=top.next;
    return n;
  }

  public static void main(String args[])
  {
    LinkedStack obj=new LinkedStack();
    obj.push(10);
    obj.push(20);
    obj.push(30);
    obj.push(40);
    obj.push(50);

    System.out.println("Top is->"+obj.pop());
    System.out.println("Top is->"+obj.pop());

  }
  }
