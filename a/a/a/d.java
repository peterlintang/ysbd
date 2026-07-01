package a.a.a;

import java.io.BufferedInputStream;

class d
{
  static Class a;
  
  static BufferedInputStream a(String paramString)
  {
    Class localClass;
    if (a == null)
    {
      localClass = b("a.a.a.d");
      a = localClass;
    }
    for (;;)
    {
      return new BufferedInputStream(localClass.getResourceAsStream(paramString));
      localClass = a;
    }
  }
  
  private static Class b(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new NoClassDefFoundError(paramString.getMessage());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\a\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */