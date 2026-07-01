package com.umeng.socialize.c;

import com.umeng.socialize.c.a.e;
import com.umeng.socom.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class b
  extends e
{
  public int a;
  public int b;
  public int c;
  public String d;
  public String e;
  public int f;
  public int g;
  public String h;
  public String i;
  public int j;
  
  public b(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
  }
  
  public void a()
  {
    JSONObject localJSONObject = this.l;
    if (localJSONObject == null) {
      Log.b(e.k, "data json is null....");
    }
    for (;;)
    {
      return;
      try
      {
        if (localJSONObject.has("cm")) {
          this.b = localJSONObject.getInt("cm");
        }
        if (localJSONObject.has("ek")) {
          this.e = localJSONObject.getString("ek");
        }
        if (localJSONObject.has("ft")) {
          this.f = localJSONObject.getInt("ft");
        }
        if (localJSONObject.has("fr")) {
          this.g = localJSONObject.optInt("fr", 0);
        }
        if (localJSONObject.has("lk")) {
          this.c = localJSONObject.getInt("lk");
        }
        if (localJSONObject.has("pv")) {
          this.a = localJSONObject.getInt("pv");
        }
        if (localJSONObject.has("sid")) {
          this.d = localJSONObject.getString("sid");
        }
        if (localJSONObject.has("uid")) {
          this.h = localJSONObject.getString("uid");
        }
        if (localJSONObject.has("sn"))
        {
          this.j = localJSONObject.getInt("sn");
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Log.b(k, "Parse json error[ " + localJSONObject.toString() + " ]", localJSONException);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */