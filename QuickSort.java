//This program illustrates Quick Sort Algorithm.
//Quick Sort algorithm is often regarded as one of the best algorithm in 20th century.
//No of compares is O(Nlog N) in best and the average case.
// in worst case it is O(1/2 N^2). We always use random array suffling to avoid worst case.
class QuickSort
{
    
    public static int partition(char a[],int lo,int hi)
    {

        int i=lo;
        char key=a[lo];
        int j=hi+1;
        char temp;

        while(true)
        {
            while(a[++i]<=key)
                if(i==hi) break;
            
            while(a[--j]>=key)
                if(j==lo) break;

            if(i>=j) break;

            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        
        temp=a[j];
        a[j]=key;
        a[lo]=temp; 
        
        return j;
    }

    public static void sort(char a[])
    {
        //to deal with the worst case we can shuffle our array.
        sort(a,0,a.length-1);
    }

    public static void sort(char a[],int lo,int hi)
    {
        if(hi<=lo) return ;

        int j=partition(a,lo,hi);//to get the partitioning elemnet index. Every element to the left of j is smaller than a[j]. and every element to the right of j is greater than a[j].
        sort(a,lo,j-1);//sort array from lo to j-1
        sort(a,j+1,hi);//sort array from j+1 to hi
    }

    public static void main(String args[])
    {
        

        char a[]={'K','R','A','T','E','L','E','P','U','I','M','Q','C','X','O','S'};

        QuickSort.sort(a);//function overloading.

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        
    }
}