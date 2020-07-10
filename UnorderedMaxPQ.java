//Code for Unordered Priority Queue.

public class UnorderedMaxPQ<Item>
{
    private Item pq[];
    private int N;
    public UnorderedMaxPQ(int cap)
    {
        pq=new Item[cap];
        N=0;
    }

    public boolean isEmpty()
    {
        return N==0;
    }

    public void exch(Item a[],int i, int j)
    {
        Item temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public void insert(Item val)
    {
        pq[N++]=val;
    }

    public Item delMax()
    {
        int max=0;
        for(int i=0;i<N;i++)
        {
            if(pq[i]>pq[max])
                max=i;
        }

        exch(pq,max,N-1);
        return pq[--N];
    }
}
