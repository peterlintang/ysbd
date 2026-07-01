package com.umeng.common.ufp.util;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class f
{
  public static int a;
  
  public static String a(byte[] paramArrayOfByte, String paramString)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    Inflater localInflater = new Inflater();
    byte[] arrayOfByte = new byte[100];
    localInflater.setInput(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = new StringBuilder();
    while (!localInflater.needsInput()) {
      paramArrayOfByte.append(new String(arrayOfByte, 0, localInflater.inflate(arrayOfByte), paramString));
    }
    localInflater.end();
    return paramArrayOfByte.toString();
  }
  
  public static byte[] a(String paramString1, String paramString2)
  {
    if (g.d(paramString1)) {
      return null;
    }
    Deflater localDeflater = new Deflater();
    localDeflater.setInput(paramString1.getBytes(paramString2));
    localDeflater.finish();
    paramString1 = new byte[' '];
    a = 0;
    try
    {
      paramString2 = new ByteArrayOutputStream();
      try
      {
        while (!localDeflater.finished())
        {
          int i = localDeflater.deflate(paramString1);
          a += i;
          paramString2.write(paramString1, 0, i);
        }
        if (paramString2 == null) {
          break label88;
        }
      }
      finally {}
    }
    finally
    {
      for (;;)
      {
        paramString2 = null;
      }
    }
    paramString2.close();
    label88:
    throw paramString1;
    localDeflater.end();
    if (paramString2 != null) {
      paramString2.close();
    }
    return paramString2.toByteArray();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\util\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */