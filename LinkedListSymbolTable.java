//This code implements Symbol Table using Linked List.
//DS- maintain an unordered Linked List of Key-Value pair.
//Search-Scan through all keys and find a match.
//Insert- Scan through all keys to find a match; if no match found, insert at the front.
//Cost- O(N) in worst case.
//Challenge- We need an ordered and more efficient algorithm for search and insert.

class SymbolTable_List<Key,Value>
{
    class Node
    {
        Key key;
        Value data;
        Node next;
    }

    private Node head;
    SymbolTable_List()
    {
        head=null;
    }

    boolean isEmpty()
    {
        return head==null;
    }

    boolean contains(Key key)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.key==key)
                return true;
            current=current.next;
        }
        return false;
    }

    void put(Key key,Value val)
    {   
        boolean flag=false;
        Node current=head;
        while(current!=null)
        {
            if(current.key==key)
            {
                current.data=val;
                flag=true;
                break;
            }
            current=current.next;
        }
        if(!flag)
        {
            Node temp=new Node();
            temp.key=key;
            temp.data=val;
            temp.next=head;
            head=temp;
        }
    }

    public Value get(Key key)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.key==key)
            {
                return current.data;
            }
            current=current.next;
        }
        return null;
    }

    public static void main(String args[])
    {
        SymbolTable_List<String,Integer> obj=new SymbolTable_List<String,Integer>();
        obj.put("A",12);
        obj.put("B",15);
        obj.put("C",19);
        obj.put("D",78);
        obj.put("S",7890);
        System.out.println(obj.get("S"));

    }

}