import java.util.*;
class isCCW
{
    Point p1;
    Point p2;
    Point p3;
    private class Point
    {
        float x;
        float y;
        Point(float X, float Y)
        {
            x=X;
            y=Y;
        }
    }
    isCCW()
    {
        Scanner sc=new Scanner(System.in);
        p1=new Point(sc.nextFloat(),sc.nextFloat());
        p2=new Point(sc.nextFloat(),sc.nextFloat());
        p3=new Point(sc.nextFloat(),sc.nextFloat());
        sc.close();
    }

    public float area(Point a,Point b,Point c)
    {
        return ((b.x-a.x)*(c.y-a.y))-((b.y-a.y)*(c.x-a.x));
    }

    public int check(Point a,Point b, Point c)
    { 
        float A=area(a,b,c);
        if(A>0)
            return 1;
        else if(A<0)
            return -1;
        else
            return 0;
    }

    public static void main(String args[])
    {
        isCCW obj=new isCCW();
        int result=obj.check(obj.p1,obj.p2,obj.p3);

        if(result==1)
            System.out.println("Points are in Counter-Clock wise direction!");
        else if(result==-1)
            System.out.println("Points are in Clock wise direction!");
        else
            System.out.println("Points are in Collinear!");
    }
}