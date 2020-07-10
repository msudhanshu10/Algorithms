//Linked list implementation of Queue.
public class LinkedListQueue<Item>
{
    private Node head=null,top=null;

    private class Node
    {
        Item s;
        Node next;
    }



    public void enqueue(Item item)
    {
        if(head==null)
        {
            Node current=new Node();
            head=current;
            top=current;
            current.s=item;
            current.next=null;
        }
        else
        {
            Node current=new Node();
            current.s=item;
            current.next=null;
            top.next=current;
            top=current; 
        }
    }

    public Item dequeue()
    {
        if(head==null)
             return null;

        Item item=head.s;
        head=head.next;
        return item;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public int size()
    {
        Node current=head;
        int count=0;
        System.out.print("head->");
        while(current!=null)
        {
            count++;
            System.out.print(current.s+"->");
            current=current.next;
        }

        System.out.println("null");
        return count;
    }

}