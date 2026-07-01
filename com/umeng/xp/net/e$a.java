package com.umeng.xp.net;

import android.content.Context;
import android.location.Location;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.ExchangeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class e$a
{
  private static final Random t = new Random();
  private static final int u = 32767;
  Context a;
  List<Promoter> b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private int k;
  private String l;
  private String m;
  private String n;
  private int o;
  private int p;
  private int q;
  private int r;
  private String s;
  private int v;
  private String w;
  private int x = 0;
  private int y = 1;
  
  public e$a(Context paramContext)
  {
    this.a = paramContext;
    this.b = new ArrayList();
  }
  
  private boolean a(Map<String, Object> paramMap)
  {
    boolean bool1 = true;
    if (e.e == null) {
      e.e = new String[] { "category", "sid", "device_id", "idmd5", "mc", "action_type", "action_index", "layout_type", "time", "date" };
    }
    boolean bool2;
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      bool2 = false;
      return bool2;
    }
    String[] arrayOfString = e.e;
    int i2 = arrayOfString.length;
    int i1 = 0;
    for (;;)
    {
      bool2 = bool1;
      if (i1 >= i2) {
        break;
      }
      String str = arrayOfString[i1];
      if (!paramMap.containsKey(str))
      {
        Log.b(ExchangeConstants.LOG_TAG, "Report params has no required param [" + str + "]");
        bool1 = false;
      }
      i1 += 1;
    }
  }
  
  private Map<String, Object> c()
  {
    HashMap localHashMap = new HashMap();
    try
    {
      if (!com.umeng.common.b.g.c(this.d)) {
        localHashMap.put("slot_id", this.d);
      }
      for (;;)
      {
        localHashMap.put("sdk_version", this.e);
        localHashMap.put("protocol_version", this.f);
        localHashMap.put("os", "android");
        localHashMap.put("rid", Integer.valueOf(this.v));
        if (!com.umeng.common.b.g.c(this.w)) {
          localHashMap.put("tcost", this.w);
        }
        if (!com.umeng.common.b.g.c(this.g)) {
          localHashMap.put("sid", this.g);
        }
        if (!com.umeng.common.b.g.c(this.h)) {
          localHashMap.put("device_id", this.h);
        }
        Location localLocation = b.l(this.a);
        if (localLocation != null)
        {
          localHashMap.put("lat", String.valueOf(localLocation.getLatitude()));
          localHashMap.put("lng", String.valueOf(localLocation.getLongitude()));
          localHashMap.put("gpst", String.valueOf(localLocation.getTime()));
        }
        localHashMap.put("date", this.i);
        localHashMap.put("time", this.j);
        localHashMap.put("timezone", Integer.valueOf(this.k));
        localHashMap.put("orientation", this.l);
        if (!com.umeng.common.b.g.c(this.m)) {
          break label331;
        }
        Log.b(ExchangeConstants.LOG_TAG, "Empty promoters found. Report aborted.");
        return null;
        if (com.umeng.common.b.g.c(this.c)) {
          break;
        }
        localHashMap.put("app_key", this.c);
      }
      return localHashMap;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    for (;;)
    {
      Log.b(ExchangeConstants.LOG_TAG, "Both UMENG_APPKEY and UMENG_SLOTID are empty, please specify either one.  Report aborted.");
      return null;
      label331:
      localHashMap.put("promoter", this.m);
      localHashMap.put("category", this.n);
      localHashMap.put("action_type", Integer.valueOf(this.o));
      localHashMap.put("action_index", Integer.valueOf(this.p));
      localHashMap.put("layout_type", Integer.valueOf(this.q));
      localHashMap.put("page_level", Integer.valueOf(this.r));
      if (!com.umeng.common.b.g.c(this.s)) {
        localHashMap.put("channel", this.s);
      }
      if (this.x != 0) {
        localHashMap.put("display_style", Integer.valueOf(this.x));
      }
      localHashMap.put("page_content_type", Integer.valueOf(this.y));
    }
  }
  
  public a a(int paramInt)
  {
    this.o = paramInt;
    return this;
  }
  
  public a a(String paramString)
  {
    this.d = paramString;
    return this;
  }
  
  public a a(Promoter... paramVarArgs)
  {
    int i2 = paramVarArgs.length;
    int i1 = 0;
    Object localObject;
    while (i1 < i2)
    {
      localObject = paramVarArgs[i1];
      this.b.add(localObject);
      i1 += 1;
    }
    if ((this.b != null) && (this.b.size() > 0))
    {
      i2 = this.b.size();
      paramVarArgs = new StringBuffer();
      localObject = new StringBuffer();
      i1 = 0;
      while (i1 < i2)
      {
        Promoter localPromoter = (Promoter)this.b.get(i1);
        paramVarArgs.append(localPromoter.promoter + ",");
        ((StringBuffer)localObject).append(localPromoter.category + ",");
        i1 += 1;
      }
      paramVarArgs.deleteCharAt(paramVarArgs.length() - 1);
      this.m = paramVarArgs.toString();
      this.n = ((StringBuffer)localObject).toString();
    }
    return this;
  }
  
  public e a()
  {
    return new e(b());
  }
  
  public a b(int paramInt)
  {
    this.p = paramInt;
    return this;
  }
  
  public a b(String paramString)
  {
    this.g = paramString;
    return this;
  }
  
  public Map<String, Object> b()
  {
    this.c = com.umeng.xp.common.g.a(this.a);
    this.e = ExchangeConstants.sdk_version;
    this.f = ExchangeConstants.protocol_version;
    this.h = b.f(this.a);
    Object localObject = com.umeng.common.b.g.a();
    this.i = localObject.split(" ")[0];
    this.j = localObject.split(" ")[1];
    this.k = b.n(this.a);
    if (b.c(this.a)) {}
    for (localObject = "0";; localObject = "1")
    {
      this.l = ((String)localObject);
      this.s = com.umeng.xp.common.g.b(this.a);
      this.v = t.nextInt(32767);
      localObject = c();
      if ((ExchangeConstants.DEBUG_MODE) && (!a((Map)localObject))) {
        Log.e(ExchangeConstants.LOG_TAG, "Report params verify failed...");
      }
      return (Map<String, Object>)localObject;
    }
  }
  
  public a c(int paramInt)
  {
    this.q = paramInt;
    return this;
  }
  
  public a c(String paramString)
  {
    this.w = paramString;
    return this;
  }
  
  public a d(int paramInt)
  {
    this.r = paramInt;
    return this;
  }
  
  public a e(int paramInt)
  {
    this.y = paramInt;
    return this;
  }
  
  public a f(int paramInt)
  {
    this.x = paramInt;
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */