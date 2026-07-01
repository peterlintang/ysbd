package com.taobao.munion.model;

import org.json.JSONObject;

public class c
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f = "";
  private String g = "";
  private int h;
  
  public c(String paramString)
  {
    e(paramString);
    this.b = "waterfall";
  }
  
  public c(JSONObject paramJSONObject, int paramInt)
  {
    this.a = paramJSONObject.optString("title");
    this.b = paramJSONObject.optString("template");
    this.c = paramJSONObject.optString("resource_type");
    this.d = paramJSONObject.optString("url_params");
    this.f = paramJSONObject.optString("tabid", "");
    this.h = paramInt;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public void e(String paramString)
  {
    this.e = paramString;
  }
  
  public int f()
  {
    return this.h;
  }
  
  public void f(String paramString)
  {
    this.f = paramString;
  }
  
  public String g()
  {
    return this.f;
  }
  
  public void g(String paramString)
  {
    this.g = paramString;
  }
  
  public String h()
  {
    return this.g;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */