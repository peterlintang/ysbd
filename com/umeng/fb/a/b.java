package com.umeng.fb.a;

import com.umeng.common.net.k;
import org.json.JSONObject;

public class b
  extends k
{
  public String d;
  public JSONObject e;
  public String f;
  
  public b(String paramString)
  {
    super(paramString);
    this.f = paramString;
  }
  
  public b(String paramString1, JSONObject paramJSONObject, String paramString2)
  {
    super(paramString2);
    this.d = paramString1;
    this.e = paramJSONObject;
    this.f = paramString2;
  }
  
  public JSONObject a()
  {
    return this.e;
  }
  
  public String b()
  {
    return this.f;
  }
  
  public String c()
  {
    return a;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */