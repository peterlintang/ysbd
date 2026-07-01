package com.taobao.munion.pattern;

import java.lang.reflect.Array;

public class LockPatternView$a
{
  static a[][] c = (a[][])Array.newInstance(a.class, new int[] { 3, 3 });
  int a;
  int b;
  
  static
  {
    int i = 0;
    while (i < 3)
    {
      int j = 0;
      while (j < 3)
      {
        c[i][j] = new a(i, j);
        j += 1;
      }
      i += 1;
    }
  }
  
  private LockPatternView$a(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2);
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public static a a(int paramInt1, int paramInt2)
  {
    try
    {
      b(paramInt1, paramInt2);
      a locala = c[paramInt1][paramInt2];
      return locala;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static void b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > 2)) {
      throw new IllegalArgumentException("row must be in range 0-2");
    }
    if ((paramInt2 < 0) || (paramInt2 > 2)) {
      throw new IllegalArgumentException("column must be in range 0-2");
    }
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "(row=" + this.a + ",clmn=" + this.b + ")";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\pattern\LockPatternView$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */