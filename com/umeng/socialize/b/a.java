package com.umeng.socialize.b;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.text.TextUtils;
import com.umeng.socom.b;

public class a
  implements f
{
  private static final String a = a.class.getName();
  private Location b;
  private Context c;
  private d d;
  private c e = null;
  private String f;
  
  private void a(Context paramContext, int paramInt)
  {
    Object localObject1 = new Criteria();
    ((Criteria)localObject1).setAccuracy(paramInt);
    localObject1 = this.d.a((Criteria)localObject1, true);
    if (this.f != null) {
      localObject1 = this.f;
    }
    Object localObject2 = a;
    new StringBuilder("Get location from ").append((String)localObject1).toString();
    try
    {
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject2 = this.d.a((String)localObject1);
        if (localObject2 != null)
        {
          this.b = ((Location)localObject2);
          return;
        }
        if ((this.d.b((String)localObject1)) && (this.e != null) && ((paramContext instanceof Activity)))
        {
          this.d.a((Activity)paramContext, (String)localObject1, 1L, 0.0F, this.e);
          return;
        }
      }
    }
    catch (IllegalArgumentException paramContext) {}
  }
  
  public void a()
  {
    if ((this.d != null) && (this.e != null)) {
      this.d.a(this.e);
    }
  }
  
  public void a(Context paramContext)
  {
    this.c = paramContext;
    this.e = new c();
    b();
  }
  
  protected void a(Location paramLocation)
  {
    this.b = paramLocation;
  }
  
  public void a(d paramd)
  {
    this.d = paramd;
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public Location b()
  {
    if (this.b == null)
    {
      if (!b.a(this.c, "android.permission.ACCESS_FINE_LOCATION")) {
        break label33;
      }
      a(this.c, 1);
    }
    for (;;)
    {
      return this.b;
      label33:
      if (b.a(this.c, "android.permission.ACCESS_COARSE_LOCATION")) {
        a(this.c, 2);
      }
    }
  }
  
  protected d c()
  {
    return this.d;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */