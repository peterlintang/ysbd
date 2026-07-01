package com.tencent.mm.a;

public final class b
{
  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    int i = 0;
    while (i < 4)
    {
      arrayOfByte[i] = ((byte)(paramInt >> i * 8 & 0xFF));
      i += 1;
    }
    return arrayOfByte;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */