package android.support.v4.app;

import android.app.Notification;

class NotificationCompat$NotificationCompatImplBase
  implements NotificationCompat.NotificationCompatImpl
{
  public Notification build(NotificationCompat.Builder paramBuilder)
  {
    Notification localNotification = paramBuilder.mNotification;
    localNotification.setLatestEventInfo(paramBuilder.mContext, paramBuilder.mContentTitle, paramBuilder.mContentText, paramBuilder.mContentIntent);
    if (paramBuilder.mPriority > 0) {
      localNotification.flags |= 0x80;
    }
    return localNotification;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\NotificationCompat$NotificationCompatImplBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */