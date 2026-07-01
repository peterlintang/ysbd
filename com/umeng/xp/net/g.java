package com.umeng.xp.net;

import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.common.net.l;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.ExchangeConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class g
  extends l
{
  private static final String n = g.class.getName();
  public int a;
  public int b;
  public int c;
  public String d;
  public int e = 0;
  public int f;
  public int g;
  public String h;
  public String i = "";
  public int j = -1;
  public int k = 0;
  public List<Promoter> l;
  public JSONObject m;
  
  public g(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    this.m = paramJSONObject;
    a(paramJSONObject);
  }
  
  private void a(JSONObject paramJSONObject)
  {
    this.l = new ArrayList();
    if (paramJSONObject == null)
    {
      Log.b(ExchangeConstants.LOG_TAG, "failed requesting");
      return;
    }
    for (;;)
    {
      try
      {
        this.a = paramJSONObject.getInt("status");
        Object localObject;
        if ((1 == this.a) && (paramJSONObject.has("promoters")))
        {
          localObject = paramJSONObject.getJSONArray("promoters");
          int i1 = 0;
          if (i1 < ((JSONArray)localObject).length())
          {
            Promoter localPromoter = Promoter.getPromoterFromJson((JSONObject)((JSONArray)localObject).get(i1));
            this.l.add(localPromoter);
            i1 += 1;
            continue;
          }
        }
        else
        {
          Log.b(ExchangeConstants.LOG_TAG, "failed requesting");
        }
        if (paramJSONObject.has("filter")) {
          this.c = paramJSONObject.getInt("filter");
        }
        if (paramJSONObject.has("show_size")) {
          this.b = paramJSONObject.getInt("show_size");
        }
        if (paramJSONObject.has("sid")) {
          this.d = paramJSONObject.getString("sid");
        }
        if (paramJSONObject.has("interval")) {
          this.e = paramJSONObject.getInt("interval");
        }
        if (paramJSONObject.has("preload")) {
          this.g = paramJSONObject.getInt("preload");
        }
        if (paramJSONObject.has("landing_image")) {
          this.h = paramJSONObject.getString("landing_image");
        }
        if (paramJSONObject.has("opensize"))
        {
          float f1 = Float.parseFloat(paramJSONObject.getString("opensize")) / 100.0F;
          this.i = f1;
        }
        if (paramJSONObject.has("more")) {
          this.f = paramJSONObject.getInt("more");
        }
        if (paramJSONObject.has("template"))
        {
          localObject = paramJSONObject.getString("template");
          if ((!TextUtils.isEmpty((CharSequence)localObject)) && ("iconlist".equals(localObject))) {
            this.k = 1;
          }
        }
        else
        {
          if (!paramJSONObject.has("new_num")) {
            break;
          }
          this.j = paramJSONObject.getInt("new_num");
          return;
        }
      }
      catch (JSONException paramJSONObject)
      {
        Log.b(n, "Parse json error", paramJSONObject);
        return;
      }
      this.k = 0;
    }
    this.j = -1;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */