//this program deals with the Knuth Algorithm for shuffling a pack of cards.
//it generetes uniform permutaions with equally likely probabilities.
//it is a linear time algorithm.
import java.util.*;
class KnuthSuffle
{
    int a[];
    int N;

    KnuthSuffle(int cap)
    {
        N=cap;
        a=new int[N];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<N;i++)
            a[i]=sc.nextInt();

        sc.close();
    }

    public int generateRandom(int n)
    {
        Random ran=new Random();
        return ran.nextInt(n);
    }

    public void shuffle()
    {
        int r,temp;
        for(int i=0;i<N;i++)
        {
            r=generateRandom(i+1);
            temp=a[i];
            a[i]=a[r];
            a[r]=temp;
        }
    }

    public static void main(String args[])
    {
        KnuthSuffle obj=new KnuthSuffle(10);

        obj.shuffle();

        for(int i=0;i<obj.N;i++)
            System.out.print(obj.a[i]+"  ");
    }


}