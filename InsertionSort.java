//takes O(N^2/2) in worst case.
//takes N-1 in best case.
//takes linear time when partially sorted.
//array is partially sorted iff no of inversions,=c*N


import java.util.*;
class InsertionSort
{
    int a[];
    int N;

    InsertionSort(int cap)
    {
        N=cap;
        a=new int[N];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<N;i++)
            a[i]=sc.nextInt();
    }

    public void sort()
    {
        int i,j,temp;
        for(i=0;i<N;i++)
        {
            for(j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        InsertionSort obj=new InsertionSort(10);
        obj.sort();

        for(int i=0;i<10;i++)
            System.out.print(obj.a[i]+"->");
    }
}