
/********************************************************************
 * File Name:    fileStreamTest2.java
 *
 * Date Created: Sep 27, 2017
 *
 * ------------------------------------------------------------------
 * Copyright (c) 2016 Veritas Technologies LLC. All rights reserved.
 *
 *******************************************************************/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// PACKAGE/IMPORTS --------------------------------------------------

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class fileStreamTest2
{
  public static void main(String[] args) throws IOException
  {
    File f = new File("a.txt");
    FileOutputStream fop = new FileOutputStream(f);

    OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

    writer.append("ÖÐÎÄ");

    writer.append("\r\n");

    writer.append("English");

    writer.close();

    fop.close();

    FileInputStream fip = new FileInputStream(f);

    InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

    StringBuffer sb = new StringBuffer();

    while (reader.ready())
    {
      sb.append((char) reader.read());
    }
    System.out.println(sb.toString());
    reader.close();
    fip.close();
  }

}
