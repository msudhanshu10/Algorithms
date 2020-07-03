//this program implements merge sort technique.
//Merge Sort invlove recursion.
//It uses the concept of Divide and Conquer.
//This powerful algorithm has O(NlogN) running time.

import java.util.*;
class MergeSort
{
    int a[];
    int N;
    int aux[];

    MergeSort(int cap)
    {
        N=cap;
        a=new int[N];
        aux=new int[N];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<N;i++)
            a[i]=sc.nextInt();

        sc.close();
    }

    public void merge(int a[],int aux[], int lo,int mid,int hi)
    {
        //right half of a and left half of a is already sorted
        for(int i=lo;i<=hi;i++)
            aux[i]=a[i];//copying elemnts from a to aux

        int i,j,k;
        i=lo;
        j=mid+1;
        k=lo;

        for(;k<=hi;k++)
        {
            if(i>mid)
                a[k]=aux[j++];
            else if(j>hi)
                a[k]=aux[i++];
            else if(aux[i]<=aux[j])
                a[k]=aux[i++];
            else
                a[k]=aux[j++];
        }
    }

    public void sort(int a[],int aux[],int lo,int hi)
    {
        if(hi<=lo)
            return ;
        
        int mid=lo+(hi-lo)/2;
        sort(a,aux,lo,mid);//recursion
        sort(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }

    public void sort(int a[])
    {
        //aux=new int[a.length];
        sort(a,aux,0,a.length-1);
    }

    public static void main(String args[])
    {
        MergeSort obj=new MergeSort(10);
        obj.sort(obj.a);

        for(int i=0;i<obj.N;i++)
            System.out.print(obj.a[i]+" ");
    }
}