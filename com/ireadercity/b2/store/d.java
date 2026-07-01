package com.ireadercity.b2.store;

import android.os.Handler;
import android.os.Message;
import android.view.View;

final class d
  extends Handler
{
  d(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    new StringBuilder("message.what=").append(paramMessage.what).toString();
    switch (paramMessage.what)
    {
    default: 
    case 0: 
    case 2: 
      do
      {
        return;
        CloudStoreActivity.a.d.setVisibility(0);
        return;
        paramMessage = (String)paramMessage.obj;
        new StringBuilder(" getCategoryHandler output=").append(paramMessage).toString();
        this.a.c(paramMessage);
        CloudStoreActivity.a.d.setVisibility(8);
      } while ((paramMessage != null) && (paramMessage.trim().length() != 0));
      CloudStoreActivity.a.j.setVisibility(0);
      return;
    }
    CloudStoreActivity.a.d.setVisibility(8);
    CloudStoreActivity.a.j.setVisibility(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */