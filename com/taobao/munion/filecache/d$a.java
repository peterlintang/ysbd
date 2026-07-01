package com.taobao.munion.filecache;

class d$a
{
  private int b;
  private byte[] c;
  
  protected d$a(d paramd, int paramInt)
  {
    this.b = paramInt;
    int i = paramInt / 8;
    int k = 8 - paramInt % 8;
    paramInt = i;
    if (k != 0) {
      paramInt = i + 1;
    }
    this.c = new byte[paramInt];
    i = 0;
    while (i < paramInt)
    {
      this.c[i] = 0;
      i += 1;
    }
    if (k != 0)
    {
      this.c[(paramInt - 1)] = 1;
      i = j;
      while (i < k)
      {
        paramd = this.c;
        j = paramInt - 1;
        paramd[j] = ((byte)(paramd[j] * 2));
        i += 1;
      }
      paramd = this.c;
      paramInt -= 1;
      paramd[paramInt] = ((byte)(paramd[paramInt] - 1));
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(boolean paramBoolean, int paramInt)
  {
    if ((paramInt > this.b) || (paramInt < 0)) {
      return;
    }
    int k = paramInt / 8;
    int j = 1;
    int i = 0;
    while (i < 7 - paramInt % 8)
    {
      j = (byte)(j * 2);
      i += 1;
    }
    if (paramBoolean)
    {
      arrayOfByte = this.c;
      arrayOfByte[k] = ((byte)((j ^ 0xFFFFFFFF) & arrayOfByte[k]));
      return;
    }
    byte[] arrayOfByte = this.c;
    arrayOfByte[k] = ((byte)(j | arrayOfByte[k]));
  }
  
  public boolean a(int paramInt)
  {
    boolean bool = true;
    if ((paramInt > this.b) || (paramInt < 0)) {
      bool = false;
    }
    int k;
    int j;
    do
    {
      return bool;
      int i = paramInt / 8;
      k = this.c[i];
      i = 0;
      j = 1;
      while (i < 7 - paramInt % 8)
      {
        j = (byte)(j * 2);
        i += 1;
      }
    } while ((k & j) == 0);
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */