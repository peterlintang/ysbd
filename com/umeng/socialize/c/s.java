package com.umeng.socialize.c;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMLocation;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.b.c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class s
  extends b
{
  private static final String g = "/share/multi_add/";
  private static final int h = 17;
  private SocializeEntity i;
  private com.umeng.socialize.bean.m[] j;
  private UMShareMsg k;
  
  public s(Context paramContext, SocializeEntity paramSocializeEntity, com.umeng.socialize.bean.m[] paramArrayOfm, UMShareMsg paramUMShareMsg)
  {
    super(paramContext, "", t.class, paramSocializeEntity, 17, b.b.b);
    this.c = paramContext;
    this.i = paramSocializeEntity;
    this.k = paramUMShareMsg;
    this.j = paramArrayOfm;
  }
  
  protected String a()
  {
    return "/share/multi_add/" + com.umeng.socialize.common.m.a(this.c) + "/" + this.i.entityKey + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    int m;
    if ((this.j != null) && (this.j.length > 0)) {
      m = 0;
    }
    for (;;)
    {
      if (m >= this.j.length)
      {
        paramMap.put("sns", localJSONObject.toString());
        if (!TextUtils.isEmpty(this.k.text)) {
          paramMap.put(c.s, this.k.text);
        }
        paramMap.put("ak", com.umeng.socialize.common.m.a(this.c));
        if (this.k.location != null) {
          paramMap.put(c.t, this.k.location.toString());
        }
        if (this.k.getMedia() != null) {
          a(this.k.getMedia(), paramMap);
        }
        return paramMap;
      }
      Object localObject = this.j[m];
      if (!TextUtils.isEmpty(((com.umeng.socialize.bean.m)localObject).a)) {
        try
        {
          String str = ((com.umeng.socialize.bean.m)localObject).a;
          if (TextUtils.isEmpty(((com.umeng.socialize.bean.m)localObject).b)) {}
          for (localObject = "";; localObject = ((com.umeng.socialize.bean.m)localObject).b)
          {
            localJSONObject.put(str, localObject);
            break;
          }
          m += 1;
        }
        catch (JSONException localJSONException) {}
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */