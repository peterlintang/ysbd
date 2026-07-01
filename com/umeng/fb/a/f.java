package com.umeng.fb.a;

import android.content.Context;
import android.content.Intent;
import com.umeng.fb.util.a;
import com.umeng.fb.util.b;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class f
  implements Callable<Boolean>
{
  static String a = "MsgWorker";
  JSONObject b;
  Context c;
  
  public f(JSONObject paramJSONObject, Context paramContext)
  {
    this.b = paramJSONObject;
    this.c = paramContext;
  }
  
  public Boolean a()
  {
    String str2 = this.b.optString("type");
    String str3 = this.b.optString("feedback_id");
    Object localObject1;
    String str1;
    Object localObject2;
    if ("user_reply".equals(str2))
    {
      localObject1 = "user_reply";
      str1 = "http://feedback.whalecloud.com/feedback/reply";
      localObject2 = "reply";
    }
    try
    {
      for (;;)
      {
        localObject2 = a.a(str1, (String)localObject2, this.b).a();
        localObject1 = new Intent().setAction("postFeedbackFinished").putExtra("type", (String)localObject1).putExtra("feedback_id", str3);
        if (!b.a((JSONObject)localObject2)) {
          break;
        }
        b.e(this.b);
        ((Intent)localObject1).putExtra("PostFeedbackBroadcast", "succeed");
        if (!"user_reply".equals(str2)) {
          break label178;
        }
        com.umeng.fb.util.c.b(this.c, this.b);
        this.c.sendBroadcast((Intent)localObject1);
        return null;
        localObject1 = "new_feedback";
        str1 = "http://feedback.whalecloud.com/feedback/feedbacks";
        localObject2 = "feedback";
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        Object localObject3 = null;
        continue;
        b.c(this.b);
        ((Intent)localObject1).putExtra("PostFeedbackBroadcast", "fail");
        continue;
        label178:
        com.umeng.fb.util.c.a(this.c, "feedback", str3);
        com.umeng.fb.util.c.a(this.c, this.b);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */