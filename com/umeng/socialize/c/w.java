package com.umeng.socialize.c;

import com.umeng.socialize.c.a.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class w
  extends e
{
  public Map<String, Object> a;
  
  public w(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
  }
  
  public void a()
  {
    this.a = new HashMap();
    try
    {
      JSONObject localJSONObject = this.l;
      Iterator localIterator = localJSONObject.keys();
      if (localIterator != null) {}
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          return;
        }
        try
        {
          String str = (String)localIterator.next();
          Object localObject = localJSONObject.get(str);
          this.a.put(str, localObject);
        }
        catch (JSONException localJSONException)
        {
          localJSONException.toString();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */