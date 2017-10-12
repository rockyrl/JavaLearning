/********************************************************************
 * File Name:    VarargsDemo.java
 *
 * Date Created: Sep 22, 2017
 *
 * ------------------------------------------------------------------
 * Copyright (c) 2016 Veritas Technologies LLC. All rights reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class VarargsDemo
{
  // CONSTANTS ------------------------------------------------------

  // CLASS VARIABLES ------------------------------------------------

  // INSTANCE VARIABLES ---------------------------------------------

  // CONSTRUCTORS ---------------------------------------------------

  // PUBLIC METHODS -------------------------------------------------
  public static void main(String args[])
  {
    printMax(3, 2, 1, 3.2);
  }

  public static void printMax(double... numbers)
  {
    if (numbers.length == 0)
    {
      System.out.println("no args passed");
    }

    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    {
      if (numbers[i] > result)
      {
        result = numbers[i];
      }
    }
    System.out.println("The max value is" + result);
  }
  // PROTECTED METHODS ----------------------------------------------

  // PRIVATE METHODS ------------------------------------------------

  // ACCESSOR METHODS -----------------------------------------------

}
