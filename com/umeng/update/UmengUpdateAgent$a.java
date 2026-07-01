package com.umeng.update;

import android.app.Activity;
import android.content.Context;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.common.b.g;
import com.umeng.common.net.j;
import org.json.JSONObject;

public class UmengUpdateAgent$a
  extends j
  implements Runnable
{
  Context a;
  
  public UmengUpdateAgent$a(UmengUpdateAgent paramUmengUpdateAgent, Context paramContext)
  {
    this.a = paramContext;
  }
  
  private JSONObject a(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", "update");
      localJSONObject.put("appkey", b.p(paramContext));
      localJSONObject.put("version_code", b.d(paramContext));
      localJSONObject.put("package", b.u(paramContext));
      localJSONObject.put("sdk_version", "1.3.0.20120822");
      localJSONObject.put("idmd5", g.b(b.f(paramContext)));
      localJSONObject.put("channel", b.t(paramContext));
      return localJSONObject;
    }
    catch (Exception paramContext)
    {
      Log.b(UmengUpdateAgent.d(), "exception in updateInternal", paramContext);
    }
    return null;
  }
  
  private void a()
  {
    Object localObject1 = a(this.a);
    Object localObject2 = UmengUpdateAgent.e();
    localObject2.getClass();
    UmengUpdateAgent.b localb = new UmengUpdateAgent.b((UmengUpdateAgent)localObject2, (JSONObject)localObject1);
    int i = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = localObject1;
      if (i >= UmengUpdateAgent.f().length) {
        break;
      }
      localb.a(UmengUpdateAgent.f()[i]);
      localObject1 = (UpdateResponse)execute(localb, UpdateResponse.class);
      localObject2 = localObject1;
      if (localObject1 != null) {
        break;
      }
      i += 1;
    }
    if (localObject2 == null) {
      UmengUpdateAgent.a(3, null);
    }
    do
    {
      return;
      Log.a(UmengUpdateAgent.d(), "response : " + ((UpdateResponse)localObject2).hasUpdate);
      if (!((UpdateResponse)localObject2).hasUpdate) {
        break;
      }
      UmengUpdateAgent.a(0, (UpdateResponse)localObject2);
    } while (!UmengUpdateAgent.g());
    ((Activity)this.a).runOnUiThread(new e(this, (UpdateResponse)localObject2));
    return;
    UmengUpdateAgent.a(1, null);
  }
  
  public void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
      UmengUpdateAgent.a(1, null);
      Log.a(UmengUpdateAgent.d(), "reques update error", localException);
    }
  }
  
  public boolean shouldCompressData()
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\update\UmengUpdateAgent$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */