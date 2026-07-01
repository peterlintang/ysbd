package com.umeng.socialize.c;

import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.c.a.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class t
  extends e
{
  public Map<SHARE_MEDIA, Integer> a;
  
  public t(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
  }
  
  public void a()
  {
    super.a();
    this.a = new HashMap();
    SHARE_MEDIA[] arrayOfSHARE_MEDIA = SHARE_MEDIA.values();
    int j;
    int i;
    if (arrayOfSHARE_MEDIA != null)
    {
      j = arrayOfSHARE_MEDIA.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j) {
        return;
      }
      SHARE_MEDIA localSHARE_MEDIA = arrayOfSHARE_MEDIA[i];
      String str = localSHARE_MEDIA.toString();
      if (this.l.has(str)) {}
      try
      {
        int k = this.l.getJSONObject(str).optInt("st");
        this.a.put(localSHARE_MEDIA, Integer.valueOf(k));
        i += 1;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */