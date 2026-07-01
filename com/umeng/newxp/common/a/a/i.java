package com.umeng.newxp.common.a.a;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class i
  extends FilterOutputStream
{
  private final boolean a;
  private final g b;
  private final byte[] c = new byte[1];
  
  public i(OutputStream paramOutputStream, g paramg, boolean paramBoolean)
  {
    super(paramOutputStream);
    this.b = paramg;
    this.a = paramBoolean;
  }
  
  private void a(boolean paramBoolean)
  {
    int i = this.b.c();
    if (i > 0)
    {
      byte[] arrayOfByte = new byte[i];
      i = this.b.c(arrayOfByte, 0, i);
      if (i > 0) {
        this.out.write(arrayOfByte, 0, i);
      }
    }
    if (paramBoolean) {
      this.out.flush();
    }
  }
  
  public void close()
  {
    if (this.a) {
      this.b.b(this.c, 0, -1);
    }
    for (;;)
    {
      flush();
      this.out.close();
      return;
      this.b.a(this.c, 0, -1);
    }
  }
  
  public void flush()
  {
    a(true);
  }
  
  public void write(int paramInt)
  {
    this.c[0] = ((byte)paramInt);
    write(this.c, 0, 1);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
    if (paramInt2 > 0)
    {
      if (!this.a) {
        break label77;
      }
      this.b.b(paramArrayOfByte, paramInt1, paramInt2);
    }
    for (;;)
    {
      a(false);
      return;
      label77:
      this.b.a(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */