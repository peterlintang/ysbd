package com.taobao.munion.net;

import org.json.JSONObject;

public class p
  extends k
{
  public Object a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new String(paramArrayOfByte);
    try
    {
      paramArrayOfByte = new q(new JSONObject(paramArrayOfByte), this.a);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      com.taobao.munion.utils.k.b("syncPaser exception " + paramArrayOfByte.toString());
    }
    return null;
  }
  
  protected void b() {}
  
  public String c()
  {
    return com.umeng.newxp.net.h.e[0];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */