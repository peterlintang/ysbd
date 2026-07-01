package com.umeng.common.ufp.net;

import org.json.JSONObject;

public abstract class i
{
  protected static String a = "POST";
  protected static String b = "GET";
  protected String c;
  
  public i(String paramString)
  {
    this.c = paramString;
  }
  
  public abstract JSONObject a();
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public abstract String b();
  
  protected String c()
  {
    return a;
  }
  
  public String d()
  {
    return this.c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */