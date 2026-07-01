package com.umeng.socialize.bean;

import com.umeng.socialize.exception.SocializeException;

public class m
{
  public String a;
  public String b;
  
  public m(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public String a()
  {
    if (this.a != null)
    {
      StringBuilder localStringBuilder = new StringBuilder("{").append(this.a.toString()).append(":");
      if (this.b == null) {}
      for (String str = "";; str = this.b) {
        return str + "}";
      }
    }
    throw new SocializeException("can`t format snspair string.");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */