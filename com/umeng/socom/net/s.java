package com.umeng.socom.net;

import java.util.Map;
import org.json.JSONObject;

public abstract class s
{
  protected static String d = "POST";
  protected static String e = "GET";
  protected String f;
  
  public s(String paramString)
  {
    this.f = paramString;
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public Map<String, Object> b()
  {
    return null;
  }
  
  public Map<String, s.a> c()
  {
    return null;
  }
  
  public abstract JSONObject d();
  
  public abstract String e();
  
  protected String f()
  {
    return d;
  }
  
  public String j()
  {
    return this.f;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */