/* In standard Quick Sort, problem arises when elemnets in the array are equal.
In worst case, partitioning actually takes around 1/2 n^2 compares.
So the Dijkstra's 3 Way partitioning sort Algorithm deals with this problem.*/

class QuickSort3Way
{
    public static void exch(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void sort(int a[],int lo,int hi)
    {

        if(hi<=lo) return ;

        int i=lo;
        int lt=lo;
        int gt=hi;
        int v=a[lo];


        while(i<=gt)
        {
            if(a[i]<v) exch(a,i++,lt++);
            else if(a[i]>v) exch(a,i,gt--);
            else i++;
        }

        sort(a,lo,lt-1);
        sort(a,gt+1,hi);

    }
    public static void main(String args[])
    {
        int a[]={15,12,18,1,6,55,21,8,6,4,3,3,2,0};
        QuickSort3Way.sort(a,0,a.length-1);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
