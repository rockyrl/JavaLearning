
/********************************************************************
 * File Name:    CheckingAccount.java
 *
 * Date Created: Sep 27, 2017
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
public class CheckingAccount
{
  private double balance;
  private int number;

  public CheckingAccount(int number)
  {
    this.number = number;
  }

  public void deposit(double amount)
  {
    balance += amount;
  }

  public void withdraw(double amount) throws InsufficientFundsException
  {
    if (amount <= balance)
    {
      balance -= amount;
    }
    else
    {
      double needs = amount - balance;
      throw new InsufficientFundsException(needs);
    }
  }

  public double getBalance()
  {
    return balance;
  }

  public int getNumber()
  {
    return number;
  }

  public static void main(String[] args)
  {
    CheckingAccount c = new CheckingAccount(101);
    System.out.println("Depositing $500...");
    c.deposit(505.00);
    try
    {
      System.out.println("\nWithdrawing $100...");
      c.withdraw(100.00);
      System.out.println("\nWithdrawing $600...");
      c.withdraw(600.00);
    }
    catch (InsufficientFundsException e)
    {
      System.out.println("Sorry, but you are short $" + e.getAmount());
      // e.printStackTrace();
    }
  }
}
