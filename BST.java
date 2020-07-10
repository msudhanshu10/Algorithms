//This code illsutrates a very important data structure called Binary Search Tree.
//It is similar to Quick-Sort Partitioning.
import java.util.*;
class BST<Key extends Comparable<Key>,Value>
{
    class Node
    {
         Key key;//to store genereic key
         Value val;//to store generic value for that key
         Node left,right;
         int count=0;//to keep count of the number of nodes
        public Node(Key key, Value val)
        {
            this.key=key;
            this.val=val;
        }
    }

    Node root=null;

    public void put(Key key,Value val)//client function
    {
        root=put(root,key,val);
    }

    public Node put(Node x,Key key,Value val)//A recursive function to insert val at Key=key;
    {
        if(x==null) 
            return new Node(key,val);

        int cmp=key.compareTo(x.key);
        if(cmp<0)   
            x.left=put(x.left,key,val);
        else if(cmp>0)
            x.right=put(x.right,key,val);
        else 
            x.val=val;
        
        x.count=1+size(x.left)+size(x.right);
        return x;
    }

    public Value get(Key key)// A search function to return value corresponding to the given key; ow return null
    {
        Node x=root;
        while(x!=null)
        {
        int cmp=key.compareTo(x.key);
        if(cmp<0)
            x=x.left;
        else if(cmp>0)
            x=x.right;
        else 
            return x.val;
        }
        return null;
    }

    public Value min()//traverse to left until null is found to get the minimum key.
    {
        Node prevNode=null;
        Node x=root;
        while(x!=null)
        {
            prevNode=x;
            x=x.left;
        }
        return prevNode.val;
    }

    public Value max()// traverse to the right until null is found to get the max key.
    {
        Node prevNode=null;
        Node x=root;
        while(x!=null)
        {
            prevNode=x;
            x=x.right;
        }
        return prevNode.val;
    }

    public int size()//client function for the size of the binary tree
    {
        return size(root);
    }

    private int size(Node x)
    {
        if(x==null)     return 0;
        return x.count;
    }

    public Key floor(Key key)//client function to find floor, i.e; largest key that is less than *key*
    {
        Node x=floor(root,key);
        if(x==null)     return null;

        return x.key;
    }

    private Node floor(Node x,Key key)
    {
        if(x==null) return null;
        int cmp=key.compareTo(x.key);

        if(cmp==0) return x;
        else if(cmp<0) return floor(x.left,key);

        Node t=floor(x.right,key);
        if(t!=null) return t;
        else
        return x;
    }

    public int rank(Key key)
    {
        return rank(root,key);
    }


    private int rank(Node x,Key key)
    {
        if(x==null) return 0;

        int cmp=key.compareTo(x.key);
        if(cmp<0)   return rank(x.left,key);
        else if(cmp>0) return 1+size(x.left)+rank(x.right,key);
        else return size(x.left);
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BST<String,Integer> obj=new BST<String,Integer>();

        for(int i=0;i<9;i++)
            obj.put(sc.next(),sc.nextInt());
        
        System.out.println(obj.size());
        System.out.println(obj.max());
        System.out.println(obj.min());
        System.out.println(obj.get("M"));
    }
}