package com.umeng.newxp.common.a.a;

import com.umeng.newxp.common.a.a;
import com.umeng.newxp.common.a.b;
import com.umeng.newxp.common.a.e;
import java.io.UnsupportedEncodingException;

public class k
  implements a, b
{
  public static final String a = "UTF-8";
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final char[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private final String d;
  
  public k()
  {
    this.d = "UTF-8";
  }
  
  public k(String paramString)
  {
    this.d = paramString;
  }
  
  protected static int a(char paramChar, int paramInt)
  {
    int i = Character.digit(paramChar, 16);
    if (i == -1) {
      throw new e("Illegal hexadecimal character " + paramChar + " at index " + paramInt);
    }
    return i;
  }
  
  public static byte[] a(char[] paramArrayOfChar)
  {
    int j = 0;
    int k = paramArrayOfChar.length;
    if ((k & 0x1) != 0) {
      throw new e("Odd number of characters.");
    }
    byte[] arrayOfByte = new byte[k >> 1];
    int i = 0;
    while (j < k)
    {
      int m = a(paramArrayOfChar[j], j);
      j += 1;
      int n = a(paramArrayOfChar[j], j);
      j += 1;
      arrayOfByte[i] = ((byte)((m << 4 | n) & 0xFF));
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static char[] a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (char[] arrayOfChar = b;; arrayOfChar = c) {
      return a(paramArrayOfByte, arrayOfChar);
    }
  }
  
  protected static char[] a(byte[] paramArrayOfByte, char[] paramArrayOfChar)
  {
    int j = 0;
    int k = paramArrayOfByte.length;
    char[] arrayOfChar = new char[k << 1];
    int i = 0;
    while (i < k)
    {
      int m = j + 1;
      arrayOfChar[j] = paramArrayOfChar[((paramArrayOfByte[i] & 0xF0) >>> 4)];
      j = m + 1;
      arrayOfChar[m] = paramArrayOfChar[(paramArrayOfByte[i] & 0xF)];
      i += 1;
    }
    return arrayOfChar;
  }
  
  public static char[] c(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, true);
  }
  
  public static String d(byte[] paramArrayOfByte)
  {
    return new String(c(paramArrayOfByte));
  }
  
  /* Error */
  public Object a(Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 97
    //   4: ifeq +16 -> 20
    //   7: aload_1
    //   8: checkcast 97	java/lang/String
    //   11: invokevirtual 109	java/lang/String:toCharArray	()[C
    //   14: astore_1
    //   15: aload_1
    //   16: invokestatic 111	com/umeng/newxp/common/a/a/k:a	([C)[B
    //   19: areturn
    //   20: aload_1
    //   21: checkcast 112	[C
    //   24: astore_1
    //   25: goto -10 -> 15
    //   28: astore_1
    //   29: new 59	com/umeng/newxp/common/a/e
    //   32: dup
    //   33: aload_1
    //   34: invokevirtual 115	java/lang/ClassCastException:getMessage	()Ljava/lang/String;
    //   37: aload_1
    //   38: invokespecial 118	com/umeng/newxp/common/a/e:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	k
    //   0	42	1	paramObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	15	28	java/lang/ClassCastException
    //   15	20	28	java/lang/ClassCastException
    //   20	25	28	java/lang/ClassCastException
  }
  
  public String a()
  {
    return this.d;
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = a(new String(paramArrayOfByte, a()).toCharArray());
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new e(paramArrayOfByte.getMessage(), paramArrayOfByte);
    }
  }
  
  /* Error */
  public Object b(Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 97
    //   4: ifeq +20 -> 24
    //   7: aload_1
    //   8: checkcast 97	java/lang/String
    //   11: aload_0
    //   12: invokevirtual 123	com/umeng/newxp/common/a/a/k:a	()Ljava/lang/String;
    //   15: invokevirtual 131	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic 99	com/umeng/newxp/common/a/a/k:c	([B)[C
    //   23: areturn
    //   24: aload_1
    //   25: checkcast 133	[B
    //   28: astore_1
    //   29: goto -10 -> 19
    //   32: astore_1
    //   33: new 135	com/umeng/newxp/common/a/g
    //   36: dup
    //   37: aload_1
    //   38: invokevirtual 115	java/lang/ClassCastException:getMessage	()Ljava/lang/String;
    //   41: aload_1
    //   42: invokespecial 136	com/umeng/newxp/common/a/g:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   45: athrow
    //   46: astore_1
    //   47: new 135	com/umeng/newxp/common/a/g
    //   50: dup
    //   51: aload_1
    //   52: invokevirtual 127	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   55: aload_1
    //   56: invokespecial 136	com/umeng/newxp/common/a/g:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	k
    //   0	60	1	paramObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	19	32	java/lang/ClassCastException
    //   19	24	32	java/lang/ClassCastException
    //   24	29	32	java/lang/ClassCastException
    //   0	19	46	java/io/UnsupportedEncodingException
    //   19	24	46	java/io/UnsupportedEncodingException
    //   24	29	46	java/io/UnsupportedEncodingException
  }
  
  public byte[] b(byte[] paramArrayOfByte)
  {
    return l.a(d(paramArrayOfByte), a());
  }
  
  public String toString()
  {
    return super.toString() + "[charsetName=" + this.d + "]";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */