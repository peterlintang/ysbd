package com.umeng.fb.util;

import android.content.Context;
import android.content.Intent;
import com.umeng.fb.b;
import com.umeng.fb.b.a;
import com.umeng.fb.ui.FeedbackConversation;
import com.umeng.fb.ui.FeedbackConversations;
import com.umeng.fb.ui.SendFeedback;
import java.util.Map;

public class ActivityStarter
{
  public static Map<String, String> contactMap = null;
  public static Context lastContext;
  public static Map<String, String> remarkMap = null;
  public static boolean useGoBackButton = false;
  public static Context userContext = null;
  
  static
  {
    lastContext = null;
  }
  
  public static void openDetailActivity(Context paramContext, b paramb)
  {
    if (userContext == null) {
      userContext = paramContext;
    }
    FeedbackConversation.setUserContext(paramContext);
    Intent localIntent = new Intent(paramContext, FeedbackConversation.class);
    localIntent.setFlags(131072);
    localIntent.putExtra("feedback_id", paramb.c);
    paramContext.startActivity(localIntent);
  }
  
  public static void openFeedbackListActivity(Context paramContext)
  {
    if (userContext == null) {
      userContext = paramContext;
    }
    Intent localIntent = new Intent(paramContext, FeedbackConversations.class);
    localIntent.setFlags(131072);
    paramContext.startActivity(localIntent);
  }
  
  public static void openSendFeedbackActivity(Context paramContext)
  {
    if (userContext == null) {
      userContext = paramContext;
    }
    for (;;)
    {
      openSendFeedbackActivity(paramContext, null);
      return;
      if ((paramContext instanceof FeedbackConversations)) {
        lastContext = paramContext;
      }
    }
  }
  
  public static void openSendFeedbackActivity(Context paramContext, b paramb)
  {
    Intent localIntent = new Intent(paramContext, SendFeedback.class);
    localIntent.setFlags(131072);
    if ((paramb != null) && (paramb.b == b.a.b)) {
      localIntent.putExtra("feedback_id", paramb.c);
    }
    paramContext.startActivity(localIntent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\util\ActivityStarter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */