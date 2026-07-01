package org.a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.a.a.a.a.a;

public final class d
{
  public static final char a = File.separatorChar;
  public static final String b;
  
  static
  {
    a locala = new a((byte)0);
    PrintWriter localPrintWriter = new PrintWriter(locala);
    localPrintWriter.println();
    b = locala.toString();
    localPrintWriter.close();
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static void a(InputStream paramInputStream)
  {
    a(paramInputStream);
  }
  
  public static void a(OutputStream paramOutputStream)
  {
    a(paramOutputStream);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */