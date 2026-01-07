
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

class Employee
{
  private String name;
  private double salary;

  public Employee(String name, double salary1)
  {
    this.name = name;
    this.salary = salary1;
  }

  public String getname()
  {
    return name;
  }

  public double getSalary()
  {
    return salary;
  }

  public void setSalary(double salary)
  {
    if(salary > 0) 
      this.salary = salary;
  }

  public double calculateAnnualSalary()
    {
      return salary*12;

    }

  
  
}

public class Solution{
  public static void main(String args[])
  {
    Employee e = new Employee("Alaka", 2000);
    System.out.println(e.calculateAnnualSalary());

  }

}
