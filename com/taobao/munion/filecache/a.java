package com.taobao.munion.filecache;

import java.io.UnsupportedEncodingException;

public class a
  implements j
{
  public int a()
  {
    return 14;
  }
  
  public h a(String paramString, h paramh, int paramInt, long paramLong)
  {
    paramh = (i)paramh;
    switch (paramInt)
    {
    default: 
      return paramh;
    case 1: 
      paramh.c(paramLong);
      return paramh;
    case 2: 
      paramh.c(paramLong);
      return paramh;
    case 3: 
      paramh.d();
      return paramh;
    }
    paramh = new i();
    paramh.a(paramString);
    paramh.c(paramLong);
    return paramh;
  }
  
  public h a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, paramInt1, paramInt2, "UTF-8");
      if (paramArrayOfByte.charAt(13) != '-') {
        return null;
      }
      i locali = new i();
      try
      {
        locali.c(Long.parseLong(paramArrayOfByte.substring(0, 13)));
        locali.a(new String(paramArrayOfByte.substring(14)));
        return locali;
      }
      catch (Exception paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        return null;
      }
      return null;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */