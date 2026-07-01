package com.umeng.socialize.c;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMLocation;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.media.UMediaObject;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c
  extends b
{
  private static final String g = "/comment/add/";
  private static final int h = 5;
  private UMComment i;
  private SocializeEntity j;
  private com.umeng.socialize.bean.m[] k;
  
  public c(Context paramContext, SocializeEntity paramSocializeEntity, UMComment paramUMComment, com.umeng.socialize.bean.m[] paramArrayOfm)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 5, b.b.b);
    this.c = paramContext;
    this.i = paramUMComment;
    this.j = paramSocializeEntity;
    this.k = paramArrayOfm;
  }
  
  protected String a()
  {
    return "/comment/add/" + com.umeng.socialize.common.m.a(this.c) + "/" + this.j.entityKey + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put(com.umeng.socialize.c.b.c.s, this.i.text);
    if (this.i.location != null) {
      paramMap.put(com.umeng.socialize.c.b.c.t, this.i.location.toString());
    }
    if (!TextUtils.isEmpty(this.i.signature)) {
      paramMap.put(com.umeng.socialize.c.b.c.x, this.i.signature);
    }
    Object localObject = this.i.getMedia();
    if (localObject != null) {
      a((UMediaObject)localObject, paramMap);
    }
    if ((this.k != null) && (this.k.length > 0))
    {
      localObject = new JSONObject();
      try
      {
        com.umeng.socialize.bean.m[] arrayOfm = this.k;
        int n = arrayOfm.length;
        int m = 0;
        for (;;)
        {
          if (m >= n)
          {
            if (((JSONObject)localObject).toString().length() <= 2) {
              break;
            }
            paramMap.put("sns", ((JSONObject)localObject).toString());
            return paramMap;
          }
          com.umeng.socialize.bean.m localm = arrayOfm[m];
          if (localm != null) {
            ((JSONObject)localObject).put(localm.a.toString(), localm.b);
          }
          m += 1;
        }
        return paramMap;
      }
      catch (JSONException localJSONException) {}
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */