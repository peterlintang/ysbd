package com.umeng.fb.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.umeng.common.b.g;
import com.umeng.fb.a;
import com.umeng.fb.a.a;
import com.umeng.fb.b;
import com.umeng.fb.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d
  extends Thread
{
  private static ExecutorService b = Executors.newFixedThreadPool(3);
  private Context a;
  
  public d(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public void run()
  {
    int j = 0;
    Object localObject2 = new ArrayList();
    Object localObject1 = this.a.getSharedPreferences("feedback", 0);
    Object localObject3 = ((SharedPreferences)localObject1).getAll().keySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      String str = ((SharedPreferences)localObject1).getString((String)((Iterator)localObject3).next(), null);
      if ((!g.c(str)) && (str.indexOf("fail") != -1)) {
        try
        {
          ((List)localObject2).add(new b(new JSONArray(str)));
        }
        catch (Exception localException) {}
      }
    }
    localObject2 = ((List)localObject2).iterator();
    int k;
    int i;
    Object localObject4;
    Object localObject5;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (b)((Iterator)localObject2).next();
      if ((((b)localObject3).b != b.a.d) && (((b)localObject3).b != b.a.a))
      {
        Iterator localIterator = ((b)localObject3).f.iterator();
        k = -1;
        i = j;
        j = i;
        if (localIterator.hasNext())
        {
          localObject4 = (a)localIterator.next();
          k += 1;
          if (((a)localObject4).g != a.a.b) {
            break label372;
          }
          localObject5 = ((SharedPreferences)localObject1).getString(((b)localObject3).c, null);
        }
      }
    }
    label372:
    for (;;)
    {
      try
      {
        localObject5 = new JSONArray((String)localObject5);
        ((JSONArray)localObject5).put(k, ((a)localObject4).h.put("state", a.a.d));
        ((SharedPreferences)localObject1).edit().putString(((b)localObject3).c, ((JSONArray)localObject5).toString()).commit();
        localObject4 = new f(((a)localObject4).h, this.a);
        b.submit((Callable)localObject4);
        i = 1;
      }
      catch (JSONException localJSONException) {}
      if (j != 0)
      {
        localObject1 = new Intent().setAction("postFeedbackFinished");
        this.a.sendBroadcast((Intent)localObject1);
      }
      return;
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */