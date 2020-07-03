//Linked list implementation of Queue.
public class LinkedListQueue
{
    private Node head=null,top=null;

    private class Node
    {
        String s;
        Node next;
    }

    /*LinkedListQueue(){
        next=null;
    }*/

    public void enqueue(String item)
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

    public String dequeue()
    {
        if(head==null)
             return "Error! Queue is empty";

        String item=head.s;
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

    public static void main(String args[])
    {
        LinkedListQueue obj=new LinkedListQueue();
        obj.enqueue("10");
        obj.enqueue("20");
        obj.enqueue("30");
        obj.enqueue("40");
        obj.enqueue("50");
        obj.enqueue("60");
        System.out.println(obj.size());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.size());

    }



}