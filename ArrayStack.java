//this is Array implementation of the stack.
//Defect is: Constraint of Overflow and Underflow

public class StackArray
{
  private String s[];
  private int N=0;

  public StackArray(int capacity)
  {
    s=new String[capacity];
  }

  public boolean isEmpty()
  {
    return N==0;
  }

  public void push(String val)
  {
    s[N]=val;
    N++;
  }

  public String pop()
  {
    String item=s[--N];
    s[N]=null;
    return item;
  }

  public static void main(String args[])
  {
    StackArray obj=new StackArray(10);
    obj.push("10");
    obj.push("20");
    obj.push("30");
    obj.push("40");
    System.out.println(obj.pop());
    System.out.println(obj.pop());
  }

}
