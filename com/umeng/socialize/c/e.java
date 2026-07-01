package com.umeng.socialize.c;

import com.umeng.socialize.bean.UMComment;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e
  extends com.umeng.socialize.c.a.e
{
  public List<UMComment> a;
  
  public e(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
  }
  
  public void a()
  {
    Object localObject = this.l;
    if (localObject == null) {
      localObject = com.umeng.socialize.c.a.e.k;
    }
    for (;;)
    {
      return;
      try
      {
        this.a = new ArrayList();
        JSONArray localJSONArray = ((JSONObject)localObject).getJSONArray("cms");
        int i = 0;
        while (i < localJSONArray.length())
        {
          UMComment localUMComment = UMComment.parseJson((JSONObject)localJSONArray.get(i));
          if (localUMComment != null) {
            this.a.add(localUMComment);
          }
          i += 1;
        }
        String str;
        return;
      }
      catch (JSONException localJSONException)
      {
        str = k;
        new StringBuilder("Parse json error[ ").append(((JSONObject)localObject).toString()).append(" ]").toString();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */