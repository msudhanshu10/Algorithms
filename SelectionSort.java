//Selection Sort takes O(N^2/2) compares in worst case.
//Irrespective of how sorted the input array is, no of compares are same.
//However, no of exchanges are minimum.
import java.util.*;
class SelectionSort
{
    int arr[];
    int N;

    SelectionSort(int cap)
    {
        Scanner sc=new Scanner(System.in);
        N=cap;
        arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
    }

    public void sort()
    {
        int i,j,key=0,temp,min,flag=0;
        for(i=0;i<N-1;i++)
        {
            min=arr[i];
            flag=0;
            for(j=i+1;j<N;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    key=j;
                    flag=1;
                }
            }
            if(flag==1){
                 temp=arr[i];
                 arr[i]=min;
                 arr[key]=temp;
            }
        }
    }

    public static void main(String args[])
    {
        SelectionSort obj=new SelectionSort(10);

        obj.sort();

        for(int i=0;i<10;i++)
            System.out.print(obj.arr[i]+"->");
    }
}