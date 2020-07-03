class ResizedArrayQueue
{
    private String s[];
    private int head;
    private int top;

    ResizedArrayQueue()
    {
        s=new String[1];
        head=0;
        top=0;//position of the next item to get inserted
    }

    public void enqueue(String item)
    {
        if(top==s.length)
            resize(top*2);

        s[top++]=item;

    }

    public void resize(int capacity)
    {
        String copy[]=new String[capacity];
        for(int i=0;i<top;i++)
            copy[i]=s[i];

        s=copy;
    }

    public String dequeue()
    {
        if(top==0)
            return "Queue is empty!";
        
        String item=s[--top];
        s[top]=null;
        if(top==s.length/4)
            resize(s.length/4);

        return item;
    }

    public static void main(String args[])
    {
        ResizedArrayQueue obj=new ResizedArrayQueue();

        obj.enqueue("10");
        obj.enqueue("20");
        obj.enqueue("30");
        obj.enqueue("40");
        obj.enqueue("50");
        obj.enqueue("60");
        obj.enqueue("70");

        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());

    }
}