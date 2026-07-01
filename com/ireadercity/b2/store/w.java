package com.ireadercity.b2.store;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class w
  extends Handler
{
  w(CloudStoreBookDetailActivity paramCloudStoreBookDetailActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    new StringBuilder("dataType=").append(CloudStoreBookDetailActivity.f(this.a)).toString();
    switch (paramMessage.what)
    {
    case 0: 
    default: 
      return;
    case 2: 
      if (CloudStoreBookDetailActivity.f(this.a) == 93) {}
      for (String str = "取消收藏成功！";; str = "加入收藏成功！")
      {
        paramMessage = (String)paramMessage.obj;
        new StringBuilder("output=").append(paramMessage).toString();
        CloudStoreBookDetailActivity.c(this.a).setText(str);
        CloudStoreBookDetailActivity.c(this.a).show();
        return;
      }
    }
    CloudStoreBookDetailActivity.f(this.a);
    CloudStoreBookDetailActivity.c(this.a).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */