package com.umeng.newxp.common.c;

public class c
{
  public static boolean a(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null) && (paramArrayOfByte1.length >= paramInt1 + paramInt3) && (paramArrayOfByte2.length >= paramInt2 + paramInt3)) {
      i = 0;
    }
    while (i < paramInt3)
    {
      if (paramArrayOfByte1[(paramInt1 + i)] != paramArrayOfByte2[(paramInt2 + i)]) {
        return false;
      }
      i += 1;
    }
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */