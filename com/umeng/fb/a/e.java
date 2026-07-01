package com.umeng.fb.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.b.g;
import com.umeng.fb.util.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public class e
  extends Thread
{
  static final String a = e.class.getSimpleName();
  Context b;
  String c = "http://feedback.whalecloud.com/feedback/reply";
  String d;
  String e;
  int f = 0;
  Handler g;
  
  public e(Context paramContext)
  {
    this.b = paramContext;
    this.d = com.umeng.common.b.p(paramContext);
    this.e = com.umeng.common.b.g(paramContext);
  }
  
  public e(Context paramContext, Handler paramHandler)
  {
    this(paramContext);
    this.g = paramHandler;
  }
  
  public void run()
  {
    Object localObject4 = this.b.getSharedPreferences("feedback", 0).getAll().keySet().iterator();
    Object localObject1 = "";
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (String)((Iterator)localObject4).next();
      if (((String)localObject1).length() == 0) {
        localObject1 = localObject3;
      } else {
        localObject1 = (String)localObject1 + "," + (String)localObject3;
      }
    }
    Object localObject3 = this.b.getSharedPreferences("UmengFb_Nums", 0).getString("maxReplyID", "RP0");
    if (g.c((String)localObject1)) {
      return;
    }
    this.c = (this.c + "?appkey=" + this.d + "&feedback_id=" + (String)localObject1);
    if (!((String)localObject3).equals("RP0")) {
      this.c = (this.c + "&startkey=" + (String)localObject3);
    }
    localObject1 = a;
    localObject1 = this.c;
    localObject1 = com.umeng.fb.util.a.a(this.c);
    localObject3 = new Intent();
    ((Intent)localObject3).setAction("RetrieveReplyBroadcast");
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = new JSONArray((String)localObject1);
        localObject1 = c.a(this.b, (JSONArray)localObject1);
        localObject4 = a;
        new StringBuilder("newReplyIds :").append((String)localObject1).toString();
        if ((((String)localObject1).length() == 0) || (((String)localObject1).split(",").length == 0))
        {
          ((Intent)localObject3).putExtra("RetrieveReplyBroadcast", 0);
          this.b.sendBroadcast((Intent)localObject3);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
        Object localObject2 = null;
        continue;
        ((Intent)localObject3).putExtra("RetrieveReplyBroadcast", 1);
        if (this.g == null) {
          continue;
        }
        localObject2 = ((String)localObject2).split(",");
        int i = localObject2.length;
        localObject2 = c.b(this.b, localObject2[(i - 1)]).e;
        localObject4 = new Message();
        Bundle localBundle = new Bundle();
        localBundle.putString("newReplyContent", ((com.umeng.fb.a)localObject2).a());
        ((Message)localObject4).setData(localBundle);
        this.g.sendMessage((Message)localObject4);
        continue;
      }
      ((Intent)localObject3).putExtra("RetrieveReplyBroadcast", -1);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */