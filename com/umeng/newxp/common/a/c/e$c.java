package com.umeng.newxp.common.a.c;

class e$c
  extends e.a
{
  public e$c(e parame, int paramInt)
  {
    super(parame, paramInt);
  }
  
  public void a(char paramChar)
  {
    this.a[this.b] = paramChar;
    this.b += 1;
  }
  
  protected char[] a(int paramInt1, int paramInt2)
  {
    char[] arrayOfChar = new char[paramInt2];
    System.arraycopy(this.a, paramInt1, arrayOfChar, 0, paramInt2);
    return arrayOfChar;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\e$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */