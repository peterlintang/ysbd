package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class TaskStackBuilder$TaskStackBuilderImplJellybean
  implements TaskStackBuilder.TaskStackBuilderImpl
{
  public PendingIntent getPendingIntent(Context paramContext, Intent[] paramArrayOfIntent, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    paramArrayOfIntent[0] = new Intent(paramArrayOfIntent[0]).addFlags(268484608);
    return TaskStackBuilderJellybean.getActivitiesPendingIntent(paramContext, paramInt1, paramArrayOfIntent, paramInt2, paramBundle);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\TaskStackBuilder$TaskStackBuilderImplJellybean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */