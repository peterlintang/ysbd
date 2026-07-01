package com.umeng.analytics;

import android.content.Context;
import com.umeng.common.Log;
import org.json.JSONObject;

final class b$b
  implements Runnable
{
  private final Object b = new Object();
  private Context c;
  private JSONObject d;
  
  b$b(b paramb1, b paramb2, Context paramContext, JSONObject paramJSONObject)
  {
    this.c = paramContext;
    this.d = paramJSONObject;
  }
  
  public final void run()
  {
    try
    {
      if (this.d.getString("type").equals("online_config"))
      {
        b.a(this.a, this.c, this.d);
        return;
      }
      synchronized (this.b)
      {
        this.a.a(this.c, this.d);
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      Log.b("MobclickAgent", "Exception occurred in ReportMessageHandler");
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */