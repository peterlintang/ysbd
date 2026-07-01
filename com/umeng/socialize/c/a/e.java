package com.umeng.socialize.c.a;

import android.text.TextUtils;
import com.umeng.socom.Log;
import com.umeng.socom.net.t;
import org.json.JSONException;
import org.json.JSONObject;

public class e
  extends t
{
  protected static final String k = e.class.getName();
  protected JSONObject l = a(paramJSONObject);
  public String m;
  public int n = -103;
  
  public e(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    a();
  }
  
  private JSONObject a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      Log.b(k, "failed requesting");
    }
    do
    {
      return null;
      try
      {
        this.n = paramJSONObject.optInt("st", 0);
        if (this.n == 0)
        {
          Log.b(k, "no status code in response.");
          return null;
        }
      }
      catch (JSONException paramJSONObject)
      {
        Log.b(k, "Data body can`t convert to json ");
        return null;
      }
      this.m = paramJSONObject.optString("msg", "");
      paramJSONObject = paramJSONObject.optString("data", null);
    } while (TextUtils.isEmpty(paramJSONObject));
    paramJSONObject = new JSONObject(paramJSONObject);
    return paramJSONObject;
  }
  
  public void a() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */