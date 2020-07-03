//import java.util.*;
//this is a generic Stack with linked list implementation.
public class Stack <Item>
{
  private Node top=null;
  private class Node
  {
    Item data;
    Node next;
  }
public boolean isEmpty()
{
  return top==null;
}

  public void push(Item val)
  {
    Node prev=top;
    top=new Node();
    top.data=val;
    top.next=prev;
  }

  public Item pop()
  {
    Item n=top.data;
    top=top.next;
    return n;
  }

  }
