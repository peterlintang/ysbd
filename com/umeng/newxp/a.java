package com.umeng.newxp;

public enum a
{
  private a() {}
  
  public static a a(String paramString)
  {
    a[] arrayOfa = values();
    int j = arrayOfa.length;
    int i = 0;
    while (i < j)
    {
      a locala = arrayOfa[i];
      if (locala.toString().equals(paramString)) {
        return locala;
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */