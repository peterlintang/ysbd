package com.umeng.newxp.net;

import com.umeng.common.ufp.net.j;
import org.json.JSONObject;

public class f
  extends j
{
  public String a;
  public int b;
  public int c;
  public String d;
  
  public f(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    this.b = paramJSONObject.optInt("status", 0);
    this.a = paramJSONObject.optString("msg", "");
    this.c = paramJSONObject.optInt("remain", 0);
    this.d = paramJSONObject.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */