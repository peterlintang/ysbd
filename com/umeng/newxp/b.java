package com.umeng.newxp;

public enum b
{
  private b() {}
  
  public static b a(String paramString)
  {
    b[] arrayOfb = values();
    int j = arrayOfb.length;
    int i = 0;
    while (i < j)
    {
      b localb = arrayOfb[i];
      if (localb.toString().equals(paramString)) {
        return localb;
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */