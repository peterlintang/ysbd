package com.umeng.newxp.common.a.d;

import com.umeng.newxp.common.a.e;
import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.h;
import com.umeng.newxp.common.a.i;
import java.io.UnsupportedEncodingException;

public class a
  extends d
  implements h, i
{
  private final String d;
  
  public a()
  {
    this("UTF-8");
  }
  
  public a(String paramString)
  {
    this.d = paramString;
  }
  
  public Object a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof String)) {
      return a((String)paramObject);
    }
    throw new e("Objects of type " + paramObject.getClass().getName() + " cannot be decoded using BCodec");
  }
  
  protected String a()
  {
    return "B";
  }
  
  public String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = c(paramString);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new e(paramString.getMessage(), paramString);
    }
  }
  
  public String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    try
    {
      paramString1 = b(paramString1, paramString2);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new g(paramString1.getMessage(), paramString1);
    }
  }
  
  protected byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return com.umeng.newxp.common.a.a.d.e(paramArrayOfByte);
  }
  
  public Object b(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof String)) {
      return b((String)paramObject);
    }
    throw new g("Objects of type " + paramObject.getClass().getName() + " cannot be encoded using BCodec");
  }
  
  public String b()
  {
    return this.d;
  }
  
  public String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return a(paramString, b());
  }
  
  protected byte[] b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return com.umeng.newxp.common.a.a.d.j(paramArrayOfByte);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */