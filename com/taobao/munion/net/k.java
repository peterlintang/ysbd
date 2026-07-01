package com.taobao.munion.net;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.p4p.statistics.model.c;
import com.taobao.munion.utils.n;
import com.taobao.munion.utils.o;
import com.taobao.munion.utils.q;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

public class k
  implements Parcelable, m, Cloneable
{
  public static final Parcelable.Creator<k> b = new k.1();
  protected e a;
  private Map<String, Object> c = new TreeMap();
  
  private String f()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    b();
    Iterator localIterator = this.c.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder.append(String.format("%s=%s", new Object[] { str, this.c.get(str) }));
      if (localIterator.hasNext()) {
        localStringBuilder.append("&");
      }
    }
    return localStringBuilder.toString().trim();
  }
  
  public Object a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new String(paramArrayOfByte);
    try
    {
      if ((this.a.k() != null) && (Integer.valueOf((String)this.a.k().get("response-code")).intValue() == 302)) {
        return new l(null, this.a);
      }
      paramArrayOfByte = new l(new JSONObject(paramArrayOfByte), this.a);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      com.taobao.munion.utils.k.b("syncPaser exception " + paramArrayOfByte.toString());
    }
    return null;
  }
  
  public String a()
  {
    Object localObject = this.c.get("api");
    if (localObject != null) {
      return localObject.toString();
    }
    return "";
  }
  
  protected void a(e parame)
  {
    if (parame.k == null) {
      parame.k = new HashMap();
    }
    parame.k.put("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
    parame.k.put("Accept-Encoding", "gzip");
  }
  
  public void a(String paramString)
  {
    this.c.remove(paramString);
  }
  
  public void a(String paramString, long paramLong)
  {
    this.c.put(paramString, String.valueOf(paramLong));
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      this.c.put(paramString1, URLEncoder.encode(String.valueOf(paramString2), "utf-8"));
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public void a(Map<String, String> paramMap)
  {
    this.c.putAll(paramMap);
  }
  
  public void a(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = localIterator.next().toString();
        this.c.put(str, paramJSONObject.optString(str));
      }
    }
  }
  
  public Object b(String paramString)
  {
    return this.c.get(paramString);
  }
  
  protected void b()
  {
    a("utdId", q.b().a());
    a("appName", o.k().packageName);
    a("appVersion", o.k().versionName);
    a("os", "android");
    a("apiVersion", "1.0");
    a("appKey", MunionConfigManager.getInstance().getAppKey());
    a("width", o.l());
    a("height", o.m());
    this.c.remove("sign");
    if (!com.taobao.munion.utils.l.b(MunionConfigManager.sSecret)) {
      a("sign", n.a(this.c, MunionConfigManager.sSecret));
    }
  }
  
  protected void b(e parame)
  {
    if (parame.k == null) {
      parame.k = new HashMap();
    }
    parame.k.put("User-Agent", "muclient");
    parame.k.put("Referer", "native null refer");
    try
    {
      String str = c.a(MunionConfigManager.getInstance().getContext(), null).a();
      new StringBuilder("Http accept data: ").append(str).toString();
      parame.k.put("Accept", str);
      return;
    }
    catch (Exception parame)
    {
      parame.printStackTrace();
    }
  }
  
  public String c()
  {
    return MunionConfigManager.getInstance().getHost();
  }
  
  public void c(String paramString)
  {
    this.c.put("api", paramString);
  }
  
  public Object clone()
  {
    k localk = (k)super.clone();
    localk.c = new HashMap(this.c);
    return localk;
  }
  
  protected void d()
  {
    this.a = new e();
    a(this.a);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public l e()
  {
    if (!a().equals("com.taobao.alimama.favorite.getSecret")) {
      MunionConfigManager.getInstance().checkInitStatus();
    }
    d();
    String str = f();
    com.taobao.munion.utils.k.a("getData = " + c() + str);
    this.a.b(str);
    return (l)f.a().a(this, this.a);
  }
  
  public String toString()
  {
    return this.c.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeMap(this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */