package com.umeng.newxp.common.a.c.a;

final class e$1
  implements CharSequence
{
  e$1(CharSequence paramCharSequence, CharSequence[][] paramArrayOfCharSequence) {}
  
  public final char charAt(int paramInt)
  {
    return this.a.charAt(paramInt);
  }
  
  public final int length()
  {
    return this.a.length();
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      localObject = "";
    }
    CharSequence localCharSequence;
    do
    {
      return (CharSequence)localObject;
      localCharSequence = this.b[paramInt1][(paramInt2 - 1)];
      localObject = localCharSequence;
    } while (localCharSequence != null);
    Object localObject = this.a.subSequence(paramInt1, paramInt2);
    this.b[paramInt1][(paramInt2 - 1)] = localObject;
    return (CharSequence)localObject;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\e$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */