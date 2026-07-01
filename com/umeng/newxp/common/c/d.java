package com.umeng.newxp.common.c;

public class d
{
  public static byte[] a(int paramInt)
  {
    int i = (byte)(paramInt % 256);
    paramInt >>= 8;
    int j = (byte)(paramInt % 256);
    paramInt >>= 8;
    int k = (byte)(paramInt % 256);
    return new byte[] { (byte)((paramInt >> 8) % 256), k, j, i };
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte.length == 4)
    {
      paramArrayOfByte[3] = ((byte)(paramInt % 256));
      paramInt >>= 8;
      paramArrayOfByte[2] = ((byte)(paramInt % 256));
      paramInt >>= 8;
      paramArrayOfByte[1] = ((byte)(paramInt % 256));
      paramArrayOfByte[0] = ((byte)((paramInt >> 8) % 256));
      return paramArrayOfByte;
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */