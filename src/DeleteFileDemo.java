
/********************************************************************
 * File Name:    DeleteFileDemo.java
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
public class DeleteFileDemo
{
  public static void main(String args[])
  {
    File folder = new File("C:/testrocky");
    deleteFolder(folder);
  }

  public static void deleteFolder(File folder)
  {
    File[] files = folder.listFiles();
    if (files != null)
    {
      for (File f : files)
      {
        if (f.isDirectory())
        {
          deleteFolder(f);
        }
        else
        {
          f.delete();
        }
      }
    }
    folder.delete();
  }
}
