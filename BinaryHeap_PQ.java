//A Binary Heap is a simple data structure derived from a complete Binary Tree.
//The children of Node at k are nodes at 2k and 2k+1.
//The parent of Node at k is the node at k/2.
//A Binary heap is always in order, i.e, largest key is at pq[1], and so on.
//Key of a parent is always greater than its children.
//The height if the binary tree is N, defined in powers of 2.


class PriorityQueue
{
    char pq[];
    int N;
    PriorityQueue(int cap)
    {
        pq=new char[cap];
        N=0;
    }
    public void swim(int k)
    {
        while(pq[k]>pq[k/2]&& k>1)
        {
            exch(k,k/2);
            k=k/2;
        }
    }

    public void sink(int k)
    {
        while(2*k<=N)
        {
            int j=2*k;
            if(j<N && pq[j]<pq[j+1])
                j++;
            if(!(pq[k]<pq[j]))
                break;
            exch(k,j);
            k=j;
        }
    }

    public char delMax()
    {
        char max=pq[1];
        pq[1]=pq[N--];
        pq[N+1]=' ';
        sink(1);
        return max;
    }


    public void exch(int i,int j)
    {
        char temp=pq[i];
        pq[i]=pq[j];
        pq[j]=temp;

    }
    public boolean isEmpty()
    {
        return N==0;
    }

    public void insert(char val)
    {
        pq[++N]=val;
        swim(N);
    }

    public static void main(String args[])
    {
        PriorityQueue obj=new PriorityQueue(12);
        obj.insert('T');
        obj.insert('S');
        obj.insert('I');
        obj.insert('X');
        obj.insert('A');
        obj.insert('U');
        obj.insert('L');
        obj.insert('N');
        obj.insert('B');
        obj.insert('Z');
        obj.insert('P');

        for(int i=1;i<=obj.N;i++)
            System.out.print(obj.pq[i]+" ");
        System.out.println();
        System.out.println(obj.delMax());
        for(int i=1;i<=obj.N;i++)
            System.out.print(obj.pq[i]+" ");
        System.out.println();
        obj.insert('Z');
        for(int i=1;i<=obj.N;i++)
            System.out.print(obj.pq[i]+" ");
System.out.println();

        //System.out.println(obj.delMax());
        //System.out.println(obj.delMax());
    }
}