package com.taobao.munion.net;

import java.io.FilterInputStream;
import java.io.InputStream;

public class n
  extends FilterInputStream
{
  int a = 0;
  
  protected n(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i = super.read(paramArrayOfByte);
    this.a += i;
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    this.a += paramInt1;
    return paramInt1;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */