
/********************************************************************
 * File Name:    CreateDir.java
 *
 * Date Created: Sep 27, 2017
 *
 * ------------------------------------------------------------------
 * Copyright (c) 2016 Veritas Technologies LLC. All rights reserved.
 *
 *******************************************************************/
import java.io.File;
// PACKAGE/IMPORTS --------------------------------------------------

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class CreateDir
{
  public static void main(String args[])
  {
    String dirname = "c://testrocky";
    File d = new File(dirname);
    d.mkdirs();
  }

}
