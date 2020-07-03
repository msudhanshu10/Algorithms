import java.util.Scanner;
class Collection
{
  public int arr[];
  public int len;
  Collection()
  {
    len=0;
    arr=new int[len];
  }

  Collection(int n)
  {
    len=n;
    arr=new int[len];
  }

  public void inparr()
  {
    Scanner scin=new Scanner(System.in);
    System.out.println("Enter length of the array: ");
    len=scin.nextInt();
    Collection obj=new Collection(len);

    arr=new int[len];

    for(int i=0;i<len;i++)
    arr[i]=scin.nextInt();

  }

  public static void display(Collection obj)
  {
    //Collection obj=new Collection();

    for(int i=0;i<obj.len;i++)
    {
      System.out.print(obj.arr[i]+"->");
    }
  }

  public static void main(String args[])
  {
    Collection obj=new Collection();
    obj.inparr();
    Collection.display(obj);

  }



}
