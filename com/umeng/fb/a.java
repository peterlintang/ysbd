package com.umeng.fb;

import java.util.Date;
import org.json.JSONObject;

public class a
  implements Comparable<a>
{
  String a;
  String b;
  public String c;
  public String d;
  public Date e;
  public a.b f;
  public a.a g = a.a.c;
  public JSONObject h;
  
  public a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      throw new Exception("invalid atom");
    }
    this.h = paramJSONObject;
    String str = paramJSONObject.optString("type");
    if ("new_feedback".equals(str))
    {
      this.f = a.b.a;
      str = paramJSONObject.optString("state");
      if (!"sending".equalsIgnoreCase(str)) {
        break label188;
      }
      this.g = a.a.a;
    }
    for (;;)
    {
      if (this.f == a.b.a) {
        this.a = paramJSONObject.optString("thread");
      }
      this.b = paramJSONObject.optString("thread");
      if (com.umeng.common.b.g.c(this.b)) {
        this.b = paramJSONObject.optString("content");
      }
      this.c = paramJSONObject.optString("feedback_id");
      this.e = g.a(paramJSONObject.optString("datetime"));
      return;
      if ("dev_reply".equals(str))
      {
        this.f = a.b.c;
        break;
      }
      if (!"user_reply".equals(str)) {
        break;
      }
      this.f = a.b.b;
      break;
      label188:
      if ("fail".equalsIgnoreCase(str)) {
        this.g = a.a.b;
      } else if ("ok".equalsIgnoreCase(str)) {
        this.g = a.a.c;
      } else if ("ReSending".equalsIgnoreCase(str)) {
        this.g = a.a.d;
      }
    }
  }
  
  public int a(a parama)
  {
    parama = parama.e;
    if ((this.e == null) || (parama == null) || (parama.equals(this.e))) {
      return 0;
    }
    if (parama.after(this.e)) {
      return -1;
    }
    return 1;
  }
  
  public String a()
  {
    if (this.f == a.b.a) {
      return this.a;
    }
    return this.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */