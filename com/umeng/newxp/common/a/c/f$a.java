package com.umeng.newxp.common.a.c;

public class f$a
{
  private final StringBuffer b = new StringBuffer(this.a.a());
  private final StringBuffer c = new StringBuffer(this.a.a());
  private final int d;
  
  public f$a(f paramf, int paramInt)
  {
    this.d = paramInt;
  }
  
  public String a()
  {
    return this.b.toString();
  }
  
  public void a(char paramChar)
  {
    b(paramChar);
    c(paramChar);
  }
  
  public void a(char paramChar1, char paramChar2)
  {
    b(paramChar1);
    c(paramChar2);
  }
  
  public void a(String paramString)
  {
    b(paramString);
    c(paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    b(paramString1);
    c(paramString2);
  }
  
  public String b()
  {
    return this.c.toString();
  }
  
  public void b(char paramChar)
  {
    if (this.b.length() < this.d) {
      this.b.append(paramChar);
    }
  }
  
  public void b(String paramString)
  {
    int i = this.d - this.b.length();
    if (paramString.length() <= i)
    {
      this.b.append(paramString);
      return;
    }
    this.b.append(paramString.substring(0, i));
  }
  
  public void c(char paramChar)
  {
    if (this.c.length() < this.d) {
      this.c.append(paramChar);
    }
  }
  
  public void c(String paramString)
  {
    int i = this.d - this.c.length();
    if (paramString.length() <= i)
    {
      this.c.append(paramString);
      return;
    }
    this.c.append(paramString.substring(0, i));
  }
  
  public boolean c()
  {
    return (this.b.length() >= this.d) && (this.c.length() >= this.d);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\f$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */