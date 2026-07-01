package com.umeng.fb;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.fb.b.b;
import com.umeng.fb.ui.FeedbackConversations;
import com.umeng.fb.util.ActivityStarter;
import com.umeng.fb.util.FeedBackListener;
import java.util.Map;

public class UMFeedbackService
{
  private static NotificationType a;
  private static Context b;
  private static boolean c = false;
  public static FeedBackListener fbListener;
  
  private static void b(String paramString)
  {
    if (a == NotificationType.NotificationBar)
    {
      localObject2 = (NotificationManager)b.getSystemService("notification");
      localObject3 = new Notification(b.d(b), b.getString(com.umeng.fb.b.e.w(b)), System.currentTimeMillis());
      paramString = new Intent(b, FeedbackConversations.class);
      paramString.setFlags(131072);
      PendingIntent localPendingIntent = PendingIntent.getActivity(b, 0, paramString, 0);
      paramString = b.getPackageManager();
      try
      {
        paramString = paramString.getApplicationLabel(paramString.getApplicationInfo(b.getPackageName(), 128));
        localObject1 = paramString;
        if (paramString != null) {
          localObject1 = paramString + " : ";
        }
        ((Notification)localObject3).setLatestEventInfo(b, localObject1 + b.getString(com.umeng.fb.b.e.x(b)), b.getString(com.umeng.fb.b.e.y(b)), localPendingIntent);
        ((Notification)localObject3).flags = 16;
        ((NotificationManager)localObject2).notify(0, (Notification)localObject3);
        return;
      }
      catch (PackageManager.NameNotFoundException paramString)
      {
        for (;;)
        {
          if (f.h) {
            paramString.printStackTrace();
          }
          paramString = null;
        }
      }
    }
    Object localObject2 = (LinearLayout)LayoutInflater.from(b).inflate(com.umeng.fb.b.d.f(b), null);
    Object localObject3 = (TextView)((LinearLayout)localObject2).findViewById(com.umeng.fb.b.c.v(b));
    Object localObject1 = (TextView)((LinearLayout)localObject2).findViewById(com.umeng.fb.b.c.w(b));
    ((TextView)localObject1).setText(paramString);
    paramString = new AlertDialog.Builder(b).create();
    paramString.show();
    paramString.setContentView((View)localObject2);
    ((TextView)localObject3).setText(b.getString(com.umeng.fb.b.e.z(b)));
    ((Button)((LinearLayout)localObject2).findViewById(com.umeng.fb.b.c.x(b))).setOnClickListener(new c(paramString));
    localObject2 = (Button)((LinearLayout)localObject2).findViewById(com.umeng.fb.b.c.y(b));
    paramString = new d(paramString);
    ((Button)localObject2).setOnClickListener(paramString);
    ((TextView)localObject1).setOnClickListener(paramString);
  }
  
  public static void enableNewReplyNotification(Context paramContext, NotificationType paramNotificationType)
  {
    e locale = new e();
    b = paramContext;
    a = paramNotificationType;
    new com.umeng.fb.a.e(paramContext, locale).start();
    new com.umeng.fb.a.d(paramContext).start();
    c = true;
  }
  
  public static boolean getHasCheckedReply()
  {
    return c;
  }
  
  public static void openUmengFeedbackSDK(Context paramContext)
  {
    ActivityStarter.openSendFeedbackActivity(paramContext);
  }
  
  public static void setContactMap(Map<String, String> paramMap)
  {
    ActivityStarter.contactMap = paramMap;
  }
  
  public static void setFeedBackListener(FeedBackListener paramFeedBackListener)
  {
    fbListener = paramFeedBackListener;
  }
  
  public static void setGoBackButtonVisible()
  {
    ActivityStarter.useGoBackButton = true;
  }
  
  public static void setRemarkMap(Map<String, String> paramMap)
  {
    ActivityStarter.remarkMap = paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\UMFeedbackService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */