package com.umeng.newxp.common.a.c;

abstract class e$a
{
  protected final char[] a;
  protected int b = 0;
  
  public e$a(e parame, int paramInt)
  {
    this.a = new char[paramInt];
    this.b = 0;
  }
  
  public e$a(e parame, char[] paramArrayOfChar)
  {
    this.a = paramArrayOfChar;
    this.b = paramArrayOfChar.length;
  }
  
  public int a()
  {
    return this.b;
  }
  
  protected abstract char[] a(int paramInt1, int paramInt2);
  
  public String toString()
  {
    return new String(a(0, this.b));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */