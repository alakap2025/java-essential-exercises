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

abstract class Payment
{
  abstract void pay(double amount);
}

class CreditCardPayment extends Payment{
  @Override
  void pay(double amount)
  {
    System.out.println("Paid" +amount +"using Credit card" );    
  }
}

class UPIPayment extends Payment{
  @Override
  void pay(double amount)
  {
    System.out.println("Paid" +amount +"using UPI");
  }

  public static void main(String args[])
  {
    Payment p1 = new CreditCardPayment();
    Payment p2 = new UPIPayment();

    p1.pay(100);
    p2.pay(200);
    

  }
}


