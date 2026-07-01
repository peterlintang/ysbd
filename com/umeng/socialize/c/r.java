package com.umeng.socialize.c;

import com.umeng.socialize.c.a.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class r
  extends e
{
  public Map<String, Integer> a;
  
  public r(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
  }
  
  public void a()
  {
    super.a();
    this.a = new HashMap();
    Iterator localIterator = this.l.keys();
    if (!localIterator.hasNext()) {
      return;
    }
    String str = (String)localIterator.next();
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = this.l.getJSONObject(str);
        if (localJSONObject == null) {
          break label90;
        }
        i = localJSONObject.optInt("st", -102);
        this.a.put(str, Integer.valueOf(i));
      }
      catch (JSONException localJSONException) {}
      break;
      label90:
      int i = -102;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */