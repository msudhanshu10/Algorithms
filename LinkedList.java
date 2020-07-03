//Array implementation of Stack
import java.util.*;


class LinkedList
{

  public Node createList(int N)//create LinkedList
  {

    Scanner sc=new Scanner(System.in);

     Node head;
    Node current,prev;
    //head=new Node();
    current=new Node();
    head=current;
    current.data=sc.nextInt();
    current.next=null;

    prev=head;

    for(int i=0;i<N-1;i++)
    {
      Node newNode=new Node();
      newNode.data=sc.nextInt();
      prev.next=newNode;
      prev=newNode;
      newNode.next=null;
    }


    return head;
  }

  public void delete(int val, Node head)
  {
    Node current=head;
    Node prev;
    prev=current;
    while(current!=null)
    {
      if(current.data==val)
      {
        prev.next=current.next;
        current.next=null;
        break;
      }
      prev=current;
      current=current.next;

      }
    }


  public void insert(int val,int data,Node head)
  {
    Node current=head;
    Node temp;
    while(current!=null)
    {
      if(current.data==val)
      {
        temp=current.next;
        Node newNode=new Node();
        newNode.data=data;
        current.next=newNode;
        newNode.next=temp;
        break;
      }
      current=current.next;
    }
  }

  public void display(Node head)//display list with a given head pointer
  {
    Node current=head;
    while(current!=null)
    {
      System.out.print(current.data+"->");
      current=current.next;
    }
    System.out.println();
  }

  public static void main(String args[])
  {
    LinkedList obj=new LinkedList();
    Node head=obj.createList(5);
    obj.display(head);
    obj.insert(30,70,head);
    obj.display(head);

    obj.delete(30,head);
    obj.display(head);
  }
}

class Node
{
  public int data;
  public Node next;
  Node()
  {
    next=null;
    data=0;
  }
}
