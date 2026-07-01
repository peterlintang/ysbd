package com.umeng.newxp.view.widget.indexlist;

public class City
{
  public char a;
  private String b;
  private String c;
  private String d;
  
  public City(String paramString1, String paramString2, String paramString3)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public char a()
  {
    if (this.a == 0) {
      this.a = this.c.charAt(0);
    }
    if (this.a != 0)
    {
      char c1 = this.a;
      if ((('@' < c1) && (c1 < '[')) || (('`' < c1) && (c1 < '{'))) {}
      while (c1 == "常".charAt(0)) {
        return c1;
      }
    }
    return "符".charAt(0);
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public boolean d(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      bool1 = bool2;
      if (paramString.charAt(0) == this.a) {
        bool1 = true;
      }
    }
    return bool1;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\indexlist\City.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */