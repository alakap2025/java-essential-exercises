/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

abstract class Shape
{
  abstract double area();
}

class Circle extends Shape
{
  double r;
  Circle(double r)
  {
    this.r = r;
  }
  double area()
  {
    return Math.PI *r * r;
  }
}

class Square extends Shape{
  double side;
  Square(double side)
  {
    this.side = side;
  }
  double area()
  {
    return side * side;
  }
}

class Rectangle extends Shape{
  double h, w;
  Rectangle(double h, double w)
  {
    this.w =w;
    this.h = h;
  }
  double area()
  {
    return h*w;
  }
}




public class Solution{
  public static void main(String args[])
  {
    Shape p1 = new Circle(4);
    Shape p2 = new Square(5);
    Shape p3 = new Rectangle(4,5);

    System.out.println(p1.area());
    System.out.println(p2.area());
    System.out.println(p3.area());
    

  }

}
