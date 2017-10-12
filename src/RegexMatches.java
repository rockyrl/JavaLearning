/********************************************************************
 * File Name:    RegexMatches.java
 *
 * Date Created: Sep 19, 2017
 *
 * ------------------------------------------------------------------
 * Copyright (c) 2016 Veritas Technologies LLC. All rights reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class RegexMatches
{
  public static void main(String args[])
  {
    String line = "this is the test string 1233 Number";
    String pattern = "(\\d+)(.*)";
    Pattern r = Pattern.compile(pattern);

    Matcher m = r.matcher(line);
    if (m.find())
    {
      System.out.println(m.group(0));
      System.out.println(m.group(1));
      System.out.println(m.group(2));
    }
  }

}
