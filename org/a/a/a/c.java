package org.a.a.a;

import java.io.File;

public final class c
{
  public static final String a = Character.toString('.');
  private static final char b = File.separatorChar;
  private static final char c = '\\';
  
  static
  {
    if (a())
    {
      c = '/';
      return;
    }
  }
  
  static boolean a()
  {
    return b == '\\';
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\a\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */