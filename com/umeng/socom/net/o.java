package com.umeng.socom.net;

import org.json.JSONObject;

public class o
  extends t
{
  public o.a a;
  
  public o(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    if (("ok".equalsIgnoreCase(paramJSONObject.optString("status"))) || ("ok".equalsIgnoreCase(paramJSONObject.optString("success"))))
    {
      this.a = o.a.a;
      return;
    }
    this.a = o.a.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */