package com.umeng.socialize.c.a;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.b.c;
import com.umeng.socialize.common.a;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socom.net.s;
import com.umeng.socom.net.s.a;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class b
  extends s
{
  private static final String g = b.class.getName();
  protected Class<? extends e> a;
  protected int b;
  protected Context c;
  private b.b h;
  private SocializeEntity i;
  private Map<String, s.a> j = new HashMap();
  
  public b(Context paramContext, String paramString, Class<? extends e> paramClass, SocializeEntity paramSocializeEntity, int paramInt, b.b paramb)
  {
    super("");
    this.a = paramClass;
    this.b = paramInt;
    this.c = paramContext;
    this.h = paramb;
    this.i = paramSocializeEntity;
  }
  
  private boolean a(byte[] paramArrayOfByte, b.a parama, String paramString)
  {
    if (b.a.a == parama)
    {
      String str = a.a(paramArrayOfByte);
      parama = str;
      if (TextUtils.isEmpty(str)) {
        parama = "png";
      }
      str = paramString;
      if (TextUtils.isEmpty(paramString)) {
        str = System.currentTimeMillis();
      }
      paramArrayOfByte = new s.a(str + "." + parama, paramArrayOfByte);
      this.j.put(c.v, paramArrayOfByte);
      return true;
    }
    return false;
  }
  
  protected abstract String a();
  
  protected abstract Map<String, Object> a(Map<String, Object> paramMap);
  
  public void a(UMediaObject paramUMediaObject, Map<String, Object> paramMap)
  {
    if (paramUMediaObject != null)
    {
      if (!paramUMediaObject.isUrlMedia()) {
        break label102;
      }
      paramMap.putAll(paramUMediaObject.toUrlExtraParams());
    }
    for (;;)
    {
      try
      {
        if ((paramUMediaObject instanceof BaseMediaObject))
        {
          localObject = (BaseMediaObject)paramUMediaObject;
          paramUMediaObject = ((BaseMediaObject)localObject).getQzone_title();
          localObject = ((BaseMediaObject)localObject).getQzone_thumb();
          if ((!TextUtils.isEmpty(paramUMediaObject)) || (!TextUtils.isEmpty((CharSequence)localObject)))
          {
            JSONObject localJSONObject = new JSONObject();
            localJSONObject.put(c.A, paramUMediaObject);
            localJSONObject.put(c.B, localObject);
            paramMap.put("ext", localJSONObject);
          }
        }
        return;
      }
      catch (Exception paramUMediaObject)
      {
        Object localObject;
        label102:
        paramUMediaObject = g;
      }
      localObject = paramUMediaObject.toByte();
      if (localObject != null) {
        a((byte[])localObject, b.a.a, null);
      }
    }
  }
  
  public void a(String paramString)
  {
    try
    {
      paramString = new URL(new URL(paramString), a()).toString();
      super.a(paramString);
      return;
    }
    catch (Exception paramString)
    {
      throw new SocializeException("Can not generate correct url in SocializeRequest [" + j() + "]", paramString);
    }
  }
  
  public Map<String, Object> b()
  {
    return a(com.umeng.socialize.c.b.b.a(this.c, this.i, this.b));
  }
  
  public Map<String, s.a> c()
  {
    return this.j;
  }
  
  public JSONObject d()
  {
    return null;
  }
  
  public String e()
  {
    Map localMap = a(com.umeng.socialize.c.b.b.a(this.c, this.i, this.b));
    return com.umeng.socialize.c.b.b.a(j(), localMap);
  }
  
  protected String f()
  {
    switch (i()[this.h.ordinal()])
    {
    default: 
      return e;
    }
    return d;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */