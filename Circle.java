import java.util.*;

public class Circle
{

  public float input()
  {
    Scanner scin=new Scanner(System.in);
    return scin.nextFloat();
  }

  public float perimeter(float r)
  {
    return 2*3.14F*r;
  }

  public float area(float r)
  {
    return 3.14F*r*r;
  }

  public static void main(String args[])
  {
    CircleVariable obj1=new CircleVariable();
    Circle obj2=new Circle();
    obj1.radius=obj2.input();
    obj1.peri=obj2.perimeter(obj1.radius);
    obj1.area=obj2.area(obj1.radius);

    System.out.println("Radius :- "+obj1.radius);
    System.out.println("Perimeter :- "+obj1.peri);
    System.out.println("Area :- "+obj1.area);

  }
}


public class CircleVariable
{
  public float radius;
  public float peri;
  public float area;
  CircleVariable()
  {
    radius=0;
    peri=0;
    area=0;
  }

};
