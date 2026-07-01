package com.taobao.munion.model;

import com.taobao.munion.utils.k;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.c;
import com.umeng.newxp.common.ExchangeConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class b
{
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
  public c l;
  public int m = 0;
  public String n = "";
  public long o = -1L;
  public String[] p;
  public JSONObject q;
  public com.umeng.newxp.b r = com.umeng.newxp.b.a;
  public JSONArray s;
  private String t;
  private String u;
  private int v;
  private List<a> w;
  private int x = 7;
  
  public b(JSONObject paramJSONObject)
  {
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
    this.a = paramJSONObject.optInt("status");
    if (paramJSONObject.has("filter")) {
      this.c = paramJSONObject.optInt("filter");
    }
    if (paramJSONObject.has("show_size")) {
      this.b = paramJSONObject.optInt("show_size");
    }
    if (paramJSONObject.has("sid")) {
      this.d = paramJSONObject.optString("sid");
    }
    this.e = paramJSONObject.optString("psid", "");
    if (paramJSONObject.has("interval")) {
      this.f = paramJSONObject.optInt("interval");
    }
    if (paramJSONObject.has("preload")) {
      this.h = paramJSONObject.optInt("preload");
    }
    if (paramJSONObject.has("landing_image")) {
      this.i = paramJSONObject.optString("landing_image");
    }
    if (paramJSONObject.has("opensize"))
    {
      float f1 = Float.parseFloat(paramJSONObject.optString("opensize")) / 100.0F;
      this.j = f1;
    }
    if (paramJSONObject.has("more")) {
      this.g = paramJSONObject.optInt("more");
    }
    if (paramJSONObject.has("template")) {
      this.l = c.a(paramJSONObject.optString("template"));
    }
    Object localObject;
    if (paramJSONObject.has("resource_type"))
    {
      localObject = com.umeng.newxp.b.a(paramJSONObject.optString("resource_type", com.umeng.newxp.b.a.toString()));
      if (localObject != null) {
        label259:
        this.r = ((com.umeng.newxp.b)localObject);
      }
    }
    else
    {
      if (!paramJSONObject.has("new_num")) {
        break label364;
      }
      this.k = paramJSONObject.optInt("new_num");
      label283:
      localObject = paramJSONObject.optJSONObject("dm");
      if (localObject == null) {
        break label372;
      }
      this.m = ((JSONObject)localObject).optInt("on");
      this.o = (((JSONObject)localObject).optInt("tm") * 60 * 60 * 1000);
    }
    for (;;)
    {
      this.n = paramJSONObject.optString("act_pams", "");
      if (!paramJSONObject.has("tabs")) {
        break;
      }
      this.s = paramJSONObject.optJSONArray("tabs");
      return;
      localObject = com.umeng.newxp.b.a;
      break label259;
      label364:
      this.k = -1;
      break label283;
      label372:
      this.m = 0;
      this.m = -1;
    }
  }
  
  public String a()
  {
    return this.u;
  }
  
  public <T extends Promoter> List<T> a(Class<T> paramClass)
  {
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
      k.b(paramClass.toString());
    }
    return localArrayList;
  }
  
  public void a(int paramInt)
  {
    this.v = paramInt;
  }
  
  public void a(String paramString)
  {
    this.u = paramString;
  }
  
  public void a(JSONArray paramJSONArray)
  {
    if (paramJSONArray != null)
    {
      this.w = new ArrayList();
      int i1 = 0;
      while (i1 < paramJSONArray.length())
      {
        a locala = new a(paramJSONArray.getJSONObject(i1));
        this.w.add(locala);
        i1 += 1;
      }
    }
  }
  
  public int b()
  {
    return this.v;
  }
  
  public void b(int paramInt)
  {
    this.x = paramInt;
  }
  
  public void b(String paramString)
  {
    this.t = paramString;
  }
  
  public String c()
  {
    return this.t;
  }
  
  public List<a> d()
  {
    return this.w;
  }
  
  public void e()
  {
    this.w.clear();
    this.w = null;
  }
  
  public int f()
  {
    return this.x;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */