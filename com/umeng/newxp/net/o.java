package com.umeng.newxp.net;

import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.j;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a;
import com.umeng.newxp.b;
import com.umeng.newxp.c;
import com.umeng.newxp.common.ExchangeConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o
  extends j
{
  private static final String y = o.class.getName();
  public int a;
  public int b;
  public int c;
  public String d;
  public String e;
  public int f = 0;
  public int g;
  public int h;
  public String i;
  public String j = "";
  public int k = -1;
  public c l = c.a;
  public int m = 0;
  public String n = "";
  public long o = -1L;
  public String[] p;
  public JSONObject q;
  public b r = b.a;
  public a s = a.a;
  public JSONArray t;
  public String u;
  public String v = "";
  public String w = "";
  public String x = "";
  
  public o(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
    this.q = paramJSONObject;
    a(paramJSONObject);
  }
  
  private void a(JSONObject paramJSONObject)
  {
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
        if (paramJSONObject.has("filter")) {
          this.c = paramJSONObject.getInt("filter");
        }
        if (paramJSONObject.has("show_size")) {
          this.b = paramJSONObject.getInt("show_size");
        }
        if (paramJSONObject.has("sid")) {
          this.d = paramJSONObject.getString("sid");
        }
        this.e = paramJSONObject.optString("psid", "");
        if (paramJSONObject.has("interval")) {
          this.f = paramJSONObject.getInt("interval");
        }
        if (paramJSONObject.has("preload")) {
          this.h = paramJSONObject.getInt("preload");
        }
        if (paramJSONObject.has("landing_image")) {
          this.i = paramJSONObject.getString("landing_image");
        }
        this.w = paramJSONObject.optString("landing_url", "");
        if (paramJSONObject.has("opensize"))
        {
          float f1 = Float.parseFloat(paramJSONObject.getString("opensize")) / 100.0F;
          this.j = f1;
        }
        if (paramJSONObject.has("more")) {
          this.g = paramJSONObject.getInt("more");
        }
        if (paramJSONObject.has("template")) {
          this.l = c.a(paramJSONObject.getString("template"));
        }
        if (paramJSONObject.has("resource_type"))
        {
          localObject = b.a(paramJSONObject.optString("resource_type", b.a.toString()));
          if (localObject != null) {
            this.r = ((b)localObject);
          }
        }
        else
        {
          if (!paramJSONObject.has("new_num")) {
            break label457;
          }
          this.k = paramJSONObject.getInt("new_num");
          localObject = paramJSONObject.optJSONObject("dm");
          if (localObject == null) {
            break label465;
          }
          this.m = ((JSONObject)localObject).optInt("on");
          this.o = (((JSONObject)localObject).optInt("tm") * 60 * 60 * 1000);
          this.n = paramJSONObject.optString("act_pams", "");
          this.v = paramJSONObject.optString("landing_text", "");
          if (paramJSONObject.has("tabs")) {
            this.t = paramJSONObject.optJSONArray("tabs");
          }
          this.u = paramJSONObject.optString("location", "全国");
          a locala = a.a(paramJSONObject.optString("module", a.a.toString()));
          localObject = locala;
          if (locala == null) {
            localObject = a.a;
          }
          this.s = ((a)localObject);
          this.x = paramJSONObject.optString("display_type", "bigImg");
          return;
        }
      }
      catch (JSONException paramJSONObject)
      {
        Log.b(y, "Parse json error", paramJSONObject);
        return;
      }
      Object localObject = b.a;
      continue;
      label457:
      this.k = -1;
      continue;
      label465:
      this.m = 0;
      this.m = -1;
    }
  }
  
  public <T extends Promoter> List<T> a(Class<T> paramClass)
  {
    Log.a(y, "get promoters use class " + paramClass.toString());
    ArrayList localArrayList = new ArrayList();
    try
    {
      JSONArray localJSONArray;
      int i1;
      if ((1 == this.a) && (this.q.has("promoters")))
      {
        localJSONArray = this.q.getJSONArray("promoters");
        i1 = 0;
      }
      while (i1 < localJSONArray.length())
      {
        Promoter localPromoter = Promoter.getPromoterFromJson((JSONObject)localJSONArray.get(i1), paramClass);
        localPromoter.slot_act_pams = this.n;
        localArrayList.add(localPromoter);
        i1 += 1;
        continue;
        Log.b(ExchangeConstants.LOG_TAG, "failed requesting");
      }
      return localArrayList;
    }
    catch (Exception paramClass)
    {
      Log.b(y, "", paramClass);
    }
    return localArrayList;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */