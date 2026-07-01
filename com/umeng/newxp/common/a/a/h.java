package com.umeng.newxp.common.a.a;

import java.io.FilterInputStream;
import java.io.InputStream;

public class h
  extends FilterInputStream
{
  private final boolean a;
  private final g b;
  private final byte[] c = new byte[1];
  
  protected h(InputStream paramInputStream, g paramg, boolean paramBoolean)
  {
    super(paramInputStream);
    this.a = paramBoolean;
    this.b = paramg;
  }
  
  public boolean markSupported()
  {
    return false;
  }
  
  public int read()
  {
    for (int i = read(this.c, 0, 1); i == 0; i = read(this.c, 0, 1)) {}
    if (i > 0)
    {
      if (this.c[0] < 0) {
        return this.c[0] + 256;
      }
      return this.c[0];
    }
    return -1;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException();
    }
    if ((paramInt1 < 0) || (paramInt2 < 0)) {
      throw new IndexOutOfBoundsException();
    }
    if ((paramInt1 > paramArrayOfByte.length) || (paramInt1 + paramInt2 > paramArrayOfByte.length)) {
      throw new IndexOutOfBoundsException();
    }
    int j;
    if (paramInt2 == 0) {
      j = 0;
    }
    int i;
    do
    {
      return j;
      i = 0;
      j = i;
    } while (i != 0);
    label94:
    byte[] arrayOfByte;
    if (!this.b.b())
    {
      if (!this.a) {
        break label145;
      }
      i = 4096;
      arrayOfByte = new byte[i];
      i = this.in.read(arrayOfByte);
      if (!this.a) {
        break label153;
      }
      this.b.b(arrayOfByte, 0, i);
    }
    for (;;)
    {
      i = this.b.c(paramArrayOfByte, paramInt1, paramInt2);
      break;
      label145:
      i = 8192;
      break label94;
      label153:
      this.b.a(arrayOfByte, 0, i);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */