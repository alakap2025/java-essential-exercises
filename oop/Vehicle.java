/*
 * Click `Run` to execute the snippet below!
 * Inheritance + Overriding
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Vehicle
{
  void start()
  {
    System.out.print("Vehicle starting ...");
  }
  
}

class Car extends Vehicle
{
  @Override
  void start()
  {
    System.out.print("Car engine starting...");
  }
}

class ElectricCar extends Car{
  @Override
  void start()
  {
    System.out.println("Electric car powering on silently...");
  }

   public static void main(String args[])
  {
    Vehicle v = new Vehicle();
    Vehicle c = new Car();
    Vehicle e = new ElectricCar();
    
    v.start();
    c.start();
    e.start();

  }

}

