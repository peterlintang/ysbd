package com.umeng.newxp.net;

import com.umeng.common.ufp.net.f;
import com.umeng.common.ufp.util.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class m
  extends f
{
  public static String[] e;
  private static final String f = m.class.getName();
  public Map<String, Object> d;
  
  public m(Map<String, Object> paramMap)
  {
    this.d = paramMap;
  }
  
  public static m a(JSONObject paramJSONObject)
  {
    Iterator localIterator = paramJSONObject.keys();
    HashMap localHashMap = new HashMap();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramJSONObject.get(str));
    }
    return new m(localHashMap);
  }
  
  public JSONObject a()
  {
    return new JSONObject(this.d);
  }
  
  public String b()
  {
    return h.a(this.d, this.c).toString();
  }
  
  public String c()
  {
    return b;
  }
  
  public String e()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!str.equals("date")) && (!str.equals("action_type")) && (!str.equals("time")) && (!str.equals("ts"))) {
        localHashMap.put(str, this.d.get(str));
      }
    }
    return h.a(localHashMap, this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */