package com.ireadercity.b2.g;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.iflytek.speech.SpeechUtility;

final class g
  extends Handler
{
  g(a parama) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      Object localObject = SpeechUtility.getUtility(a.e(this.a)).getComponentUrl();
      a locala = this.a;
      a.e(this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)localObject)));
      localObject = new Message();
      ((Message)localObject).what = 1;
      a.b(this.a).sendMessage((Message)localObject);
      continue;
      if (a.f(this.a) != null)
      {
        a.f(this.a).dismiss();
        continue;
        Toast.makeText(a.e(this.a), "无本地发音人资源，请到讯飞语音+中下载发音人！", 1).show();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\g\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */