//this algorithm uses resizing of array concept
//push(): double the size of the array when it is full, i.e, N==s.length
//pop(): half the size of the array when it is one-quarter
//cost is very efficient.
//takes a constant time and uses better memory management. 
class ResizedArrayStack
{

    private String s[];
    private int N=0;

    ResizedArrayStack()
    {
        s=new String[1];
    }

    public boolean isEmpty()
    {
        return N==0;
    }

    public void push(String item)
    {
        if(N==s.length)
            resize(2*N);
        
        s[N++]=item;
    }

    public String pop()
    {
        String item=s[--N];
        s[N]=null;
        if(N==(s.length/4))
            resize(N/2);

        return item;
    }

    private void resize(int cap)
    {
        String copy[]=new String[cap];
        for(int i=0;i<N;i++)
        copy[i]=s[i];

        s=copy;
    }

    public static void main(String args[])
    {
        ResizedArrayStack obj=new ResizedArrayStack();
        obj.push("10");
        obj.push("20");
        obj.push("30");
        obj.push("40");
        obj.push("50");
        obj.push("60");
        obj.push("70");
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
     }



}

