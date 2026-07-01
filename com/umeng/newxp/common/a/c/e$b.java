package com.umeng.newxp.common.a.c;

class e$b
  extends e.a
{
  public e$b(e parame, char[] paramArrayOfChar)
  {
    super(parame, paramArrayOfChar);
  }
  
  public void a(char paramChar)
  {
    this.b += 1;
    this.a[c()] = paramChar;
  }
  
  protected char[] a(int paramInt1, int paramInt2)
  {
    char[] arrayOfChar = new char[paramInt2];
    System.arraycopy(this.a, this.a.length - this.b + paramInt1, arrayOfChar, 0, paramInt2);
    return arrayOfChar;
  }
  
  public char b()
  {
    return this.a[c()];
  }
  
  protected int c()
  {
    return this.a.length - this.b;
  }
  
  public char d()
  {
    char c = b();
    this.b -= 1;
    return c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\e$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */