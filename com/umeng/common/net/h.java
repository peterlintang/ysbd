package com.umeng.common.net;

import org.json.JSONObject;

public class h
  extends l
{
  public h.a a;
  
  public h(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    if (("ok".equalsIgnoreCase(paramJSONObject.optString("status"))) || ("ok".equalsIgnoreCase(paramJSONObject.optString("success"))))
    {
      this.a = h.a.a;
      return;
    }
    this.a = h.a.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */